#include <stdio.h>
#include <stdlib.h>

enum month
{
    January=1,February,March,April,May,June,July,
    August,September,October,November,December
};

int main(int argc, char *argv[]) {
  	int year=0,month=0,day=0;
	printf(" 請輸入今天的日期(格式yy/mm/dd)：");
	scanf("%d/%d/%d", &year, &month, &day);	/* 使用者輸入日期 */

	printf("\n\n 今天是 : %d年 %d月 %d日 ! ... ^_^\n\n", year, month, day);
	switch(month)
	{
		case March:
		case April:
		case May:
			printf(" %2d 月是春光明媚的季節！", month);
			break;
		case June:
		case July:
		case August:
			printf(" %2d 月天氣炎熱小心曬傷！", month );
			break;
		case September:
		case October:
		case November:
			printf(" %2d 月秋高氣爽旅遊好季節！", month );
			break;
		case December:
		case January:
		case February:
			printf(" %2d 月溫度下降注意保暖！", month);
			break;
	}
	printf("\n\n");
    system("PAUSE");	
	return 0;
}
