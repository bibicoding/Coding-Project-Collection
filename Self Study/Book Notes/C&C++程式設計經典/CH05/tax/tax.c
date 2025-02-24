#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
	int income, tax, discount=0;
	double taxrate=0.0;
	printf("請輸入綜合所得淨額：");
	scanf("%d", &income);		
	if(income >= 0 && income<=540000) {
		discount=0;
		taxrate=0.05;
	}
	else if(income>540000 && income<=1200000) {
		discount=36400;
		taxrate=0.1;
	}
	else if(income>1200000 && income<=2420000) {
		discount=130000;
		taxrate=0.20;
	}
	else if(income>2420000 && income<=4530000) {
		discount=365000;
		taxrate=0.3;
	}
	else if(income>453000) {
		discount=805000;
		taxrate=0.4;
	}
	else {
		printf("  請輸入大於等於0的數值!!\n\n");
       	system("PAUSE");	
		exit(0);
	}
	tax=income * taxrate ;
	printf("\n");
	printf("  綜合所得淨額： %d 元\n", income);
	printf("  稅        額： %2.0f ％\n", taxrate*100 );
	printf("  -----------------------\n");
	printf("  稅        金： %d 元\n", tax);
	printf("  累 進 差  額： %d 元\n", discount);
	printf("------------------------\n");
	printf("  今年應納稅額： %d 元\n", tax-discount);
	printf("\n\n");
	system("PAUSE");	
	return 0;
}
