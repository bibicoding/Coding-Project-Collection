#include <stdio.h>
#define MAX_SIZE 100		/*定義稀疏矩陣最多包含MAX_SIZE個非零項*/
typedef struct{				  /*定義表示非零項的結構*/
  int row;							/*非零項位於第幾列*/
  int col;							/*非零項位於第幾行*/
  int value;						/*非零項的值*/
}SparseTerm;

/*這個函數會在稀疏矩陣加入一個非零項*/
void attach(SparseTerm *term, int row, int col, int value)
{
  term->row = row;
  term->col = col;
  term->value = value;                 
}

/*B = At*/
void SparseTranspose(SparseTerm A[], SparseTerm B[])
{
  int currentB;
  B[0].row = A[0].col;
  B[0].col = A[0].row;
  B[0].value = A[0].value;

  /*若稀疏矩陣沒有非零項，就返回*/
  if (B[0].value == 0) return;
  currentB = 1;
  /*針對稀疏矩陣A的每一行做轉置*/
  for (int i = 0; i < A[0].col; i++)
    /*找出目前行的非零項*/
    for (int j = 0; j <= B[0].value; j++)
      /*將目前行的非零項加入稀疏矩陣B*/
      if (A[j].col == i){
        B[currentB].row = A[j].col;
        B[currentB].col = A[j].row;
        B[currentB].value = A[j].value;
        currentB++;
      }
}

/*主程式*/
int main()
{
  SparseTerm A[MAX_SIZE], B[MAX_SIZE]; 
  attach(&A[0], 4, 5, 6);
  attach(&A[1], 0, 1, 1);
  attach(&A[2], 0, 4, 2);
  attach(&A[3], 1, 3, 3);
  attach(&A[4], 2, 0, 4);
  attach(&A[5], 2, 2, 5);
  attach(&A[6], 3, 4, 6);    
  
  SparseTranspose(A, B);

  /*印出稀疏矩陣B的結果*/
  for (int i = 0; i <= B[0].value; i++)
    printf("%d\t%d\t%d\n", B[i].row, B[i].col, B[i].value);
}