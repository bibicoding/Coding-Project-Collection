#include <stdio.h>
#define MAX_SIZE 100			/*定義堆疊最多可以存放MAX_SIZE個資料*/
typedef struct stk{				/*宣告stack是堆疊資料結構*/
  char data[MAX_SIZE];		/*存放堆疊的資料*/
  int top;			      		/*記錄堆疊的頂端*/
}stack;
stack S;									/*宣告一個堆疊S存放運算子和左括號*/

/*這個函數會將參數推入堆疊*/
void push(char c)
{
  if (S.top < MAX_SIZE - 1) S.data[++S.top] = c;
}

/*這個函數會從堆疊彈出一個資料並存放在參數指定的位址*/
void pop(char *c)
{
  if (S.top > -1) *c = S.data[S.top--];
}

/*這個函數會檢查參數是否為 + - * / 等運算子，是就傳回1，否則傳回0*/
int is_operator(char c)
{
  if ((c == '+') || (c == '-') || (c == '*') || (c == '/')) return 1;
  else return 0; 
}

/*這個函數會檢查參數是否為a ~ z等運算元，是就傳回1，否則傳回0*/
int is_operand(char c)
{
  if (c >= 'a' && c <= 'z') return 1;
  else return 0;
}  

/*這個函數會根據參數指定的運算子傳回其優先順序*/
int get_precedence(char c)
{
  switch (c){
    case '(': return 0;
    case '+': return 1;
    case '-': return 1;
    case '*': return 2;
    case '/': return 2;
    default: return -1;
  }
}

/*這個函數會將中序表示法轉換成後序表示法*/
void infix_to_postfix(char *infix, char *postfix)
{
  int i = 0, j = 0;
  char token, item;
  while ((token = infix[i++]) != '\0'){
    if (is_operand(token)) postfix[j++] = token;	/*若token是運算元，就直接輸出*/
    else if (token == '(') push(token);					  /*若token是左括號，就推入堆疊*/
    else if (token == ')')									      /*若token是右括號*/
      while (S.top > -1){									        /*就重複彈出，直到遇見左括號*/
        pop(&item);
        if (item == '(') break;
        postfix[j++] = item;
      }
    else if (is_operator(token)){ 		            /*若token是運算子*/
      while (S.top > -1){					                /*若token的優先順序較高，就推入堆疊*/
        if (get_precedence(token) > get_precedence(S.data[S.top])) break;
        else{									                    /*否則重複彈出，直到遇見較低的運算子*/
          pop(&item);
          postfix[j++] = item;
        }
      }
      push(token);
    }
  }
  /*若中序表示法已經掃瞄完畢，但堆疊不是空的，就將堆疊內的運算子一一彈出*/
  while (S.top > -1){
    pop(&item);
    postfix[j++] = item;
  }
  postfix[j] = '\0';
}

/*主程式*/
int main()
{
  /*宣告變數infix存放中序表示法，您亦可變更為其它運算式*/
  char infix[MAX_SIZE] = "a*(b+c)-d";
  /*宣告變數postfix存放後序表示法*/
  char postfix[MAX_SIZE];
  infix_to_postfix(infix, postfix);
  printf("%s轉換成後序表示法會得到%s", infix, postfix);
 }