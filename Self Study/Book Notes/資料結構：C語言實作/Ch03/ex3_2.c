#include <stdio.h>
#include <stdlib.h>

void insert(int value)
{
  list_pointer ptr;
  ptr = (list_pointer)malloc(sizeof(list_node));	/*配置記憶體空間給新節點*/
  ptr->data = value;											        /*設定新節點的data欄位*/
  previous = head;												        /*令前一個節點指向首節點*/
  current = head->next;										        /*令目前節點指向首節點的下一個節點*/
  while ((current != NULL) && (current->data > ptr->data))  {	/*找出新節點要插入的位置*/
    previous = current;
    current = current->next;
  }
  ptr->next = current;											      /*令新節點的鏈結指向目前節點*/
  previous->next = ptr;										        /*令前一個節點的鏈結指向新節點*/
}