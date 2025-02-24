#include <stdio.h>
#include <stdlib.h>
#define IBM_NB  32000
#define ACER_NB 30000
#define MSG1 " \n IBM NoteBook's Price : %d "
#define MSG2 " \n IBM_NB未定義 "
#define MSG3 " \n ACER NoteBook's Price : %d "

int main(int argc, char *argv[])
{
    #ifdef IBM_NB  	/* 是否有定義IBM_NB巨集，滿足條件 */
		printf(MSG1,IBM_NB);   /* 編譯此行 */
    #else
		printf(MSG2,ACER_NB);  /* 跳過此行 */
    #endif
#undef IBM_NB 		/* 取消第2行IBM_NB巨集定義 */

    #ifndef IBM_NB 	/* 是否未定義IBM_NB巨集，滿足條件 */
		printf(MSG2);	/* 編譯此行 */
    #else
		printf(MSG3,ACER_NB);  /* 跳過此行 */
    #endif
	printf("\n\n");
    system("PAUSE");	
    return 0;
}
