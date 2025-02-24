#include <stdio.h>
#define V 3												  /*定義加權圖形的頂點個數為3*/
#define INFINITE 32767							/*定義∞的值為32767*/
int admatrix[V][V] = {0, 4, 11,			/*宣告陣列存放加權圖形的相鄰矩陣*/
                      6, 0, 2,
                      3, INFINITE, 0};
int A[V][V];												/*宣告陣列存放任意兩個頂點的最短距離*/

/*這個函數會實作Floyd演算法*/
void floyd()
{
  for (int i = 0; i < V; i++)
    for (int j = 0; j < V; j++)
      A[i][j] = admatrix[i][j];
  for (int k = 0; k < V; k++)
    for (int i = 0; i < V; i++)
      for (int j = 0; j < V; j++)
        if (A[i][j] > A[i][k] + A[k][j])
          A[i][j] = A[i][k] + A[k][j]; 
}

/*主程式*/
int main()
{
  floyd();
  for (int i = 0; i < V; i++)
    for (int j = 0; j < V; j++)
      printf("V%d到V%d的最短距離為%d\n", i, j, A[i][j]);
 }