#include <stdio.h>
#define N 8											  /*定義欲排序的資料個數為8*/

void bubble_sort(int list[], int n)
{
  int i, j, flag, temp;
  /*相鄰資料兩兩比較的過程共n - 1回合*/
  for (i = n - 1; i >= 1; i--){
    /*flag用來記錄有無發生交換，沒有的話，表示排序完畢*/
    flag = 0;
    /*內部迴圈用來進行每一回合的兩兩比較*/
    for (j = 0; j <= i - 1; j++){
      /*若左邊的資料大於右邊的資料，就交換，flag設定為1*/
      if (list[j] > list[j + 1]){
        temp = list[j];
        list[j] = list[j + 1];
        list[j + 1] = temp;
        flag = 1;
      }
    }
    if (flag = 0)			/*若flag仍為0，表示沒有發生交換，已經排序完畢*/
      break;					/*排序完畢便強制離開外部迴圈*/
  }
}

int main()
{
  int list[N] = {8, 7, 6, 5, 4, 3, 2, 1};
  bubble_sort(list, N);
  printf("排序結果為：");
  for(int i = 0; i < N; i++)
    printf("%d ", list[i]);
}