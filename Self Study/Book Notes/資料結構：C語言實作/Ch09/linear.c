#include <stdio.h>
#define b 13          						/*定義雜湊表的大小為13*/
#define EMPTY -32768  						/*定義雜湊表的空位為EMPTY*/

/*使用線性探測法將鍵值key放入雜湊表ht[]*/
int linear_probe(int ht[], int key)
{
  int address;
  address = key % b;            		/*將鍵值轉換成位址*/
  while (ht[address] != EMPTY)   		/*當發生碰撞時*/
    address = (address + 1) % b;  	/*往下一個位址探測*/
  ht[address] = key;   						  /*將鍵值放入雜湊表*/
}

int main()
{
  /*宣告ht[b] 為雜湊表*/
  int ht[b], i;
  /*將雜湊表初始化為EMPTY*/
  for (i = 0; i < b; i++) ht[i] = EMPTY;
  /*一一將鍵值放入雜湊表*/
  linear_probe(ht, 13);
  linear_probe(ht, 14);
  linear_probe(ht, 26);
  linear_probe(ht, 39);
  linear_probe(ht, 45);
  linear_probe(ht, 32);
  /*印出雜湊表的內容*/
  for (i = 0; i < b; i++) printf("%d\n", ht[i]);
}