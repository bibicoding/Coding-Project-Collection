#include <stdio.h>
#include <stdlib.h>
/*這個巨集用來比較x、y，若x < y，傳回-1；若x == y，傳回0；若 x > y，傳回1*/
#define COMPARE(x, y) ((x < y) ? -1 : (x == y) ? 0 : 1)

/*宣告poly_node是多項式的非零項*/
typedef struct pnode{
  int coef;						  /*非零項的係數*/
  int exp;							/*非零項的冪次*/
  struct pnode *next;		/*非零項的鏈結*/
}poly_node;

/*宣告poly_ptr是指向多項式的指標*/
typedef poly_node *poly_ptr;

/*這個函數會在鏈結串列的尾端加入一個非零項，然後傳回指向最後一個節點的指標*/
poly_ptr attach(poly_ptr tail, int coef, int exp)
{
  poly_ptr ptr;
  ptr = (poly_ptr)malloc(sizeof(poly_node));
  ptr->coef = coef;
  ptr->exp = exp;
  ptr->next = NULL;
  tail->next = ptr;
  tail = ptr;
  return tail;
}

/*這個函數會計算C(X) = A(X) + B(X)，然後傳回指向C(X) 的指標*/
poly_ptr PolyAdd(poly_ptr A, poly_ptr B)
{
  poly_ptr C, tail;
  C = (poly_ptr)malloc(sizeof(poly_node));
  tail = C;
  A = A->next;
  B = B->next;
  while ((A != NULL) && (B != NULL)){
    switch (COMPARE(A->exp, B->exp)){
      case -1:		/*當A的冪次小於B的冪次時，將B的非零項加入C*/
        tail = attach(tail, B->coef, B->exp);
        B = B->next;
        break;
      case 0:		  /*當A的冪次等於B的冪次時，將兩者相加後的非零項加入C*/
        if ((A->coef + B->coef) != 0)
          tail = attach(tail, A->coef + B->coef, A->exp);
        A = A->next;
        B = B->next;
        break;
      case 1:		  /*當A的冪次大於B的冪次時，將A的非零項加入C*/
        tail = attach(tail, A->coef, A->exp);
        A = A->next;
    }
  }
  while (A){			/*將A剩下的非零項加入C*/
    tail = attach(tail, A->coef, A->exp);
    A = A->next;
  }
  while (B){			/*將B剩下的非零項加入C*/
    tail = attach(tail, B->coef, B->exp);
    B = B->next;
  }
  return C;
}

/*主程式*/
int main()
{
  poly_ptr A, B, C, tail;

  /*將A(X) = 3X5 + 8X4 - 6X2 + 5X0加以初始化*/
  A = (poly_ptr)malloc(sizeof(poly_node));
  tail = attach(A, 3, 5);
  tail = attach(tail, 8, 4);
  tail = attach(tail, -6, 2);
  tail = attach(tail, 5, 0);

  /*將B(X) = 2X6 + 4X2 + 1X0加以初始化*/
  B = (poly_ptr)malloc(sizeof(poly_node));
  tail = attach(B, 2, 6);
  tail = attach(tail, 4, 2); 
  tail = attach(tail, 1, 0);

  /*呼叫函數計算C(X) = A(X) + B(X)*/
  C = PolyAdd(A, B);

  /*印出C(X) 的結果*/
  tail = C->next;
  while (tail != NULL){
    printf("非零項的係數： %d\t冪次： %d\n", tail->coef, tail->exp);
    tail = tail->next;
  }
}