#include <stdio.h>
#include <stdlib.h>
#include <ctype.h> 
#include <conio.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
 	char ch;
	int n=0, digit=0, upper=0, lower=0, punct=0, cntrl=0, celse=0;
	printf("=== 判斷字元種類，按ESC鍵可離開 ===\n");
	do
	{	
        printf("\n請輸入測試字元：");
	    ch=getche();
		if (ch==27)
		{
			break;
		}
		else if(isdigit(ch))
		{
			digit++;
		}
		else if(isalpha(ch))
		{
	      if(isupper(ch))
			{
				upper++;
			}
		  else
			{
				lower++;
			}
		}
		else if(ispunct(ch))
		{
			punct++;
		}
		else if(iscntrl(ch))
		{
			cntrl++;
		}
		else
		{
			celse++;
		}
		n++;
	}while(1);
	printf("\n\n");
	printf("輸入0-9 數字 %d 次.\n", digit);
	printf("輸入大寫字母 %d 次.\n", upper);
	printf("輸入小寫字母 %d 次.\n", lower);
	printf("輸入標點符號 %d 次.\n", punct);
	printf("輸入控制字元 %d 次.\n", cntrl);
	printf("輸入其他按鍵 %d 次.\n", celse);
    printf("\n");
    system("PAUSE");	
	return 0;
}
