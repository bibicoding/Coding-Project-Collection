#include <stdio.h>
#include <stdlib.h>

/*宣告list_node是單向鏈結串列的節點*/
typedef struct node{
  int data;						  /*節點的資料欄位*/
  struct node *next;		/*節點的鏈結欄位*/
}list_node;

/*宣告list_pointer是指向節點的指標*/
typedef list_node *list_pointer;

/*宣告兩個指標，分別指向佇列的前端與後端*/
list_pointer front, rear;

/*這個函數會將資料放入佇列的後端*/
void enqueue(int value)
{
  list_pointer ptr;
  ptr = (list_pointer)malloc(sizeof(list_node));	/*配置記憶體空間給新節點*/
  ptr->data = value;												      /*設定新節點的data欄位*/
  ptr->next = NULL;												        /*設定新節點的next欄位*/
  if (rear == NULL) front = ptr;							    /*若為空佇列，就令front指向新節點*/
  else rear->next = ptr;										      /*否則將新節點插入rear後面*/
  rear = ptr;  														        /*令rear指向新節點*/
}

/*這個函數會從佇列的前端刪除資料*/
void dequeue()
{
  list_pointer ptr;
  if (front == NULL) printf("佇列已空！");	       /*若為空佇列，就印出此訊息*/
  else{																	          /*否則刪除佇列前端的資料*/
    printf("%d ", front->data);
    ptr = front;
    front = front->next;
    free(ptr);
  }
}

int main()
{
  enqueue(10);
  enqueue(20);
  enqueue(30);
  enqueue(40);
  enqueue(50);
  dequeue();
  dequeue();
  dequeue();
  dequeue();
  enqueue(60);
  enqueue(70);
  dequeue();
  dequeue();
  dequeue();
  dequeue();  
}