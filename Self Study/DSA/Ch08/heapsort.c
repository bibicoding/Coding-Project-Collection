#include <stdio.h>
#define N 8     								        /*定義資料個數為8*/

/*調整指定節點的位置*/
void adjust_to_heap(int list[], int n, int i)
{
  int temp, large;
  temp = list[i];                   		/*令temp為欲調整位置的節點*/
  while (2 * i + 1 < n){             		/*當list[i] 有左子節點時*/
    large = 2 * i + 1;             			/*令大子節點為list[i] 的左子節點*/
    /*若有右子節點且大於左子節點，就令大子節點為右子節點*/
    if ((large + 1) < n && list[large] < list[large + 1])
      large = large + 1;
    /*若temp大於等於其大子節點，就跳出*/
    if (temp >= list[large])
      break;
    list[i] = list[large];          		/*將其大子節點往上移一階*/
    i = large;                      		/*繼續往下做比較*/ 
  }
  list[i] = temp;
}

/*建構最大堆積－方式二：由下而上*/
void construct_heap2(int list[], int n)
{
  /*一一調整最後一個有子節點的節點到樹根的位置*/
  for (int i = n/2 - 1; i >= 0; i--)
    adjust_to_heap(list, n, i);
}

/*堆積排序*/
void heap_sort(int list[], int n)
{
  int temp;
  construct_heap2(list, n);    	  /*建構最大堆積*/
  while (n > 1){
    temp = list[0];           		/*將樹根與最後一個節點交換*/
    list[0] = list[n - 1];
    list[n - 1] = temp;
    n--;                 				  /*將最大堆積的節點個數遞減1*/
    adjust_to_heap(list, n, 0);	  /*調整新樹根的位置，以保持最大堆積的形式*/
  }
}

int main()
{
  int list[N] = {15, 42, 29, 66, 73, 15, 10, 19};
  heap_sort(list, N);
  printf("排序結果為：");
  for (int i = 0; i < N; i++)
    printf("%d ", list[i]);
}