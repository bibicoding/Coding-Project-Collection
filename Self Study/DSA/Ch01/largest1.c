#include <stdio.h>

int main()
{
  int largest = 0;         		        /*將最大數的初始值設定為0*/
  if (25 > largest) largest = 25; 		/*若25比較大，就將最大數設定為25*/
  if (30 > largest) largest = 30; 		/*若30比較大，就將最大數設定為30*/
  if (18 > largest) largest = 18; 		/*若18比較大，就將最大數設定為18*/
  if (7  > largest) largest = 7;  		/*若7比較大，就將最大數設定為7*/
  if (10 > largest) largest = 10; 		/*若10比較大，就將最大數設定為10*/
  printf("最大數為%d", largest);   		 /*印出最大數*/
}