void traverse()
{
  if (head->rlink == head) 				  /*檢查是否為空串列*/
    printf("串列是空的無法印出");     /*是就印出此訊息*/
  else{														  /*否則印出所有節點的data欄位*/
    current = head->rlink; 					/*令目前節點指向首節點的下一個節點*/
    while (current != head){ 				/*當目前節點尚未抵達串列的尾端時*/
      printf("%d ", current->data);	/*印出目前節點的data欄位*/
      current = current->rlink; 		/*令目前節點指向下一個節點*/
    }
  }
}