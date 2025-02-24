#include <stdio.h>
#include <stdlib.h>
struct product
{
	char id[10];		/* 10 Bytes */
	char name[20];	/* 20 Bytes */
	int price;			/* 4 Bytes */
} vb;
struct student
{
	char id[10];		/* 10 Bytes */
	char name[14];	/* 14 Bytes */
	char grade;		/* 1 Bytes */
}peter;

int main(int argc, char *argv[])
{
  	printf(" product 結構型別變數  vb 記憶體空間大小->%d Bytes\n", 
		sizeof(vb));
	printf(" student 結構型別變數peter記憶體空間大小->%d Bytes\n", 
		sizeof(peter));
    printf("\n");
    system("PAUSE");	
    return 0;
}
