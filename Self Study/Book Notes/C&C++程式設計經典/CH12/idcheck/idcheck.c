#include <stdio.h>
#include <stdlib.h>

#include <conio.h>
#include <ctype.h>
#include <string.h>

void checkid(char *);  /*checkid函式原型宣告*/

int main(int argc, char *argv[]) {
	/*宣告id字元陣列，用來存放身分證號碼*/
	char id[11];  
	char goon;
	printf(" == 身分證號碼驗證程式 ==\n");
	do{
		printf("\n 請輸入身分證號碼：");
		/* 輸入身分證號碼並存放到id字元陣列(字串) */
		gets(id);
		/* 呼叫checkid()函式檢查id字串是否為合法號碼 */
		checkid(id);
		printf("\n 是否繼續？(Y/N) :");
		goon = toupper(getche());  /*輸入字元轉成大寫英文字再指定給ch變數*/
		printf("\n\n");
	}while(goon == 'Y');  /*判斷goon是否為'Y'，若是繼續執行迴圈內的敘述，否則離開迴圈*/
	
	system("PAUSE");
	return 0;
}

void checkid(char *idptr){  /* 定義checkid函式 */
	int first_no, n;
	int head[] = {  /* 身份證號碼第一個字母轉換表  */
		10,11,12,13,14,15,16,17,
		34,18,19,20,21,22,35,23,24,
		25,26,27,28,29,32,30,31,33
	};
	/*取得idptr所指字串及傳入的身份證號碼的長度 */
	if(strlen(idptr) != 10){
		printf("\n 身分證號碼不合法！@_@\n");
		return;
	}
	/* 取得第一個字母的兩位數值*/
	first_no=head[toupper(idptr[0])-'A']; 
	n = (first_no / 10) +  /* 代入公式計算總和 */
		(first_no % 10) * 9 +
		(idptr[1] - '0') * 8 +
		(idptr[2] - '0') * 7 +
		(idptr[3] - '0') * 6 +
		(idptr[4] - '0') * 5 +
		(idptr[5] - '0') * 4 +
		(idptr[6] - '0') * 3 +
		(idptr[7] - '0') * 2 +
		(idptr[8] - '0') +
		(idptr[9] - '0');
	if((n % 10) == 0)  /* 除以10取餘數，判斷是否為0  */
	{
		printf("\n 身分證號碼正確！^_^\n");
	}
	else{
		printf("\n 身分證號碼不正確！@_@\n");
	}
}

