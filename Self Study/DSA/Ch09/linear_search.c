int linear_search(int ht[], int key)
{
  int address;
  address = key % b;              							      /*將鍵值轉換成位址*/
  while (ht[address] != key){       						      /*當不等於鍵值時*/
    address = (address + 1) % b;  							      /*往下一個位址探測*/
    if (ht[address] == EMPTY || address == key % b)	  /*若為空位或返回原處*/
      return -1;                              		    /*就傳回-1，表示搜尋失敗*/
  }
  return address;
}