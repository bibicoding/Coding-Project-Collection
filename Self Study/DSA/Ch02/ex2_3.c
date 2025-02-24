#include <stdio.h>
#define MAX_SIZE 100

/*假設陣列A有n個元素，這個函數會刪除索引為pos的元素*/
void array_delete(int A[], int *n, int pos)
{
  if (pos < 0 || pos >= *n) return;			/*若插入位置不是有效的，就返回*/
  for (int i = pos; i < *n - 1; i++)		/*將之後的元素均往前挪一個位置*/
    A[i] = A[i + 1];
  (*n)--;														    /*更新陣列的大小*/
}

/*假設陣列A有n個元素，這個函數會印出陣列的所有元素*/
void array_traverse(int A[], int n)
{
  for(int i = 0; i < n; i++)
    printf("%d\n", A[i]);
}

int main() 
{
  int A[MAX_SIZE] = {10, 20, 30, 40, 50};
  int n = 5;
    
  /*刪除索引為2的元素*/
  array_delete(A, &n, 2);

  array_traverse(A, n);
}