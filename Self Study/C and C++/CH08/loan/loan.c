#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int loan(int, int, float);
void showloan(int, int, float);

int main(int argc, char *argv[])
{
  	int keyin_money, keyin_year, keyin_rate;
	float rate;
	printf("=分期付款的利息與本金試算=\n");
	printf(" 請輸入貸款金額：");
	scanf("%d", &keyin_money);
	printf(" 請輸入幾年償還：");
	scanf("%d", &keyin_year);
	printf("   請輸入年利率：");
	scanf("%d", &keyin_rate);
	rate=(float)keyin_rate/100;
	printf("\n");
	printf(" 每年應還本金加利息共 %d", 
		loan(keyin_money, keyin_year, rate));
	printf("\n\n");
	showloan(keyin_money ,keyin_year ,rate);
	printf("\n");

    system("PAUSE");	
    return 0;
}

int loan(int money, int year, float rate)
{
	return money/((1-pow((1+rate),-(year)))/rate);
}

void showloan(int money, int year, float rate)
{
	int i, capital_interest, capital, interest;
	/* 每年應還分期付款的利息與本金 */
	capital_interest=money/((1-pow((1+rate),-(year)))/rate);
	printf(" 攤還年次\t期初餘額\t應付利息\t償還本金\t每年償還金額\n");
	printf("======================================");
	printf("======================================\n");
	for(i=1;i<=year;i++)
	{
		interest=money*rate;				/* 利息 */
		capital=capital_interest-interest;	/* 本金 */
		if(i==year)
		{
			capital=money;
		}
		printf(" 第 %2d 年\t%8d\t%8d\t%8d\t%8d\n",
			i, money, interest, capital, capital_interest);
		money-=capital;
	}
}
