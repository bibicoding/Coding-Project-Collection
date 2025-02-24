#include <stdio.h>

int sequential_search(int list[], int n, int key)
{
  for (int i = 0; i < n; i++)
    if (list[i] == key)			/*比對陣列內的資料是否等於欲搜尋的鍵值*/
      return i;						  /*若找到鍵值符合的資料，就傳回其索引*/
  return -1;								/*若找不到鍵值符合的資料，就傳回 -1*/
}

int main()
{
  int list[] = {54, 2, 40, 22, 17, 22, 60, 35};    
  printf("%d", sequential_search(list, 8, 22));      
}