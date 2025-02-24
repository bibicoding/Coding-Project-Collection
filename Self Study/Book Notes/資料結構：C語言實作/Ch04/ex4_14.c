#include <stdio.h>

void hanoi(int n, char from, char through, char to)
{
  if (n > 0){
    hanoi(n - 1, from, to, through);
    printf("將%d號圓盤從柱子%c移到柱子%c\n", n, from, to);
    hanoi(n - 1, through, from, to);
  }
}

int main()
{
    hanoi(3, 'A', 'B', 'C');
}