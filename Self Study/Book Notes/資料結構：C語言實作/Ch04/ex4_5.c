#include <stdio.h>
#include <stdlib.h>

/*宣告list_node是單向鏈結串列的節點*/
typedef struct node{
  int data;						  /*節點的資料欄位*/
  struct node *next;		/*節點的鏈結欄位*/
}list_node;

/*宣告list_pointer是指向節點的指標*/
typedef list_node *list_pointer;

/*宣告兩個指標，分別指向單向鏈結串列的首節點及目前節點*/
list_pointer head, current;

/*這個函數會將串列初始化，即包含首節點的空串列*/
void initialize()
{
  head = (list_pointer)malloc(sizeof(list_node));
  head->next = NULL; 
}

/*這個函數會將新節點推入串列前端*/
void push(int value)
{
  list_pointer ptr;
  ptr = (list_pointer)malloc(sizeof(list_node));	/*配置記憶體空間給新節點*/
  if (ptr == NULL)													      /*檢查是否配置失敗*/
    printf("記憶體配置失敗！");                    /*是就印出此訊息*/
  else{  																          /*否則將新節點推入串列前端*/
    ptr->data = value;											      /*設定新節點的值*/
    ptr->next = head->next;									      /*令新節點指向首節點的下一個節點*/
    head->next = ptr;    										      /*令首節點指向新節點*/
  }
}

/*這個函數會彈出串列前端的節點*/
void pop()
{
  current = head->next;   						/*令目前節點指向首節點的下一個節點*/
  if (current == NULL)							  /*檢查目前節點是否為NULL*/
    printf("串列已空！");						   /*是就印出此訊息*/
  else{														    /*否則彈出目前節點，然後釋放*/
    printf("%d ", current->data);		  /*印出目前節點的值*/
    head->next = current->next;			  /*令首節點指向目前節點的下一個節點*/
    free(current);									  /*釋放目前節點*/
  } 
}

int main()
{
  initialize();
  push(10);
  push(20);
  push(30);
  push(40);
  push(50);
  pop();
  pop();
  pop();
  pop();
}
