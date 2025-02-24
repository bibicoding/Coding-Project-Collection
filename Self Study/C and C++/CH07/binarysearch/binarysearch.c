#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
		int data[5];
		int n, i, j, t;
	     /* num:要搜尋陣列的註標位置	:midNum:找尋陣列中間的註標 */
		int searchNum, num=-1, low=0, high=4, midNum=0; /* searchNum:搜尋值*/
		printf("======  二分搜尋法 ======\n\n");
		printf(" 連續輸入五個數字(數字間空一格) : \n\n");
		
		/*輸入排序前的資料*/
		printf(" 排序前：");
		for(i=0;i<5;i++)
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
					t=data[j];
					data[j]=data[j+1];
					data[j+1]=t;
				}
			}
		}
		/*印出排序後的資料*/
		printf(" 排序後：");
		for(i=0;i<5;i++)
		{
			printf("%d ", data[i]);
		}
		printf("\n\n");
		/*輸入要搜尋的數字*/
		printf(" 請輸入要搜尋的數字：");
		scanf("%d", &searchNum);	
		/*二分搜尋法*/
		do
		{
			midNum=(low+high)/2;
			if(data[midNum]==searchNum)
			{
				num=midNum;
				break;
			}
			if(data[midNum]>searchNum)
			{
				high=midNum-1;
			}
			else
			{
				low=midNum+1;
			}
		}while(low<=high);
		if(num==-1)
		{
			printf("\n Sorry ! 找不到 %d 這個數字 ... \n", searchNum);
		}
		else
		{
			printf("\n Find ! 位於排序後第 %d個位置 ...\n", (num+1));
		}
	printf("\n\n");
	system("PAUSE");	
	return 0;
}
