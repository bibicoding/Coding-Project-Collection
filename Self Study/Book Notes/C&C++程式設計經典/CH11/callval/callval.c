#include <stdio.h>
#include <stdlib.h>
void callval(int, int);

int main(int argc, char *argv[]) {
	int a=10, b=15;
	printf(" ㊣玡跑计aず甧:\t(&a)=(%x)=%d\n", &a, a);
	printf(" ㊣玡跑计bず甧:\t(&b)=(%x)=%d\n\n", &b, b);
	callval(a, b);
	printf(" ㊣跑计aず甧:\t(&a)=(%x)=%d\n", &a, a);
	printf(" ㊣跑计bず甧:\t(&b)=(%x)=%d\n\n", &b, b);
	system("PAUSE");	
	return 0;
}

void callval(int x, int y){
	x+=3 ;
	y+=2 ;
	printf(" ㊣い跑计xず甧:\t(&x)=(%x)=%d\n", &x, x);
	printf(" ㊣い跑计yず甧:\t(&y)=(%x)=%d\n\n", &y, y);
}
