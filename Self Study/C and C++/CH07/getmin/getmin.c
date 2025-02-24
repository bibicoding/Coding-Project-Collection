#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) 
{
	int a[5]={0};		/* 宣告data陣列，陣列元素為a[0]~a[4], 初始值皆為0 */
	int i=0, min;		/* min整數變數代表最小值 */
	printf("-----尋找最小值-----\n");
	printf("請連續輸入五個數值-\n");
	for(i=0;i<5;i++)		/* 連續輸入5個整數並存放到a[0]~a[4] */
	{
	   printf("請輸入第 %d 個資料：", i+1 );
	   scanf("%d", &a[i]);  /* scanf_s() for VC++ */
	}
	min=a[0];			/* 假設a[0]為最小值 */
	for(i=0;i<5;i++)		/* 使用迴圈逐一找出a[0]~a[4]的最小值 */
	{
	  if (min>a[i])	
	  {
		  min=a[i];
	  }
	}
	printf("最小值：%d\n\n",min); 
	
	system("PAUSE");	
	return 0;
}
