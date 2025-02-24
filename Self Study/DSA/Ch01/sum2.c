#include <stdio.h>

/*使用遞迴的方式計算n個整數的總和*/
int sum(int list[], int n)	
{
  if (n)
    return (sum(list, n - 1) + list[n - 1]);
  return 0;
}

int main()
{
  int arr[] = {25, 30, 18, 7, 10};
  int result = sum(arr, 5); 
  printf("%d", result);
}