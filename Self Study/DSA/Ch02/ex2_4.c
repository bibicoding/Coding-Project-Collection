#include <stdio.h>

/*假設A為m×n矩陣，這個函數會印出矩陣的所有元素*/
void matrix_traverse(int m, int n, int A[m][n])
{
  for (int i = 0; i < m; i++){
    for (int j = 0; j < n; j++)
      printf("%d ", A[i][j]);
    printf("\n");
  }
}

int main()
{
  int A[2][3] = {{11, 12, 13}, {21, 22, 23}};
  matrix_traverse(2, 3, A);
}