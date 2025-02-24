int count()
{
  int length = 0;
  current = head->next;					/*令目前節點指向首節點的下一個節點*/
  while (current != NULL){			/*當目前節點尚未抵達串列的尾端時*/
    length++;									  /*令長度遞增1*/
    current = current->next; 		/*令目前節點指向下一個節點*/
  }
  return length;
}