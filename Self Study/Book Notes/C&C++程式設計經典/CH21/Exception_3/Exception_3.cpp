#include <iostream>
#include <cstdio>
#include <cstdlib>
#include <io.h>
#define LEN 100

using namespace std;

int main(int argc, char** argv) {
	FILE *fptr;
	char fpath[LEN] ;
	int fno, fsize;
	char ch;
	try{
		// 輸入檔案路徑並指定給fpath字元陣列 
		printf("請輸入要開啟檔案的完整路徑及檔名：");
		gets(fpath);		
		fptr=fopen(fpath, "r");  //以唯檔方式開檔並傳回檔案指標fptr	
		if(fptr==NULL) {   // 檔案指標傳回NULL，則丟出整數0 
			throw (0) ;
		}
		fno=fileno(fptr);		//取得檔案代碼 
		fsize=filelength(fno);  //取得檔案大小 
		printf("\n%s 開檔完成, 檔案大小 %d Bytes\n", fpath, fsize);
		printf("%s 資料檔內容如下\n", fpath);
		// 印出檔案內所有資料 
		while((ch=fgetc(fptr))!=EOF) {
    		printf("%c", ch);
		}
		fclose(fptr);
	}catch(int ex){   // 若丟出整數型別會執行此區塊，表示開檔失敗 
		printf("\n開檔失敗, %s 可能不存在\n", fpath);
		fclose(fptr);	
	}
	cout << endl;
	system("PAUSE");
	return 0;
}
