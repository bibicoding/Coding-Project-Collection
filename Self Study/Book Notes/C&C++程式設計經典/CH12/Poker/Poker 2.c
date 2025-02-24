#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#define CARDS 52

int main(int argc, char *argv[]) {
	/*存放原撲克牌card[1]~card[52] 值 */
	int card[CARDS+1];        
	/*存放洗牌後suffle_card[1]~suffle_card[52]值*/
	int suffle_card[CARDS+1]; 
	int rem_card;    /* 剩下牌數 */
	int i, k,index;
	/*player[0]~play[4]東西南北四家*/
	char *player[5]={"","東","西","南","北"}; 
	/* 此迴圈設定card[1]~card[52]分別存入1~52 */
	for(i=1;i<=CARDS;i++) 
	{
		card[i]=i;
	}
	rem_card=CARDS;
	srand((unsigned)time(NULL));	/*亂數種子器*/
	for(i=1;i<=CARDS;i++)				/*洗牌  */
	{
    	/*亂數產生1~(剩餘牌數+1)當card陣列的註標*/
		index=rand()%rem_card+1; 
		suffle_card[i]=card[index];
		for(k=index;k<rem_card;k++)
		{
        	/*將card陣列註標為index後面的元素上移一位*/
			card[k]=card[k+1]; 
		}
		rem_card--;
	}
	k=1;
	for(i=1; i<=CARDS; i++)   /* 按東、西、南、北四家發牌 */
	{
		if(i%13==1) 
		{
			printf("\n\n");
			printf("=== %s 方 牌 === \n", player[k]);
			k++;
		}
		if(suffle_card[i]>=1 && suffle_card[i]<=13)
		{
			printf("黑桃%2d ",suffle_card[i]%13+1);
		}
		else if(suffle_card[i]>=14 && suffle_card[i]<=26)
		{
			printf("紅桃%2d ",suffle_card[i]%13+1);
		}
		else if(suffle_card[i]>=27 && suffle_card[i]<=39)
		{
			printf("黑花%2d ",suffle_card[i]%13+1);
		}
		else if(suffle_card[i]>=40 && suffle_card[i]<=52)
		{
			printf("紅磚%2d ",suffle_card[i]%13+1);
		}
	}
	printf("\n\n");
	system("PAUSE");	
	return 0;
}
