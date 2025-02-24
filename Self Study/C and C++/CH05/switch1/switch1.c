#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>		/* 含入ctype.h標頭檔 */
#include <conio.h>

int main(int argc, char *argv[]) {
	char ch;
	printf("  客戶管理維護系統 \n");
	printf(" =====================\n");
	printf("     A：新增作業\n");
	printf("     D：刪除作業\n");
	printf("     U：修改作業\n");
	printf("     Q：離開作業\n");
	printf(" =====================\n");
	printf("  請選項 [A,D,U,Q]： ");
	ch = getchar();
	ch = toupper(ch);	/* 將ch的值轉成大寫英文字，然後再指定給ch */
	switch(ch) {
		case 'A':
			printf("\n 進入新增作業...\n");
           	break ;
		case 'D':
			printf("\n  進入刪除作業...\n");
			break ;
		case 'U':
			printf("\n  進入修改作業...\n");
			break ;
		case 'Q':
			printf("\n  離開系統 ! ^_^ ... Bye Bye!\n");
			break ;
		default :
			printf("\n  沒有這個選項 $#%^&*?\n");
	}
	printf("\n");	
	system("PAUSE");	
	return 0;
}
