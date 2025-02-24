#include <stdio.h>
#include <stdlib.h>

int comb(int, int);	/*宣告comb函式原型*/

int main(int argc, char *argv[])
{
	int numN, numM, ans;
	printf(" 請輸入要計算組合的兩個數。\n");
	printf(" 請輸入第一個數 n：");
	scanf("%d", &numN);
	printf(" 請輸入第二個數 m：");
	scanf("%d", &numM);
	if(numN>=numM)
	{
		ans=comb(numN, numM);
		printf("\n 組合公式 comb(%d,%d)=%d\n\n",numN, numM, ans);
	}
	else
	{
		printf("\n 數值 n 必須大於 m \n\n");
	}
   system("PAUSE");	
   return 0;
}

int comb(int n, int m)
{
	if(n==m || m==0)
	{
		return 1;
	}
	else
	{
		return comb(n-1, m)+comb(n-1, m-1);	
	}
}

  
