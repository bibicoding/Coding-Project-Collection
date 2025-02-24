void concatenate(list_pointer A, list_pointer B)
{
  list_pointer ptr = A;				/*令ptr指向串列A*/
  while (ptr->next != NULL)		/*當ptr尚未抵達串列A的尾端時*/
    ptr = ptr->next;					/*令ptr指向下一個節點*/
  ptr->next = B->next;				/*令ptr指向串列B的首節點的下一個節點*/
  free(B);  									/*釋放串列B的首節點*/
}