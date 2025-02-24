#include <stdio.h>

int main()
{
  /*將五個正整數存放在陣列*/
  int list[5] = {25, 30, 18, 7, 10};
  /*將最大數的初始值設定為0*/
  int largest = 0;

  /*使用for迴圈找出最大數*/
  for (int i = 0; i < 5; i++)
    /*若list[i]比較大，就將最大數設定為list[i]*/
    if (list[i] > largest) largest = list[i];

  /*印出最大數*/
  printf("最大數為%d", largest);
}