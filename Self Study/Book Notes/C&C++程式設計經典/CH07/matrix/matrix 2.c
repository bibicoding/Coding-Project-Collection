#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
		int a[3][3]={{1,2,3}, {4,5,6}, {7,8,9}};
		int b[3][3]={{2,4,6}, {8,10,12}, {14,16,18}};
		int c[3][3];
		int i, j, k;
		printf("\n ¯x°} a \n");
		for(i=0;i<=2;i++)	/* ¦L¥Xa¯x°}(a°}¦C) */
		{
			for(j=0;j<=2;j++)
			{
				printf("%5d", a[i][j]);
			}
			printf("\n");
		}
		printf("--------------------------------");
		printf("\n ¯x°} b \n");
		for(i=0;i<=2;i++)	/* ¦L¥Xb¯x°}(b°}¦C) */
		{
			for(j=0;j<=2;j++)
			{
				printf("%5d", b[i][j]);
			}
			printf("\n");
		}
		/* ¯x°}c=¯x°}a * ¯x°}b*/
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2; j++)
			{
				c[i][j]=0;
				for(k=0;k<=2;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		/* Åã¥Ü¯x°}¬Û­¼ªºµ²ªG */
		printf("================================");
		printf("\n ¯x°} c = ¯x°} a * ¯x°} b\n");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				printf("%5d", c[i][j]);
			}
			printf("\n");
		}
	printf("\n\n");
	system("PAUSE");	
	return 0;
}
