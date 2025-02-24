#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
	int score[11]={0};	/*score[0]省略不用, 記錄10局分數*/
	int p[22]={0};		/*p[0]省略不用, 記錄每球分數, 最多打21球*/

	/* g:局數, j:每球註標, sum:保齡球總分 */
	/* ballnum:目前是該局的第幾球, keyin:輸入每球的分數 */
	int g=0, j=0, sum=0, ballnum=0, keyin=0;

	/* 依序輸入10局的分數 */
	for(g=1;g<=10; g++)
	{
		ballnum++;
		j++;
		printf(" 第 %2d 局第 %2d 球：", g, ballnum);
		scanf("%d", &keyin);
		p[j]=keyin;
		if(p[j]==10)
		{
			if(g==10)
			{
				ballnum++;
				j++;
            	printf(" 第 %2d 局第 %2d 球：", g, ballnum);
				scanf("%d", &keyin);
				p[j]=keyin;
				ballnum++;
				j++;
				printf(" 第 %2d 局第 %2d 球：", g, ballnum);
				scanf("%d", &keyin);
				p[j]=keyin;
				break;
			}
			else
			{
				ballnum=0;
				continue;
			}
		}
		else
		{
			ballnum++;
			j++;
			printf(" 第 %2d 局第 %2d 球：", g, ballnum);
			scanf("%d", &keyin);
			p[j]=keyin;
			if(p[j-1]+p[j]==10 && g==10 )
			{
				ballnum++;
				j++;
				printf(" 第 %2d 局第 %2d 球：", g, ballnum);
				scanf("%d", &keyin);
				p[j]=keyin;
				continue;
			}
			else					
			{
				ballnum=0;
				continue;
			}
		}
	}

	/*計算每局的得分*/
	for(g=1, j=1; g<=10; g++)
	{
		if(p[j]==10)
		{
			score[g]=p[j]+p[j+1]+p[j+2];
			j++;
		}
		else if(p[j]+p[j+1]==10)
		{
			score[g]=p[j]+p[j+1]+p[j+2];
			j+=2;
		}
		else
		{
			score[g]=p[j]+p[j+1];
			j+=2;
		}
	}
	printf("\n");
	printf(" ====================\n");

	/*印出每局的得分，以及計算保齡球的總分*/
	for(g=1; g<=10; g++)
	{
		printf(" 第 %2d 局分數：%d\n", g, score[g]);
		sum+=score[g];
	}
	printf(" ====================\n");

	/*印出保齡球的總分*/
	printf(" 保齡球總分： %d\n\n", sum);

	system("PAUSE");
	return 0;
}
