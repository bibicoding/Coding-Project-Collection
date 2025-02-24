#include <stdio.h>
#include <stdlib.h>

#define AREA 2	/* 只要更改數字，編譯器會依條件選擇編譯 */
#if AREA == 1
	#define NAME "月球"
	#define G 0.165
#elif AREA==2
	#define NAME "火星"
	#define G 0.38
#elif AREA==3 
	#define NAME "木星"
	#define G 2.53
#else
	#define NAME "地球"
	#define G 1.0 
#endif
int main(int argc, char *argv[]) 
{
	float kg;
	printf("請輸入您的體重(單位公斤)："); 
	scanf("%f", &kg);
	printf("\n在%s等於%6.2f公斤\n", NAME, G * kg);
	system("PAUSE");
	return 0;
}
