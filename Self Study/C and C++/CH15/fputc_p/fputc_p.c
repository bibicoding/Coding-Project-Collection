#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <conio.h>
#include <io.h>
#define LEN 100

int main(int argc, char *argv[]) {
  	FILE *fptr;
	char fpath[LEN], keyin[LEN];
	int fno, fsize, i;
	char ch;
	printf("寫檔作業...\n");
	printf("請輸入要開啟檔案的完整路徑及檔名：");
	gets(fpath);
	fptr=fopen(fpath, "a+");
	if(fptr==NULL){
		printf("\n開檔失敗, %s 可能不存在\n", fpath);
		exit(0);
	}
	while(1){
		printf("\n請問是否要繼續新增資料(Y/N)：");
		if(toupper(getche())=='Y')		{
			printf("\n請輸入要新增的資料：");
			gets(keyin);
			for(i=0; i<strlen(keyin) ; i++)			{
				fputc(keyin[i], fptr);
			}
			fputc('\n', fptr);
		}
		else		{
			fclose(fptr);
			break;	
		}
	}
	printf("\n\n");
    system("PAUSE");	
	return 0;
}
