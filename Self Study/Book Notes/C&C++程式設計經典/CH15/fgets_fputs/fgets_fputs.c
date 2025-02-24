#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <conio.h>
#include <io.h>
#define LEN 100

int main(int argc, char *argv[]) {
  	FILE *fptr;
	char fpath[LEN], keyin[LEN], t[LEN];
	int fno, fsize;
	printf("請選擇項目->1.開新檔  2.開舊檔：");
	if(getche()=='1'){
		printf("\n請輸入新檔案路徑：");
		gets(fpath);
		fptr=fopen(fpath, "w+");	/*讀寫新檔*/
	}
	else{
		printf("\n請輸入欲開啟的檔案路徑：");
		gets(fpath);
		fptr=fopen(fpath, "a+");	/*讀寫附加檔案模式*/
	}
	if(fptr==NULL){
		printf("\n開檔失敗, %s 可能不存在\n", fpath);
		exit(0);
	}
	fno=fileno(fptr);			/* 取得檔案代碼 */
	fsize=filelength(fno);		/* 取得檔案大小 */
	printf("\n%s 開檔完成, 原檔案大小 %d Bytes\n", fpath, fsize);
	while(1){
		printf("\n請問是否要繼續新增資料(Y/N)：");
		if(toupper(getche())=='Y')	{
			printf("\n請輸入要新增的資料：");
			gets(keyin);		/*使用者輸入字串指定給keyin*/
			fputs(keyin, fptr);	/*keyin字串寫入fptr所指的檔案*/
			fputs("\n", fptr);	/*將換行字元寫入fptr所指的檔案*/
		}
		else{
			fclose(fptr);
			break;	
		}
	}
	fptr=fopen(fpath, "r");	
	fno=fileno(fptr);			/*取得檔案代碼*/
	fsize=filelength(fno);		/*取得檔案大小*/
	printf("\n資料更新完成...");
	printf("\n%s 目前檔案大小 %d Bytes\n", fpath, fsize);
	printf("%s 資料檔內容如下\n", fpath);
	while(fgets(t, LEN, fptr)!=NULL){	/* 以字串的方式讀取資料檔中的資料 */
		printf("%s", t);
	}
	fclose(fptr);
	printf("\n");
    system("PAUSE");	
	return 0;
}
