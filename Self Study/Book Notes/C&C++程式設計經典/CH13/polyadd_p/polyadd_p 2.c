#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <math.h>

typedef struct polynode
{
	float coef;
	int exp;
	struct polynode *next;
}NODE;

void printpoly(NODE*);
NODE *createpoly(int);
NODE *polyadd(NODE*, NODE*);

int main(int argc, char *argv[])
{
   NODE *poly1, *poly2, *poly3;
   int keyin=0;
   printf("\n === 多項式相加  ===== \n");
   printf("\n 1. 第一個多項式 poly1(x) 共有多少項：");
   scanf("%d", &keyin);
   printf("\n");
   poly1=createpoly(keyin);
   printf("\n");    
   printf("\n 2. 第二個多項式 poly2(x) 共有多少項：");
   scanf("%d", &keyin);
   poly2=createpoly(keyin);
   poly3=polyadd(poly1, poly2);
   printf("\n 1. poly1(x)=");
   printpoly(poly1);
   printf("\n 2. poly2(x)=");
   printpoly(poly2);
   printf("\n 3. poly3(x)= poly1(x) + poly2(x)");
   printf("\n    poly3(x)=");
   printpoly(poly3);
   printf("\n\n");
   system("PAUSE");	
   return 0;
}

void printpoly(NODE *ptr)
{
    char opr;
    while(ptr!=NULL)
    {
      if(ptr->coef > 0)
      {
      	opr='+';
      }
      else
      {
      	opr='-';
      }
      printf(" %c%4.1fx^%d", opr, fabs(ptr->coef), ptr->exp);
      ptr=ptr->next ;
    }
}

NODE *createpoly(int n)
{
    float coef=0;
    int exp=0;
    int i=0;
    NODE *head, *tail, *ptr;
    head=tail=NULL;
    do{
        i++;
		ptr=(NODE*)malloc(sizeof(NODE));
		printf("    輸入第 (%d) 項的 係數 與 指數 (以空白隔開)：", i);
		scanf("%f %d", &coef, &exp);
		ptr->coef = coef;
		ptr->exp = exp;
		ptr->next=NULL;
        if (head==NULL)
           head=ptr;
        else
           tail->next=ptr;
	    tail=ptr;
    } while(n>i);
    return head;
}

NODE *polyadd(NODE *poly1, NODE *poly2)
{
  NODE *tail, *head, *ptr1, *ptr2, *ptr3;
  ptr1=poly1;
  ptr2=poly2;
  head=tail=NULL;
  while(ptr1!=NULL && ptr2!=NULL)
  {
     ptr3=(NODE*)malloc(sizeof(NODE));
     if(ptr1->exp > ptr2->exp)
     {
         ptr3->coef = ptr1->coef ;
         ptr3->exp = ptr1->exp ;
	     ptr1 = ptr1->next ;
     }
     else if(ptr1->exp < ptr2->exp)
     {
		ptr3->coef = ptr2->coef ;
		ptr3->exp = ptr2->exp ;
		ptr2 = ptr2->next ;
     }
     else
     {
	    ptr3->coef = ptr1->coef + ptr2->coef ;
		ptr3->exp = ptr1->exp ; //同ptr3->exp=ptr2->exp;
		ptr1 = ptr1->next ;
		ptr2 = ptr2->next ;
	 }
	 ptr3->next=NULL;
     if (head==NULL)
         head=ptr3;
     else
        tail->next=ptr3;
    tail=ptr3;
 }
 if(ptr1==NULL)
 {
     while(ptr2!=NULL)
     {
        ptr3=(NODE*)malloc(sizeof(NODE));
        ptr3->coef = ptr2->coef ;
        ptr3->exp = ptr2->exp ;
         ptr2 = ptr2->next ;
         tail->next = ptr3 ;
         tail = ptr3 ;
      }
    }
    else
    {
       while(ptr1!=NULL)
       {
          ptr3=(NODE*)malloc(sizeof(NODE));
		  ptr3->coef = ptr1->coef ;
		  ptr3->exp = ptr1->exp ;
		  ptr1 = ptr1->next ;
		  tail->next = ptr3 ;
		  tail = ptr3 ;
       }
    } 
    return head;
}
