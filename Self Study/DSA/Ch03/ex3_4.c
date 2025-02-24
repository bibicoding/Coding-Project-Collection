void delete(int value)
{
  if (head->next == NULL)											  /*檢查是否為空串列*/
    printf("串列是空的無法做刪除\n");						  /*是就印出此訊息*/
  else{																			    /*否則找出欲刪除的節點*/
    previous = head;
    current = head->next;   
    while ((current != NULL) && (current->data != value)){
      previous = current;
      current = current->next;
    }
    if (current != NULL){											  /*檢查找到的節點是否存在*/
      previous->next = current->next;						/*是就刪除該節點*/
      free(current);
    }
    else printf("%d 不存在無法做刪除\n", value);	/*否則印出此訊息*/
  }
}