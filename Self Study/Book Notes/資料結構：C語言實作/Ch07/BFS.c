#include <stdio.h>
#include <stdlib.h>
#define TRUE 1          		/*定義已經拜訪過的頂點為TRUE*/
#define FALSE 0         		/*定義尚未拜訪過的頂點為FALSE*/
#define MAX_VERTICES 50 		/*定義圖形最多有MAX_VERTICES個頂點*/

/*宣告vertex_node是圖形的頂點*/
typedef struct node{
  char vertex;							/*節點的資料欄位*/
  struct node *next;				/*節點的鏈結欄位*/
}vertex_node;
/*宣告vertex_pointer是指向節點的指標*/
typedef vertex_node *vertex_pointer;
/*宣告用來存放圖形的指標陣列*/
vertex_pointer graph[MAX_VERTICES];
/*宣告用來記錄頂點是否已經拜訪過的陣列*/
int visited[MAX_VERTICES];
/*宣告n是圖形的頂點個數*/
int n = 8;
/*宣告用來表示圖形的相鄰矩陣*/
int admatrix[8][8] = {0, 1, 1, 0, 0, 0, 0, 0,
                      1, 0, 0, 1, 1, 0, 0, 0,
                 	     1, 0, 0, 0, 0, 1, 1, 0,
                      0, 1, 0, 0, 0, 0, 0, 1,
                 	     0, 1, 0, 0, 0, 0, 0, 1,
                 	     0, 0, 1, 0, 0, 0, 0, 1,
                 	     0, 0, 1, 0, 0, 0, 0, 1,
                 	     0, 0, 0, 1, 1, 1, 1, 0};


/*這個函數會根據圖形的相鄰矩陣建立相鄰串列*/
void create_adlist()
{
  vertex_pointer ptr, tail;
  
  /*建立headnode並將其設定為尚未拜訪過*/
  for (int i = 0; i < n; i++){
    graph[i] = (vertex_pointer)malloc(sizeof(vertex_node));
    graph[i]->vertex = i + 'A';
    graph[i]->next = NULL;
    visited[i] = FALSE;
  }
  
  /*分別針對各個頂點的相鄰頂點建立鏈結串列*/
  for (int i = 0; i < n; i++)
    for (int j = 0; j < n; j++)
      if (admatrix[i][j] != 0){
        ptr = (vertex_pointer)malloc(sizeof(vertex_node));
        ptr->vertex = j + 'A';
        ptr->next = NULL;
        tail = graph[i];          	/*令tail指向headnode*/ 
        while (tail->next != NULL)	/*找出headnode後面的鏈結串列的最後一個節點*/ 
          tail = tail->next;
        tail->next = ptr;         	/*將新節點插入鏈結串列的尾端*/
      }
}

/*這個函數會印出圖形的相鄰串列*/ 
void show_adlist()
{
  vertex_pointer tmp;
  for (int i = 0; i < n; i++){
    printf("%c : ", graph[i]->vertex);		/*印出headnode*/
    tmp = graph[i]->next;
    while (tmp != NULL){         				/*印出headnode的相鄰頂點*/
      printf("%c ", tmp->vertex);
      tmp = tmp->next;
    }
    printf("\n");
  }
}

/*定義佇列最多可以存放MAX_SIZE個資料*/
#define MAX_SIZE 50

/*宣告queue是佇列資料結構*/
typedef struct que{
  int data[MAX_SIZE];		/*存放佇列的資料*/
  int front;						/*記錄佇列的前端*/
  int rear; 						/*記錄佇列的後端*/
}queue;

queue Q;								/*宣告一個佇列Q*/

/*這個函數會將參數指定的資料放入環狀佇列的後端，成功就傳回1，否則傳回0*/
int enqueue(int value)
{
  /*若佇列已滿，就傳回0*/
  if ((Q.rear + 1) % MAX_SIZE == Q.front) return 0;
  Q.rear = (Q.rear + 1) % MAX_SIZE;
  Q.data[Q.rear] = value;
  return 1;
}

/*這個函數會從佇列的前端取出資料存放在參數，成功就傳回1，失敗則傳回0*/
int dequeue(int *value)
{
  /*若佇列已空，就傳回0*/
  if (Q.front == Q.rear) return 0;
  Q.front = (Q.front + 1) % MAX_SIZE;
  *value = Q.data[Q.front];
  return 1;
}

/*這個函數會印出圖形的廣度優先搜尋結果*/
void bfs(int v)
{
  vertex_pointer tmp;

  printf("%c ", v + 'A');
  visited[v] = TRUE;
  enqueue(v);
  while (dequeue(&v)){
    for (tmp = graph[v]; tmp; tmp = tmp->next)
      if (visited[tmp->vertex - 'A'] == FALSE){
        printf("%c ", tmp->vertex);
        visited[tmp->vertex - 'A'] = TRUE;
        enqueue(tmp->vertex - 'A');
      }
  }
}

/*主程式*/
int main()
{
  create_adlist();

  printf("圖形的相鄰串列：\n");
  show_adlist();

  printf("廣度優先搜尋結果：");
  /*將佇列的前端front初始化為0*/
  Q.front = 0;
  /*將佇列的後端rear初始化為0*/
  Q.rear = 0;
  /*呼叫此函數以起始頂點為A進行廣度優先搜尋*/
  bfs(0);
}