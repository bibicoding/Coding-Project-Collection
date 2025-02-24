#include <stdio.h>
#include <stdlib.h>
void swap(int *, int *);  /* ㄧΑいま计戈*才腹 */

int main(int argc, char *argv[]) {
	int a=10,b=20;
	printf("main()ㄧΑ㊣swap()ㄧΑ玡,aず甧(%x)=%d\n",&a,a);
	printf("main()ㄧΑ㊣swap()ㄧΑ玡,bず甧(%x)=%d\n\n",&b,b);
	swap(&a ,&b);	/* 龟ま计&才腹ボ肚龟ま计倒店ま计 */
	printf("main()ㄧΑ,aず甧(%x)=%d\n",&a,a);
	printf("main()ㄧΑ,bず甧(%x)=%d\n\n",&b,b);
	system("PAUSE");	
	return 0;
}

void swap(int *x,int *y)  /* 店ま计*才腹ボ肚㊣ */
{
	int temp;
	printf("秈swap()ㄧΑユ传玡,xず甧(%x)=%d\n",x,*x);
	printf("秈swap()ㄧΑユ传玡,yず甧(%x)=%d\n\n",y,*y);
	temp=*x;
	*x=*y;
	*y=temp;
	printf("秈swap()ㄧΑずユ传,xず甧(%x)=%d\n",x,*x);
	printf("秈swap()ㄧΑずユ传,yず甧(%x)=%d\n\n",y,*y);	
}
