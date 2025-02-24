#include <stdio.h>
#include <stdlib.h>

void bubblesort(int[],int);

int main(int argc, char *argv[])
{
	int myArray[]={31,12,16,10,78};
	int i, n;
    n=sizeof(myArray)/sizeof(int);	/*取得陣列元素的個數並指定給n*/
	printf("排序前：");
	for(i=0;i<n;i++)
	{
		printf(" %d", myArray[i]);
	}
	printf("\n\n");
	bubblesort(myArray,n);		/*呼叫bubblesort函式*/
	printf("排序後：");
	for(i=0;i<n;i++)
	{
		printf(" %d", myArray[i]);
	}
	printf("\n\n");
    system("PAUSE");	
    return 0;
}

void bubblesort(int tArray[], int index)
{
	int i, j, t;
	for(i=index-2 ; i>=0 ; i--)	 	/* 氣泡排序法排序 */
	{
		for(j=0;j<=i;j++)
		{
			if(tArray[j]>tArray[j+1])
			{
				t=tArray[j];
				tArray[j]=tArray[j+1];
				tArray[j+1]=t;
			}
		}
	}
}
 
