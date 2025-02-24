#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef char STRING[10];
typedef unsigned short UNSHORT;
typedef unsigned int UNINT;
typedef float REAL;

struct member_data
{
	STRING name;	/* char name[10]; */
	UNSHORT age;  	/* unsigned short age; */
	UNINT income;   /* unsigned int income;	*/
	REAL avg;      	/* float avg; */
};

typedef struct member_data DATAS;	/* DATAS 取代 struct member_data */
DATAS average(STRING tname, UNSHORT tage,UNINT tincome)
{
	DATAS ds;
	strcpy(ds.name, tname);
	ds.age = tage;
	ds.income = tincome;
	ds.avg = (REAL)tincome /12;
	return ds;
}

int main(int argc, char *argv[]) {
	DATAS hr[3];
	hr[0] = average("張無忌", 24, 456789);
	hr[1] = average("周芷若", 36, 567890);
	hr[2] = average("宋遠橋", 42, 678908);
	printf("   希佳佳 公司人力資源部門員工薪資表 \n");	
	printf(" 姓名\t年齡\t年收入\t平均月薪 \n");
	printf(" ===================================== \n");
	int i;
	for(i=0; i<=2; i++)
	{
		printf("%5s%5d%11d%11.2f \n", hr[i].name, hr[i].age, hr[i].income, hr[i].avg);		
	}
    system("PAUSE");	
	return 0;
}
