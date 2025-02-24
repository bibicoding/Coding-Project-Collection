#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char *argv[]) {
	int lot[49];		/* 陣列元素為lot[0]~lot[48]  */
	int choose[7];	    /* 陣列元素為choose[0]~choose[6] */
	int min=1, max=49, num=7;
	int max_dim, choice;
	int i;
	max_dim=max-min+1;
	for(i=0;i<max_dim;i++)
	{
		lot[i]=min+i;
	}
	srand((unsigned)time(NULL));/*亂數種子器*/
	for(i=0;i<num;i++)
	{
       choice=rand()%max_dim;   /* 產生亂數 */
       choose[i]=lot[choice];   /* 隨機取一個號碼 */
       /* 陣列最後一個號碼移到目前選取號碼陣列元素的位置 */
       lot[choice]=lot[max_dim-1];    
       max_dim--;
	}
	printf("\n 本期大樂透 電腦選號 號碼如下：\n\n");
	for(i=0; i<num; i++)					/* 印出大樂透的6個號碼 */
	{
		printf(" %d", choose[i]);
	}
	printf("\n\n 特別號： %d \n", choose[6]);	/* 印出大樂透的特別號 */   
	printf("\n\n");
	system("PAUSE");
	return 0;
}
