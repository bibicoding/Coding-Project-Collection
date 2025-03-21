#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define BUFSIZE 80			/*  輸入字串最長限80個字元 */
#define MSG1 " 請輸入英文字串："
#define MSG2 " 字串反向顯示："
char *reverse(char[]);

int main(int argc, char *argv[]) {
	char str1[BUFSIZE];
	char *ptr1;
	printf("\n%s",MSG1);
	gets(str1);    	/*將輸入的字串指定給str1陣列  gets_s() for VC++  */
	/*呼叫reverse函式，並將new_ptr所指到字串的起始位址指定給ptr1*/
	ptr1=reverse(str1);
	printf("\n%s",MSG2);
	puts(ptr1);    
	printf("\n");
	system("PAUSE");	
	return 0;
}

char *reverse(char str2[])	/* 字串反轉函式*/
{
	char *ptr2, *new_ptr;    	/* 區域指標變數 */
	int i, j;
	int strcount=strlen(str2);	/* 取得字串長度*/
	new_ptr=(char*)malloc(sizeof(char)*strcount);  /* 動態配置記憶體 */
	ptr2=str2;             			/* ptr2指到陣列起始位址 */
	/*反轉字串並放入new_ptr所指向的位址*/
	for (i=strcount-1, j=0; i>=0 ; i--,j++)
	{
		*(new_ptr+j)=*(ptr2+i);	/* ptr2+i指到原字串的尾部 */
	}
	*(new_ptr+j)='\0'; 	/* 新字串尾部加上字串結束字元 */
	return new_ptr;    	/*將new_ptr所指字串的起始位址傳回*/

}
