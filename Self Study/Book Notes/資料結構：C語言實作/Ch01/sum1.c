#include <stdio.h>

/*使用迭代的方式計算n個整數的總和*/
int sum(int list[], int n)		
{
  int result = 0;
  for (int i = 0; i < n; i++)
    result = result + list[i];
  return result;
}

int main()
{
  int arr[] = {25, 30, 18, 7, 10};
  int result = sum(arr, 5); 
  printf("%d", result);
}