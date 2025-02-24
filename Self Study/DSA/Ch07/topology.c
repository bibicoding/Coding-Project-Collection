#include <stdio.h>

/*定義有向圖形的頂點個數為8*/
#define V 8

/*宣告admatrix[][]陣列存放有向圖形的相鄰矩陣*/ 
int admatrix[V][V] = {0, 1, 1, 1, 0, 0, 0, 0,
                      0, 0, 0, 0, 1, 1, 0, 0,
                      0, 0, 0, 0, 0, 1, 0, 0,
                      0, 0, 0, 0, 0, 0, 1, 0,
                      0, 0, 0, 0, 0, 1, 0, 0,
                      0, 0, 0, 0, 0, 0, 0, 1,
                      0, 0, 0, 0, 0, 0, 0, 1,
                      0, 0, 0, 0, 0, 0, 0, 0};

int indegree[V];  /*記錄每個頂點的進入分支度*/
int outputed[V];  /*記錄每個頂點是否已經輸出，1表示是，0表示否*/               

/*這個函數會選擇沒有前行者的頂點，即尚未輸出且進入分支度為0的頂點*/
int select_vertex()
{
  for (int i = 0; i < V; i++)
    if (outputed[i] == 0 && indegree[i] == 0) return i;
}

/*這個函數會實作拓樸排序*/
void topology_sort()
{
  int i, j, Vx;
  for (i = 0; i < V; i++){      		/*將陣列初始化*/
    indegree[i] = 0;
    outputed[i] = 0;
  }
  for (i = 0; i < V; i++)       		/*計算每個頂點的進入分支度*/
    for (j = 0; j < V; j++)
      if (admatrix[i][j] == 1)
        indegree[j]++;
  for (i = 0; i < V; i++){      		/*拓樸排序的迴圈必須重複V次才能結束*/
    Vx = select_vertex();       		/*選擇尚未輸出且沒有前行者的頂點*/
    printf("V%d ", Vx);        		/*輸出該頂點*/
    outputed[Vx] = 1; 						/*將該頂點記錄為已經輸出*/
    for (j = 0; j < V; j++)    		/*將該頂點所連接出去的邊刪除*/
      if (admatrix[Vx][j] == 1){
        admatrix[Vx][j] = 0;
        indegree[j]--;
      }
  }
}

/*主程式*/
int main()
{
  topology_sort();
}
