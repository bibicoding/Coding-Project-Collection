#include <stdio.h>

int fibo(int n)
{
  int fn; 										/*宣告變數fn代表fibo(n)*/
  int fn1; 									  /*宣告變數fn1代表fibo(n-1)*/
  int fn2;										/*宣告變數fn2代表fibo(n-2)*/
  if (n == 0) return 0;				/*當n=0時，fibo(n)=fibo(0)=0*/
  else if (n == 1) return 1;	/*當n=1時，fibo(n)=fibo(1)=1*/
  else{											  /*當n≥2時，fibo(n)=fibo(n-1)+fibo(n-2)*/
    fn2 = 0;
    fn1 = 1;
    for (int i = 2; i <= n; i++){
      fn = fn1 + fn2;
      fn2 = fn1;
      fn1 = fn;
    }
  }
  return fn;
}

int main()
{
  /*使用迴圈印出費伯納西數列的前10個數字*/
  for (int i = 0; i < 10; i++)	
    printf("%d\n", fibo(i));
}