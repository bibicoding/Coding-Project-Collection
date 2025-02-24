#include <stdio.h>
#include <stdlib.h>

#include <io.h>
#define LEN 100

int main(int argc, char *argv[]) {
  	FILE *fptr;
	char fpath[LEN] ;
	int fno, fsize;
	char ch;
	printf("請輸入要開啟檔案的完整路徑及檔名：");
	gets(fpath);
	fptr=fopen(fpath, "r");
	if(fptr==NULL){
		printf("\n開檔失敗, %s 可能不存在\n", fpath);
	    system("PAUSE");
		exit(0);
	}
	fno=fileno(fptr);
	fsize=filelength(fno);
	printf("\n%s 開檔完成, 檔案大小 %d Bytes\n", fpath, fsize);
	printf("%s 資料檔內容如下\n", fpath);
	while((ch=fgetc(fptr))!=EOF){
		printf("%c", ch);
	}
	fclose(fptr);
	printf("\n\n");
    system("PAUSE");	
	return 0;
}
