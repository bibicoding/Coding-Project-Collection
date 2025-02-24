#include <stdio.h>
#include <stdlib.h>


int main(int argc, char *argv[]) {
	/* count預設-1表示未找到符合資料，search_num為欲查詢的資料 */
	int data[5];  
	/* count>0表陣列中第幾個資料 */
	int i, search_num, count=-1, *ptr; 
	ptr=data;                   /* ptr指到陣列的起始位置 */
	printf(" =======  循序搜尋法 ======= \n");
	printf("  ----   請連續輸入五個數值 ---\n");
	printf("\n");
	for(i=0;i<5;i++)
		{
		printf("請輸入第%d個值 : ",i+1);
		scanf("%d", ptr+i);/* 輸入值放入ptr所指陣列第i個元素 scanf_s()VC++  */
		}
		printf("\n");
		printf(" 請輸入搜尋的數值：");
		scanf("%d", &search_num);  /* 輸入查詢值， scanf_s()VC++  */
		for(i=0;i<5;i++)
		{
			if (*(ptr+i)==search_num) /* 檢查ptr所指陣列元素是否與查詢值相等*/
			{
				count=i; break;
		}
	}
	printf(" ========================\n");
	if(count==-1)                   /* 判斷是否有找到資料 */
	{
		printf(" 沒有這個數字 -> %d \n", search_num);
	}
	else
	{
		printf(" %d 是第 %d 個數字 !  \n", search_num, (count+1));
	}
	system("PAUSE");	
	return 0;
}
