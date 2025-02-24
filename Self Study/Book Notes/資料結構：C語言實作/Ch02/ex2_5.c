#include <stdio.h>

/*假設A為m×n矩陣，這個函數會計算A的轉置矩陣B，則B為n×m矩陣*/
void matrix_transpose(int m, int n, int A[m][n], int B[n][m])
{
  for (int i = 0; i < m; i++)
    for (int j = 0; j < n; j++)
      B[j][i] = A[i][j];
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
     int B[3][2];
     matrix_transpose(2, 3, A, B);
     matrix_traverse(3, 2, B);    
}