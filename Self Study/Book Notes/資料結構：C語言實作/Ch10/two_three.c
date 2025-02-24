/*宣告two_three_node是2-3樹的節點*/
typedef struct node{
  struct node *lchild;		/*節點的左鏈結欄位*/
  char lkey;							/*節點的左鍵值欄位*/
  struct node *mchild;		/*節點的中鏈結欄位*/
  char rkey;							/*節點的右鍵值欄位*/
  struct node *rchild;		/*節點的右鏈結欄位*/
}two_three_node;

/*宣告two_three_pointer是指向節點的指標*/
typedef two_three_node *two_three_pointer;