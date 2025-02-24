#include <stdio.h>
#include <stdlib.h>


int main(int argc, char *argv[]) 
{
	char area[][13] = {"新埔民生", "幸福", "新北產業園區"};
	char date[][4] = {"9/1", "9/2", "9/3", "9/4", "9/5"};
	int mrt[5][3] = {{1948, 3126, 3684}, {1993, 3088, 3649},
			{2008, 3150, 3749}, {2073, 3407, 4011},
			{1811, 3052, 2903}};
	int area_sum[3] = {0}; /* area_sum陣列存放3個捷運站的總運量 */
	int i, j, total = 0; /* total代表全部總運量 */
	
	printf("\n日期\t%s\t%s\t\t%s\n", area[0], area[1], area[2]);
	printf("===================================================\n");
	
	for(i = 0; i < 5; i ++)
	{
		printf("%s\t", date[i]);
		for(j = 0; j < 3; j ++){
			printf("%d\t\t", mrt[i][j]); /* 印出第i日在第j站的搭乘人次 */
			area_sum[j] += mrt[i][j]; /* 累計算第j站的搭乘人次 */
		}
		printf("\n");
	}
	for(i = 0; i < 3; i ++)
	{  /* 統計這三站五日內的搭乘總人次 */
		total += area_sum[i];
	}
	for(i = 0; i < 3; i ++){  /* 顯示統計資料及計算各站搭乘人數比率*/ 
		printf("%s 載客量%d人次，", area[i], area_sum[i]);
		printf("佔%5.2f%%\n", (float)area_sum[i] / total * 100);
	}
	system("PAUSE");
	return 0;
}
