#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char *argv[]) {
	int keyin, guess;
	srand((unsigned)time(NULL));
	guess=rand()%5+1;
	printf("請輸入要猜的數字(限1-5 )：");
	scanf("%d", &keyin);
	if (keyin==guess)
 		printf("\n猜對了! ^_^，正確數字為 %d !\n", guess);
    else
  		printf("\n猜錯了! #_#，正確數字為 %d !\n", guess);
  		
  	printf("\n");
	system("PAUSE");	
	return 0;
}
