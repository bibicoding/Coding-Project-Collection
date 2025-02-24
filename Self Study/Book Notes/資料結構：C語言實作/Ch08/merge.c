#include <stdio.h>
/*定義欲排序的資料個數為9*/
#define N 9

void merge_sort(int list[], int temp[], int left, int right)
{
  int middle, i, j, k, n;

  if (left < right){
    middle = (left + right) / 2;
    merge_sort(list, temp, left, middle);
    merge_sort(list, temp, middle + 1, right);
    i = left;          			/*i指向左邊的第一個資料*/
    j = middle + 1;       	/*j指向右邊的第一個資料*/
    k = left;           		/*k指向temp[] 的第一個資料*/
    n = right - left + 1;  	/*n為目前正在合併的資料個數*/
    /*依照大小將左右兩邊的資料合併放入temp[]*/
    while (i <= middle && j <= right)
      if (list[i] <= list[j]) temp[k++] = list[i++];
      else temp[k++] = list[j++];
    /*將左邊剩下的資料複製到temp[]*/
    while (i <= middle)
      temp[k++] = list[i++];
    /*將右邊剩下的資料複製到temp[]*/
    while (j <= right)
      temp[k++] = list[j++];
    /*將temp[] 複製回list[]*/
    for(i = 0; i < n; i++, right--)
      list[right] = temp[right];
  }
}

int main()
{
  int list[N] = {68, 27, 6, 15, 74, 3, 12, 1, 50};
  int temp[N];
  merge_sort(list, temp, 0, N - 1);
  printf("排序結果為：");
  for (int i = 0; i < N; i++)
    printf("%d ", list[i]);
}