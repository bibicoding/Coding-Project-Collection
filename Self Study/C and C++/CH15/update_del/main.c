#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <conio.h>
#include <io.h>
#define LEN 100

typedef struct{			/*定義資料結構*/
	char id[6];			/*編號*/
	char title[30];		/*歌名*/
	int year;			/*年度*/
	int rank;			/*排名*/
	char flag[3];		/*刪除旗標*/
}song;

void showfiledata(FILE *, char[]);

int main(int argc, char *argv[]) {
	FILE *fptr;
	char fpath[LEN];
	char search_id[6], t_year[10], t_rank[10];
	song mysong;
	int recno = 0;		/*資料記錄編號*/
	char ch;
	printf("請輸入欲開啟的檔案路徑：");
	gets(fpath);
	fptr = fopen(fpath, "r+");
	if (fptr == NULL){
		printf("\n開檔失敗, %s 可能不存在\n", fpath);
		exit(0);
	}
	showfiledata(fptr, fpath);
	printf("\n請選擇項目->1.修改  2.刪除  3.離開：");
	ch = getche();
	if (ch == '3' && ch != '1' && ch != '2'){		/*選擇功能清單*/
		printf("\n\n結束程式...\n");
		fclose(fptr);
		exit(0);
	}
	printf("\n請輸入要異動記錄的編號：");
	gets(search_id);	/*輸入要查詢的編號*/
	rewind(fptr);		/*檔案指標移到檔案最開頭*/
	while (1){
		printf("recno1:%d\n",recno);
		/* 檔案指標移到最後結尾會傳回NULL，表示找不到資料 */
		if (fread(&mysong, sizeof(mysong), 1, fptr) == NULL){
			printf("\n沒有編號 %s 這筆記錄...\n", search_id);
			fclose(fptr);
			exit(0);
		}
		else{	/*找到資料*/
			/*判斷資料是否被刪除*/
			printf("recno2:%d\n",recno);
			if (strcmp(mysong.id, search_id) == 0 && 
						strcmp(mysong.flag, "*") != 0){
				if (ch == '1'){					/*輸入要修改的資料*/
					printf("修改作業...\n");
					printf("歌名改為->");
					gets(mysong.title);
					printf("年度改為->");
					gets(t_year);
					mysong.year = atoi(t_year);
					printf("排名改為->");
					gets(t_rank);
					mysong.rank = atoi(t_rank);
				}
				else if (ch == '2')	{					
					printf("刪除作業...\n");
					strcpy(mysong.flag, "*");/*將mysong.flag設為"*"*/
				}
				printf("確定要異動嗎(Y/N)？");	/*詢問是否執行異動資料的作業*/
				if (toupper(getche()) == 'Y') {
					/*檔案指標移到第recno筆資料位址*/
					fseek(fptr, sizeof(mysong)*recno, 0);
					/*將mysong 結構資料寫入檔案指標目前所指的資料位址*/
					fwrite(&mysong, sizeof(mysong), 1, fptr);
					break;
				}
				else {
					printf("\n\n放棄執行...\n");
					fclose(fptr);
					exit(0);
				}
			}
			else {
				recno++;	/*recno記錄編號加1，表示移到下一筆資料*/
			}
		}
	}
	printf("\n資料異動完成...\n");
	showfiledata(fptr, fpath);
	fclose(fptr);	
	printf("\n");
	system("PAUSE");
	return 0;
}

void showfiledata(FILE * vfptr, char vfpath[]){
	int rectot = 0;
	song vsong;
	rewind(vfptr);					/*檔案指標移到檔案最開頭*/
	printf("\n%s 資料檔內容如下\n", vfpath);
	printf("%6s %30s %5s %5s\n","編號", "歌名", "年度", "排名");
	while (fread(&vsong, sizeof(vsong), 1, vfptr) != NULL){
		if (strcmp(vsong.flag, "*") != 0){
			printf("%6s %30s %5d %5d\n",
				vsong.id, vsong.title, vsong.year, vsong.rank);
			rectot++;
		}
	}
	printf("記錄總筆數：%d\n", rectot);
	//fclose(vfptr);
}

