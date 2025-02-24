#include <stdio.h>

/*定義堆疊最多可以存放MAX_SIZE個資料*/
#define MAX_SIZE 5

/*宣告stack是堆疊資料結構*/
typedef struct stk{
  char data[MAX_SIZE];		/*存放堆疊的資料*/
  int top;			   				/*記錄堆疊的頂端*/
}stack;

int isFull(stack *S)
{
  /*若top等於陣列的最大索引，表示堆疊已滿，就傳回1，否則傳回0*/
  if (S->top == (MAX_SIZE - 1)) return 1;
  else return 0;
}

int isEmpty(stack *S)
{
  /*若top等於-1，表示堆疊已空，就傳回1，否則傳回0*/
  if (S->top == -1) return 1;
  else return 0;
}

void push(stack *S, char value)
{
  if (isFull(S)) printf("堆疊已滿！");	   /*若堆疊已滿，就印出此訊息*/
  else S->data[++S->top] = value;			    /*否則將top遞增1，再將值存入data[S->top]*/
}

void pop(stack *S)
{
  if (isEmpty(S)) printf("堆疊已空！");	    /*若堆疊已空，就印出此訊息*/
  else printf("%c ", S->data[S->top--]);	 /*否則印出data[S->top]，再將top遞減1*/
}

int main()
{
  stack S;
  S.top = -1;
  push(&S, 'A');
  push(&S, 'B');
  push(&S, 'C');
  push(&S, 'D');
  push(&S, 'E');
  push(&S, 'F');
  pop(&S);
  pop(&S);
  pop(&S);
  pop(&S);
  pop(&S);
  pop(&S); 
}