#include <stdio.h>
#include <stdlib.h>

#include <io.h>
#define LEN 100

int main(int argc, char *argv[]) {
  	FILE *fptr;
	char fpath[LEN];
	int fno, fsize;
	printf(" 請輸入欲開啟的檔案路徑：");
	gets(fpath);			/* 使用者輸入欲開啟的檔案並指定給fpath */
	fptr=fopen(fpath, "r");	/* 開啟己經存在的檔案 */
	if(fptr==NULL){		/* 判斷是否開檔失敗 */
		printf("\n 開檔失敗, %s 可能不存在\n", fpath);
		system("PAUSE");
		exit(0);			/* 結束程式 */
	}
	fno=fileno(fptr);		/* 取得檔案代碼 */
	fsize=filelength(fno);	/* 取得檔案大小，以Byte為單位 */
	printf("\n %s 開檔完成, 檔案大小 %d Bytes\n", fpath, fsize);
	fclose(fptr);
    system("PAUSE");	
	return 0;
}
