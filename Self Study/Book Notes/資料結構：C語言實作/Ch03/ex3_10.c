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