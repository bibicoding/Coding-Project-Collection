#include <stdio.h>
#include <stdlib.h>

/*宣告dlist_node是環狀雙向鏈結串列的節點*/
typedef struct dnode{
  struct dnode *llink;		/*節點的左鏈結欄位*/
  int data;							  /*節點的資料欄位*/
  struct dnode *rlink;		/*節點的右鏈結欄位*/
}dlist_node;

/*宣告dlist_pointer是指向節點的指標*/
typedef dlist_node *dlist_pointer;

dlist_pointer head, current;

void initialize()
{
  head = (dlist_pointer)malloc(sizeof(dlist_node)); 	/*配置記憶體空間給首節點*/
  head->llink = head;													        /*令首節點的左鏈結指向自己*/
  head->rlink = head; 													      /*令首節點的右鏈結指向自己*/
}

void insert(int value)
{
  dlist_pointer ptr;
  ptr = (dlist_pointer)malloc(sizeof(dlist_node));	/*配置記憶體空間給新節點*/
  ptr->data = value;											          /*設定新節點的data欄位*/
  current = head->rlink;										        /*令目前節點指向首節點的下一個節點*/
  while ((current != head) && (current->data > ptr->data))	/*找出新節點要插入的位置*/
    current = current->rlink;
  ptr->llink = current->llink; 						          /*令新節點的左鏈結指向目前節點的左節點*/
  ptr->rlink = current;									            /*令新節點的右鏈結指向目前節點*/
  current->llink->rlink = ptr;						          /*令目前節點的左節點的右鏈結指向新節點*/
  current->llink = ptr;									            /*令目前節點的左鏈結指向新節點*/
}

void delete(int value)
{
  if (head->rlink == head) 											    /*檢查是否為空串列*/
    printf("串列是空的無法做刪除\n");						      /*是就印出此訊息*/
  else{																			        /*否則找出欲刪除的節點*/
    current = head->rlink;   
    while ((current != head) && (current->data != value))
      current = current->rlink;
    if (current != head){ 											    /*檢查找到的節點是否存在*/
      current->llink->rlink = current->rlink;		    /*是就刪除該節點*/
      current->rlink->llink = current->llink;
      free(current);
    }           
    else printf("%d 不存在無法做刪除\n", value);	   /*否則印出此訊息*/
  }
}

void traverse()
{
  if (head->rlink == head) 					                /*檢查是否為空串列*/
    printf("串列是空的無法印出");		                  /*是就印出此訊息*/
  else{														                  /*否則印出所有節點的data欄位*/
    current = head->rlink; 					                /*令目前節點指向首節點的下一個節點*/
    while (current != head){ 				                /*當目前節點尚未抵達串列的尾端時*/
      printf("%d ", current->data);	                /*印出目前節點的data欄位*/
      current = current->rlink; 			              /*令目前節點指向下一個節點*/
    }
  }
}

int main()
{
  initialize();
  insert(15);
  insert(20);
  insert(30);
  insert(25);
  insert(50);
  delete(30);
  insert(80);
  insert(10);
  delete(25);
  insert(60);
  traverse();
}