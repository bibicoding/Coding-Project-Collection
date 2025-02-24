#include <stdio.h>
#define MAX_SIZE 100

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
  array_traverse(A, n);
}