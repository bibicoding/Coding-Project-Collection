#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
  	struct date		/* 結構若定義在函式內，則只有該函式才能使用 */
	{
		int year;
		int month;
		int day;
	};

	struct ename
	{
		char last[10];
		char first[10];
	};

	struct person
	{
		char id[11];
		char cname[10];
		struct date birth;
		char blood[2] ;
		char married;
		struct ename name;
	};

	struct person p1={"B123456789","張三",{1980,10,25},
		"A",'Y',{"Lin","David"}};
	printf(" 1. 身分證字號: %s\n", p1.id);
	printf(" 2. 中文姓名  : %s\n", p1.cname);
	printf(" 3. 出生年份  : %d 年\n", p1.birth.year-1911);
	printf(" 4. 出生月份  : %d 月\n", p1.birth.month);
	printf(" 5. 出生日期  : %d 日\n", p1.birth.day);
	printf(" 6. 血    型  : %s 型\n", p1.blood);
	printf(" 6. 結    婚  : %c \n", p1.married);
	printf(" 7. 英文姓名  : %s %s\n", p1.name.first, p1.name.last);
    printf("\n");
    system("PAUSE");	
    return 0;
}
