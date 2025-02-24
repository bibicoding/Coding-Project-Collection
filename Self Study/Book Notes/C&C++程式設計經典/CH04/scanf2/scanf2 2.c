#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
	char cname[20], ename[20];
    printf("請輸入中文姓名:" );
    scanf("%s", &cname);  
    printf("你的名字： %s \n", cname);
    printf("\nPlease input your English name：");
    scanf("%s", &ename); 
    printf("Your English name : %s \n\n", ename);
    system("PAUSE") ;
	return 0;
}
