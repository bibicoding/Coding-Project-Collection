#include <stdio.h>
#include <stdlib.h>

/*定義雜湊表是由13個串列所組成*/
#define b 13

/*定義雜湊表的空位為EMPTY*/
#define EMPTY -32768

/*宣告list_node是單向鏈結串列的節點*/
typedef struct node{
  int key;							/*節點的鍵值欄位*/
  struct node *next;		/*節點的鏈結欄位*/
 }list_node;

/*宣告list_pointer是指向節點的指標*/
 typedef list_node *list_pointer;

/*宣告雜湊表ht是由b個串列所組成*/
list_pointer ht[b];

/*這個函數會將雜湊表初始化*/
void initialize()
{
  for (int i = 0; i < b; i++){
    ht[i] = (list_pointer)malloc(sizeof(list_node));
    ht[i]->key = EMPTY;
    ht[i]->next = NULL;
  }  
}

/*這個函數會將鍵值透過雜湊函數轉換成位址*/
int hash(int key)
{
  return key % b;
}

/*這個函數會將根據位址將鍵值存放在對應的串列*/
void insert(int key)
{
  int address;
  list_pointer ptr, tmp;
  ptr = (list_pointer)malloc(sizeof(list_node));	/*配置記憶體空間給新節點*/
  ptr->key = key;                     				    /*將鍵值存放在新節點*/
  ptr->next = NULL;               						    /*令新節點指向NULL*/
  address = hash(key);            						    /*將鍵值透過雜湊函數轉換成位址*/
  tmp = ht[address];                					    /*根據位址令tmp指向該串列的開頭*/
  while (tmp->next != NULL)           				    /*令tmp指向該串列的尾端*/
    tmp = tmp->next;
  tmp->next = ptr;               						      /*令tmp指向新節點*/
}
 
/*這個函數會依照各個串列的內容印出雜湊表的所有鍵值*/
void show()
{
  list_pointer tmp;
  for (int i = 0; i < b; i++){
    printf("ht[%d]:\t", i);
    tmp = ht[i];
    do{
      if (tmp->key != EMPTY) printf("%d\t", tmp->key);
      if (tmp->next == NULL) break;
      tmp = tmp->next;
    }while (1);
    printf("\n");
  }
}

/*主程式*/
int main()
{
  /*將雜湊表初始化*/
  initialize();
  /*將13、14、26、60、39、40、86、15、25等鍵值放入雜湊表*/
  insert(13);
  insert(14);
  insert(26);
  insert(60);
  insert(39);
  insert(40);
  insert(86);
  insert(15);
  insert(25);
  /*依照各個串列的內容印出雜湊表的所有鍵值*/
  show();
}