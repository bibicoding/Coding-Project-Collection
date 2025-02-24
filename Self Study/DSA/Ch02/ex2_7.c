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

/*假設A為m×n矩陣、B為n×p矩陣、C為m×p矩陣，這個函數會計算C=A×B*/
void matrix_multiply(int m, int n, int p, int A[m][n], int B[n][p], int C[m][p])
{
  for (int i = 0; i < m; i++)
    for (int j = 0; j < p; j++){
      C[i][j] = 0;
      for (int k = 0; k < n; k++)
        C[i][j] += A[i][k] * B[k][j];
    }
}