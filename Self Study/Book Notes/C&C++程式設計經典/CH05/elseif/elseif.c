#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
   	int score;
	printf("叫块眤だ计");
	scanf("%d", &score);
	if (score>=80 && score<=100 )		
		printf("\n Excellent! 单 A .");
	else if (score>=70 && score<80 )	
		printf("\n Good! 单 B.");
	else if (score>=60 && score<70 )	
		printf("\n Fair! 单 C.");
	else if (score>=0 && score<60 )	
		printf("\n Bad! 单 D.");
	else			
		printf("\n 块Θ罿岿粇!  だ计 0~100 ... ");

   	printf("\n\n");
   	system("PAUSE");	
	return 0;
}
