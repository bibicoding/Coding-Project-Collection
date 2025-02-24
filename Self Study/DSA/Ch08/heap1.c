#include <stdio.h>
#define N 8     															/*定義資料個數為8*/

/*在最大堆積中插入節點*/
void insert_to_heap(int list[], int i)
{
  int temp = list[i];              							/*令temp為欲插入的節點*/
  /*當temp不是第一個節點且大於其父節點時*/
  while ((i > 0) && (temp > list[(i - 1) / 2])){
    list[i] = list[(i - 1) / 2];   							/*將其父節點往下移一階*/
    i = (i - 1) / 2;													  /*繼續往上做比較*/
    if (i == 0) break;              						/*若抵達樹根，就跳出*/
  }
  list[i] = temp;
}

/*建構最大堆積－方式一：一一插入*/
void construct_heap(int list[], int n)
{
  for (int i = 0; i < n; i++)          					/*一一插入節點*/
    insert_to_heap(list, i);
}

int main()
{
  int list[N] = {15, 42, 29, 66, 73, 15, 10, 19};
  construct_heap(list, N);
  printf("使用陣列存放最大堆積得到：\n");
  for (int i = 0; i < N; i++)
    printf("%d ", list[i]);
}