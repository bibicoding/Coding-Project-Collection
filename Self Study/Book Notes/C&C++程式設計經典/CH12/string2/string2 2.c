#include <stdio.h>
#include <stdlib.h>
#define MSG "歡迎光臨"
#define KEYIN "請輸入姓名："

int main(int argc, char *argv[]) {
	char name[15];
	printf(" %s  %s", MSG, KEYIN);
	scanf("%s", name);
	printf("%s, 您好 ！ \n", name);
	return 0;
}
