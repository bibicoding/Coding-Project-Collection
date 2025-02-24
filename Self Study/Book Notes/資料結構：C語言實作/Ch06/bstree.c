#include <stdio.h>
#include <stdlib.h>
/*宣告tree_node是二元樹的節點*/
typedef struct node{
  struct node *lchild;			/*節點的左鏈結欄位*/
  char data;								/*節點的資料欄位*/
  struct node *rchild;			/*節點的右鏈結欄位*/
}tree_node;

/*宣告tree_pointer是指向節點的指標*/
typedef tree_node *tree_pointer;

/*這個函數會印出二元樹的中序走訪結果*/ 
void inorder(tree_pointer root)
{
  if (root){
    inorder(root->lchild);
    printf("%d ", root->data);
    inorder(root->rchild);
  }
}

/*這個函數會根據參數key指定的鍵值在二元搜尋樹搜尋節點*/
tree_pointer search(tree_pointer root, int key)
{
  tree_pointer current;
  current = root;
  while (current){
    if (key == current->data) return current;
    if (key < current->data) current = current->lchild;
    else current = current->rchild;
  }
  return NULL;
}

/*這個函數會在二元搜尋樹插入節點*/
tree_pointer insert(tree_pointer root, int key)
{
  tree_pointer ptr, current, previous;
  if (search(root, key)){									        /*搜尋新節點是否已經存在*/
    printf("資料已存在，無法再插入節點！");	         /*是就印出錯誤訊息並傳回樹根*/
    return root; 
  }
  ptr = (tree_pointer)malloc(sizeof(tree_node));	/*否則將新節點插入二元搜尋樹*/
  ptr->data = key;
  ptr->lchild = NULL;
  ptr->rchild = NULL;
  if (!root) root = ptr;			/*若為空樹，就將新節點當做樹根*/
  else{											  /*否則根據其大小將新節點插入子樹的尾端*/
    current = root;
    while (current){
      previous = current; 
      if (ptr->data < current->data) current = current->lchild;
      else current = current->rchild; 
    } 
    if (ptr->data < previous->data) previous->lchild = ptr;
    else previous->rchild = ptr;
  }
  return root;
}

/*主程式*/
int main()
{
  /*呼叫insert() 函數一一插入25、30、24、58、45、26、12、14等節點*/
  tree_pointer root = NULL;
  root = insert(root, 25);
  root = insert(root, 30);
  root = insert(root, 24);
  root = insert(root, 58);
  root = insert(root, 45);
  root = insert(root, 26);
  root = insert(root, 12);
  root = insert(root, 14);
  /*印出二元搜尋樹的中序走訪結果*/
  inorder(root);
 }