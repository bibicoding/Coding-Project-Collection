#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <conio.h>
#include <io.h>
#define LEN 100

int main(int argc, char *argv[]) {
  	FILE *fptr;
	char fpath[LEN];
	char pid[5], pname[30], str_price[5];
	int fno, fsize, price=0;
	printf("請選擇項目-->1.開新檔  2.開舊檔：");
	if(getche()=='1'){
		printf("\n請輸入新檔案路徑：");
		gets(fpath);
		fptr=fopen(fpath, "w+");	/*以建立新檔的模式開檔*/
	}
	else{
		printf("\n請輸入欲開啟的檔案路徑：");
		gets(fpath);
		fptr=fopen(fpath, "a+");	/*以附加資料的模式開檔*/
	}
	if(fptr==NULL){
		printf("\n開檔失敗, %s 可能不存在\n", fpath);
		exit(0);
	}
	fno=fileno(fptr);
	fsize=filelength(fno);
	printf("\n%s 開檔完成, 原檔案大小 %d Bytes\n", fpath, fsize);
	while(1){
		printf("\n請問是否要繼續新增資料(Y/N)：");
		if(toupper(getche())=='Y'){	/* 按'y'或'Y'表示要新增資料 */
			printf("\n請輸入要新增的資料->\n");
			printf("編號：");
			gets(pid);			/*輸入編號*/
			printf("品名：");
			gets(pname);		/*輸入品名*/
			printf("單價：");
			gets(str_price);		/*輸入單價指定給str_price字串 */
			price=atoi(str_price);/*將str_price字串轉成整數並指定給price */
			/* 將pid, pname, price寫入到fptr所指的檔案緩衝區中 */
			fprintf(fptr, "%s %s %d\n", pid, pname, price);
		}
		else{
			fclose(fptr);	/*關閉檔案*/
			break;	
		}
	}
	fptr=fopen(fpath, "r");	
	fno=fileno(fptr);				/* 取得檔案代碼 */
	fsize=filelength(fno);			/* 取得檔案大小 */
	printf("\n資料更新完成...");
	printf("\n%s 目前檔案大小 %d Bytes\n", fpath, fsize);
	printf("%s 資料檔內容如下\n", fpath);
	/* 若檔案指標fptr還沒有指到檔案結尾，則印出資料檔的資料 */
	while(fscanf(fptr, "%s %s %d", pid, pname, &price)!=EOF){
		printf("%5s %15s %5d\n", pid, pname, price);/* 將讀取的資料印出 */
	}
	fclose(fptr);	/*關閉檔案*/
	printf("\n");
    system("PAUSE");	
	return 0;
}
