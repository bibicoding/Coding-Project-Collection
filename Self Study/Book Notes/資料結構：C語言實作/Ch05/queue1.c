#include <stdio.h>

/*定義佇列最多可以存放MAX_SIZE個資料*/
#define MAX_SIZE 6

/*宣告queue是佇列資料結構*/
typedef struct que{
  char data[MAX_SIZE];		/*存放佇列的資料*/
  int front;							/*記錄佇列的前端*/
  int rear; 							/*記錄佇列的後端*/
}queue;

queue Q;									/*宣告一個佇列Q*/

void enqueue(queue *Q, char value)
{
  /*檢查rear往順時針方向移動一個位置是否會碰到front，是就印出佇列已滿*/
  if ((Q->rear + 1) % MAX_SIZE == Q->front)
    printf("佇列已滿！");
  else{
    Q->rear = (Q->rear + 1) % MAX_SIZE;	  /*否則將rear往順時針方向移動一個位置*/
    Q->data[Q->rear] = value;					    /*再將資料放入佇列的後端*/
  }
}

void dequeue(queue *Q)
{
  /*檢查front是否等於rear，是就印出佇列已空*/
  if (Q->front == Q->rear)
    printf("佇列已空！");
  else{
    Q->front = (Q->front + 1) % MAX_SIZE;	/*否則將front往順時針方向移動一個位置*/
    printf("%c ", Q->data[Q->front]);			/*再印出佇列前端的資料*/
  }
}

int main()
{
  Q.front = 0;								
  Q.rear = 0; 								   
  enqueue(&Q, 'A');
  enqueue(&Q, 'B');
  enqueue(&Q, 'C');
  enqueue(&Q, 'D');
  dequeue(&Q);
  dequeue(&Q);
  enqueue(&Q, 'E');
  enqueue(&Q, 'F');
  enqueue(&Q, 'G');  
}