#include <stdio.h>

int find_largest(int list[], int n)
{
  int largest = 0;													/*將最大數的初始值設定為0*/
  for (int i = 0; i < n; i++)								/*使用for迴圈找出最大數*/
    if (list[i] > largest) largest = list[i];
  return largest;
}

int main()
{
  /*將五個正整數存放在陣列*/
  int list[5] = {25, 30, 18, 7, 10};	
  	      
  int largest = find_largest(list, 5);

  /*印出最大數*/
  printf("最大數為%d", largest);
}