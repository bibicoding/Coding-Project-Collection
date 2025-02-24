#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
	int i=10,k;
	int *ptr1;
	printf(" Var-Name   Address    Content  \n");
	printf(" ========= ========= ========== \n");
	printf("     i     %d     %d    \n",&i,i);
	printf("     k     %d      ?    \n",&k);
	ptr1=&i;    /* 將變數i的記憶位址存入ptr1內 */
	printf("    ptr1   %d     %d    \n",&ptr1,ptr1);
	k=*ptr1; /* 將存放在ptr1內(即變數i的位址)所儲存的資料10指定給變數k */
	printf("     k     %d     %d    \n",&k,*ptr1);
	system("PAUSE");	
	return 0;
}
