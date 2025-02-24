#include <stdio.h>

/*假設A、B、C均為m×n矩陣，這個函數會計算C=A+B*/
void matrix_add(int m, int n, int A[m][n], int B[m][n], int C[m][n])
{
  for (int i = 0; i < m; i++)
    for (int j = 0; j < n; j++)
      C[i][j] = A[i][j] + B[i][j];
}

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
     int B[2][3] = {{10, 20, 30}, {40, 50, 60}};
     int C[2][3];
     matrix_add(2, 3, A, B, C);
     matrix_traverse(2, 3, C);
}