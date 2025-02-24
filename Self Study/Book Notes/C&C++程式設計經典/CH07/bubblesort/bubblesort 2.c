#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
 		int data[5];	/* 宣告data陣列，用來存放使用者所輸入的5個整數 */
		int n, i, j, t;
		printf("== 氣泡排氣法(由小到大排序)==\n\n");
		printf("...請連續輸入五個數值(資料間空一格)...\n\n");
		/*輸入排序前的資料*/
		printf(" 排序前：");
		for(i=0;i<5;i++) /* 使用者輸入的整數會依序存放在data[0]~data[4] */
		{
			scanf("%d", &n);
			data[i]=n;
		}
		/*氣泡排序法*/
		for(i=3;i>=0;i--)
		{
			for(j=0;j<=i;j++)
			{
				if(data[j]>data[j+1])
			{
					t=data[j];			/*交換資料*/
					data[j]=data[j+1];
					data[j+1]=t;
				}
			}
		}
		/*印出排序後的資料*/
		printf("\n 排序後：");
		for(i=0;i<5;i++)
		{
			printf("%d ", data[i]);
		}
	printf("\n\n");
	system("PAUSE");	
return 0;
}
