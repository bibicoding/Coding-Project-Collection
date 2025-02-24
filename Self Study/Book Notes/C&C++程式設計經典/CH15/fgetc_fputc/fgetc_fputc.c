#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <conio.h>
#include <io.h>
#define LEN 100

int main(int argc, char *argv[]) {
  	FILE *fptr;				/* 宣告fptr檔案結構指標 */
	char fpath[LEN], keyin[LEN];
	int fno, fsize, i;
	char ch;
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
	fno=fileno(fptr);		/* 取得檔案代碼 */
	fsize=filelength(fno);	/* 取得檔案大小 */
	printf("\n%s 開檔完成, 原檔案大小 %d Bytes\n", fpath, fsize);
	while(1){
		printf("\n請問是否要繼續新增資料(Y/N)：");
		if(toupper(getche())=='Y'){
			printf("\n請輸入要新增的資料：");
			gets(keyin);
			for(i=0; i<strlen(keyin) ; i++){	
				fputc(keyin[i], fptr);	
			}
			fputc('\n', fptr);
		}
		else{
			fclose(fptr);
			break;	
		}
	}
	fptr=fopen(fpath, "r");	
	fno=fileno(fptr);
	fsize=filelength(fno);
	printf("\n\n資料更新完成...");
	printf("\n%s 目前檔案大小 %d Bytes\n", fpath, fsize);
	printf("%s 資料檔內容如下\n", fpath);
	while((ch=fgetc(fptr))!=EOF){
		printf("%c", ch);
	}
	fclose(fptr);
	printf("\n");
    system("PAUSE");	
	return 0;
}
