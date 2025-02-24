#include <stdio.h>
#define MAX_SIZE 100

/*假設陣列A有n個元素，這個函數會在索引為pos的位置插入元素value*/
void array_insert(int A[], int *n, int pos, int value)
{
  if (pos < 0 || pos > *n) return;		/*若插入位置不是有效的，就返回*/
  if (*n >= MAX_SIZE) return;         /*若陣列已滿，就返回*/
  for (int i = *n - 1; i >= pos; i--)	/*將索引為pos及之後的元素均往後挪一個位置*/
    A[i + 1] = A[i];
  A[pos] = value;									    /*在索引為pos的位置插入元素value*/
  (*n)++;												      /*更新陣列的大小*/
}

/*假設陣列A有n個元素，這個函數會印出陣列的所有元素*/
void array_traverse(int A[], int n)
{
  for (int i = 0; i < n; i++)
    printf("%d\n", A[i]);
}

int main() 
{
  int A[MAX_SIZE] = {10, 20, 30, 40, 50};
  int n = 5;
   
  /*在索引為2的位置插入元素8*/
  array_insert(A, &n, 2, 8);
    
  array_traverse(A, n);
}