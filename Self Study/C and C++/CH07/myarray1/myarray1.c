#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char *argv[]) 
{
	char name[10];
	int i, str_num;
	printf("輸入您的英文姓名：");
	gets(name);/*輸入字串並將每一個字元逐一放到name陣列元素中, gets_s() for VC++ */
	printf("%s 您好^_^\n", name);	/*顯示name字串*/
	str_num=strlen(name);				/* strlen()函式可計算字串有幾個字元 */
	printf("\nname陣列元素如下：\n");
	for(i=0; i<str_num; i++)		/* 逐一印出name每一個陣列元素的值 */
	{
		printf("name[%d]=%c\n", i, name[i]);
	}
	printf(" \n");
	system("PAUSE");	
	return 0;
}
