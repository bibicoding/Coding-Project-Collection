#include <stdio.h>
#include <stdlib.h>
#define ID 1				/* 設定巨集ID為1 此行為彈性*/
#include "selectbook.h"		/* 含入selectbook.h標頭檔 */

int main(int argc, char *argv[])
{
  	printf(" ====經典系列書籍==== \n\n");
	printf("   書名：%s \n", BNAME);
	printf("   等級：%s \n", LEVEL);
	printf("   定價：%d \n", PRICE);
	printf("   種類：%s \n", SERIES);
    system("PAUSE");	
    return 0;
}
