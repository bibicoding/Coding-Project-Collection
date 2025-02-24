#include <stdio.h>
#define R 10    									/*定義基數為10*/
#define N 8     									/*定義欲排序的資料個數為8*/

void radix_sort(int list[])
{
  int i, j, max = 0, digits = 0, exp = 1, lsd, num = 0;
  int temp[R][N];									/*這個陣列就像編號為0 ~ 9的桶子*/
  int count[N];									  /*這個陣列用來記錄每個桶子的資料個數*/
  for (i = 0; i < R; i++)        	/*將每個桶子的資料個數初設為0*/
    count[i] = 0;

  for (i = 0; i < N; i++)        	/*找出最大資料*/
    if (list[i] > max) max = list[i];
   
  while (max > 0){          			/*找出最大位數*/
    digits++;
    max /= 10;
  }
  
  while (digits > 0){            	/*針對個、十、百…等位數做分配*/
    for (i = 0; i < N; i++){    	/*根據指定的位數將資料分配到桶子*/
      lsd = (list[i] / exp) % 10;
      temp[lsd][count[lsd]++] = list[i];
    }  
    for (i = 0; i < R; i++)      		/*根據分配到桶子的順序將資料收集在一起*/
      if (count[i] > 0){
        for (j = 0; j < count[i]; j++)
          list[num++] = temp[i][j];
        count[i] = 0;
      }
    num = 0;
    exp *= 10;
    digits--;
  }
}

int main()
{
  int list[N] = {356, 123, 353, 228, 153, 152, 238, 236};
  radix_sort(list);
  printf("排序結果為：");
  for (int i = 0; i < N; i++)
    printf("%d ", list[i]);
}