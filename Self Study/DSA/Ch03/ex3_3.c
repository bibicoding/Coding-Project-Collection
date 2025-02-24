#include <stdio.h>
#include <stdlib.h>

/*宣告list_node是單向鏈結串列的節點*/
typedef struct node{
  int data;						  /*節點的資料欄位*/
  struct node *next;		/*節點的鏈結欄位*/
}list_node;

/*宣告list_pointer是指向節點的指標*/
typedef list_node *list_pointer;

/*宣告三個指標，分別指向單向鏈結串列的首節點、目前節點及前一個節點*/
list_pointer head, current, previous;

/*這個函數會將串列初始化，即包含首節點的空串列*/
void initialize()
{
  head = (list_pointer)malloc(sizeof(list_node));
  head->next = NULL; 
}

/*這個函數會依照由大到小的順序將參數value指定的值插入串列*/ 
void insert(int value)
{
  list_pointer ptr;
  ptr = (list_pointer)malloc(sizeof(list_node));
  ptr->data = value;
  previous = head;
  current = head->next;
  while ((current != NULL) && (current->data > ptr->data)){
    previous = current;
    current = current->next;
  }
  ptr->next = current;
  previous->next = ptr;
}

/*這個函數會印出串列內所有節點的data欄位*/
void traverse()
{
  if (head->next == NULL)
    printf("串列是空的無法印出");
  else{
    current = head->next;
    while (current != NULL){
      printf("%d ", current->data);
      current = current->next; 
    }
  }
}

/*主程式*/
int main()
{
  initialize(); 	/*將串列初始化為包含首節點的空串列*/
  insert(30);		  /*插入30*/
  insert(20); 		/*插入20*/
  insert(80); 		/*插入80*/
  insert(50);		  /*插入50*/
  traverse();		  /*依序印出所有節點*/
}