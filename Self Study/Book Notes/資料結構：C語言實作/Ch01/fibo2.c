#include <stdio.h>

int fibo(int n)
{
  if (n == 0) return 0;
  else if (n == 1) return 1;
  else return fibo(n - 1) + fibo(n - 2);
}

int main()
{
  /*使用迴圈印出費伯納西數列的前10個數字*/
  for (int i = 0; i < 10; i++)
    printf("%d\n", fibo(i));
}