#include <stdio.h>
#include <stdlib.h>
#include<conio.h>
#include <string.h>
struct grade
{
     char course[10];
     int score;
}peter={"bcc", 80},tom={"math",65};
void swap(struct grade *,struct grade *);

int main(int argc, char *argv[])
{
   printf(" Call By Address : \n\n");
   printf("=== 1. main()主函式 呼叫前 初值設定 \n");
   printf (" Peter.course = %s \t Peter.score = %d \n", peter.course, peter.score);
   printf (" Tom.course   = %s \t Tom.score   = %d \n", tom.course, tom.score);
   swap(&peter,&tom);
   printf("\n\n=== 4. 回 main()主函式後 === \n");
   printf (" Peter.course =%s \t Peter.score = %d \n", peter.course, peter.score);
   printf (" Tom.course   =%s   \t Tom.score   = %d \n", tom.course, tom.score);
   printf("\n");

   system("PAUSE");	
   return 0;
}

void swap(struct grade *x1,struct grade *x2)
{
    struct grade temp;
    printf("\n\n==== 2. 進入swap()函式內交換前 : \n");
    printf (" Peter.course = %s \t Peter.score = %d \n", x1->course, x1->score);
    printf (" Tom.course   = %s \t Tom.score   = %d \n", x2->course, x2->score);
    temp=*x1;
    *x1=*x2;
    *x2=temp;

    printf(" \n\n==== 3. 進入swap()函式內交換後 : \n");
    printf (" Peter.course = %s \t Peter.score = %d \n", x1->course, x1->score);
    printf (" Tom.course   = %s \t Tom.score   = %d \n", x2->course, x2->score);
}

