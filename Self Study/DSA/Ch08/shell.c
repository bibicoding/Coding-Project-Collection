#include <stdio.h>
/*定義欲排序的資料個數*/ 
#define N 9

void shell_sort(int list[], int n)
{
  int i, j, d, temp;
  /*根據d1 = n / 2且dk+1 = dk / 2產生間隔長度*/
  for (d = n / 2; d > 0; d /= 2)
    /*以插入排序的方式將這些小陣列個別排序*/
    for (i = d; i < n; i++){
      temp = list[i];
      for (j = i; j >= d; j -= d)
        if (temp < list[j - d]) list[j] = list[j - d];
        else break;
      list[j] = temp;
    }
}

int main()
{
  int list[N] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
  shell_sort(list, N);
  printf("排序結果為：");
  for (int i = 0; i < N; i++)
    printf("%d ", list[i]);
}