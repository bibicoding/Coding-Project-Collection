#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <ctype.h>
#define MAXSIZE 10
#define MSG "Press any key to continue..."
void push(void);
void pop(void);
void printout(void);
int stack[MAXSIZE];
int i=1,choose; 		/* i:筆數  choose:選項 */
int *sptr, *full, *empty;

int main(int argc, char *argv[]) {
	sptr=stack;	      	/* sptr指標指到stack[0]位址 */
	empty=stack; 	        	/* empty指標指到stack[0]位址*/
	full=stack+MAXSIZE-1;	/* full指標指到stack[9]位址 */
	do
	{
		printf(" \n ===  Stack Operation  ===");
		printf(" \n   1. Push Operation ");
		printf(" \n   2. Pop Operation ");
		printf(" \n   3. Printout Stack ");
		printf(" \n   0. Quit ");
		printf(" \n =========================");
		printf(" \n   請選擇 [0-3] : ");
		scanf("%d",&choose);    /* scanf_s() for VC++   */
		switch (choose)  	/* 判斷使用者選擇的選項 */
		{
			case 1:
				push();
				break;
			case 2:
				pop();
				break;
			case 3: 
				printout();
				break;
			case 0:
				exit(0);
			default:
	     		printf("\n\n  === Error input (0-3) !! ");
	     		break;
		}
		printf(" \n\n %s\n", MSG);
	}while(1);
	system("PAUSE");	
	return 0;
}

void push(void)
{
	sptr++; 				/*sptr指標往前移*/
	if(sptr==full) 		/*判斷堆疊是否己經滿了*/
	{
		printf("\n\n  …. 堆疊己滿！ ");
		sptr--;
	}
	else
	{
		printf("\n\n 請輸入第 %d 筆整數：", i++); 
       /* 將使用者輸入的資料放入sptr指向的位址*/
		scanf("%d", sptr);    /* scanf_s() for VC++  */
	}
}

void pop(void)
{
	if(sptr!=empty)	 	/*判斷堆疊是否還沒有空*/
	{
		printf("\n\n  ... Pop from stack : %3d", *sptr);
		sptr--;
		i--;
	}
	else
	{
		printf("\n\n .... 堆疊己經空了! \n\n");
		i=1;    				/* 堆疊內資料筆數重新開始算 */
	}
}

void printout(void)
{
	int *lptr;
	lptr=sptr;
	printf("\n\n目前堆疊內資料：");
	do
	{
		if(lptr!=empty)		/*判斷堆疊是否還沒有空*/
		{
			printf(" %3d", *lptr);
			lptr--;
		}
		else
		{
			break;
		}
	}while(1);
	printf("\n                Top <-- Stack --> Bottom \n");
}
