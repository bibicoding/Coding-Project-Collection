void delete(int value)
{
  if (head->rlink == head) 											/*檢查是否為空串列*/
    printf("串列是空的無法做刪除\n");						  /*是就印出此訊息*/
  else{																			    /*否則找出欲刪除的節點*/
    current = head->rlink;   
    while ((current != head) && (current->data != value))
      current = current->rlink;
    if (current != head){ 											/*檢查找到的節點是否存在*/
      current->llink->rlink = current->rlink;		/*是就刪除該節點*/
      current->rlink->llink = current->llink;
      free(current);
    }           
    else printf("%d 不存在無法做刪除\n", value);	/*否則印出此訊息*/
  }
}