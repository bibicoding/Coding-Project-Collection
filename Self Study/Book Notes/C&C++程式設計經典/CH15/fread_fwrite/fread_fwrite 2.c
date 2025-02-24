#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <conio.h>
#include <io.h>
#define LEN 100

typedef struct 			/*定義資料結構*/
{
	char id[6];			/*編號*/
	char title[30];		/*歌名*/
	int year;			/*年度*/
	int rank;			/*排名*/
	char flag[3];		/*刪除旗標*/
}song;

int main(int argc, char *argv[]) {
  	FILE *fptr;
	char fpath[LEN], t_year[10], t_rank[10];
	int fno, fsize, rectot;
	song mysong;
	printf("請選擇項目->1.開新檔  2.開舊檔：");
	if(getche()=='1'){
		printf("\n請輸入新檔案路徑：");
		gets(fpath);
		fptr=fopen(fpath, "w+");
	}
	else{
		printf("\n請輸入欲開啟的檔案路徑：");
		gets(fpath);
		fptr=fopen(fpath, "a+");
	}
	if(fptr==NULL){
		printf("\n開檔失敗, %s 可能不存在\n", fpath);
		exit(0);
	}
	while(1){
		printf("\n請問是否要繼續新增資料(Y/N)：");
		if(toupper(getche())=='Y'){
			printf("\n請輸入要新增的資料->\n");
			printf("編號：");
			gets(mysong.id);		
			printf("歌名：");
			gets(mysong.title );
			printf("年度：");
			gets(t_year);
			mysong.year = atoi(t_year);
			printf("排名：");
			gets(t_rank);
			mysong.rank = atoi(t_rank);
			fwrite(&mysong, sizeof(mysong), 1, fptr);/*將結構寫入檔案*/
		}
		else{
			fclose(fptr);
			break;	
		}
	}
	fptr=fopen(fpath, "r");	
	fno=fileno(fptr);
	fsize=filelength(fno);
	rectot=filelength(fileno(fptr))/sizeof(song);	/*取得記錄總筆數*/
	printf("\n資料更新完成...");
	printf("\n%s 目前檔案大小 %d Bytes\n", fpath, fsize);
	printf("%s 資料檔內容如下\n", fpath);
	printf("\n記錄總筆數：%d\n", rectot);
	printf("%6s %30s %5s %5s\n","編號", "歌名", "年度", "排名");
	/* 判斷是否還有資料*/
	while(fread(&mysong, sizeof(mysong), 1, fptr)!=NULL){
		/*取出一筆記錄，檔案指標再往後移動一筆記錄的長度*/
		printf("%6s %30s %5d %5d\n", 
			mysong.id, mysong.title, mysong.year, mysong.rank);
	}
	fclose(fptr);
	printf("\n");
    system("PAUSE");	
	return 0;
}
