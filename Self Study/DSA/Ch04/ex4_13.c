#include <stdio.h>
/*定義堆疊最多可以存放MAX_SIZE個資料*/
#define MAX_SIZE 100
/*宣告stack是堆疊資料結構*/
typedef struct stk{
  float data[MAX_SIZE];			  /*存放堆疊的資料*/
  int top;			    					/*記錄堆疊的頂端*/
}stack;

/*宣告一個堆疊S存放運算元*/
stack S;
 
/*這個函數會將參數推入堆疊*/
void push(float f)
{
  if (S.top < MAX_SIZE - 1) S.data[++S.top] = f;
}

/*這個函數會從堆疊彈出一個資料並存放在參數指定的位址*/
void pop(float *f)
{
  if (S.top > -1) *f = S.data[S.top--];
}

/*這個函數會檢查參數是否為運算元，是就傳回1，否則傳回0*/
int is_operand(char c)
{
  if (c >= 'a' && c <= 'z') return 1;
  else return 0;
}

/*指定運算元a,b,…,k的值並存放在op[] 陣列，您亦可變更為其它值*/
float op[] = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

float eval_postfix(char *postfix)
{
  int i = 0;
  char token;
  float op1, op2, result;
  while ((token = postfix[i++]) != '\0'){
    if (is_operand(token))
      push(op[token - 'a']);
    else{
      pop(&op2);
      pop(&op1);
      switch (token){
        case '+':
          result = op1 + op2;
          break;
        case '-':
          result = op1 - op2;
          break;
        case '*':
          result = op1 * op2;
          break;
        case '/':
          result = op1 / op2;
          break;
      }
      push(result);
    }
  }
  pop(&result);
  return result;
}

/*主程式*/
int main()
{
  /*宣告後序表示法為 "abc+*d-"，您亦可變更為其它運算式*/
  char postfix[MAX_SIZE] = "abc+*d-";
  
  printf("假設a = 5、b = 6、c = 7、d = 8，則abc+*d-的值為%f", eval_postfix(postfix));
}