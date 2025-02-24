#include <stdio.h>

int parent[9];

/*節點i和節點j分別為兩個互斥集合的樹根*/
void set_union(int i, int j)	
{
  /*將i的父節點設定為j，令第一個集合成為第二個集合的子樹*/
  parent[i] = j;
}

int find(int i)
{
  /*從節點i開始回溯父節點，直到小於0，表示抵達樹根*/
  while (parent[i] > 0)
    i = parent[i];
  return i;
}

int main()
{
  /*將用來存放節點的陣列元素初始化為 -1*/
  for (int i = 0; i < 9; i++) parent[i] = -1;	
  /*建構S1集合，令其樹根為2*/
  set_union(0, 2);
  set_union(1, 2);
  /*建構S2集合，令其樹根為4*/
  set_union(3, 4);
  /*建構S3集合，令其樹根為8*/
  set_union(5, 8);
  set_union(6, 8);
  set_union(7, 8);
  /*建構S1∪S2集合，令其樹根為2*/
  set_union(4, 2);

  printf("節點0所在之集合的樹根為節點%d\n", find(0));
  printf("節點3所在之集合的樹根為節點%d\n", find(3));
  printf("節點7所在之集合的樹根為節點%d\n", find(7));
}