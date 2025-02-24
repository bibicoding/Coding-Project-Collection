#include <stdio.h>
#define V 6			/*定義圖形的頂點個數為6*/
#define E 10		/*定義圖形的邊數為10*/

/*宣告edge結構用來存放邊*/
typedef struct e{
  int Vi;				/*邊的起點*/
  int Vj;				/*邊的終點*/
  int cost;			/*邊的權重*/
  int selected;	/*邊的狀態，0表示未被考慮，1表示已被選取，2表示已被排除*/
}edge;

/*宣告edges[] 陣列用來存放圖形的所有邊*/
 edge edges[E];

/*宣告parent[] 陣列用來存放互斥集合，頂點0 ~ 5將存放在索引為0 ~ 5的位置*/
int parent[V];

/*宣告graph[][] 陣列，主程式據此設定edges[] 中所有邊的起點、終點、權重及狀態*/
int graph[E][4] = {0, 1,  6, 0,
                   0, 4, 19, 0,
                   0, 5, 21, 0,
                   1, 2,  5, 0,
                   1, 3, 16, 0,
                   1, 5, 11, 0,
                   2, 3, 10, 0,
                   3, 4,  8, 0,
                   3, 5,  9, 0,
                   4, 5,  7, 0};

/*這個函數會從尚未考慮過的邊中選取權重最小者，然後傳回其索引*/
int select_edge()
{
  int i, e_index = 0, mincost = 32767;
  
  for (i = 0; i < E; i++)
    if ((edges[i].selected == 0) && (edges[i].cost < mincost)){
      e_index = i;
      mincost = edges[i].cost;
    }
  return e_index;
}

/*這個函數會在互斥集合中搜尋參數指定的元素位於哪個集合並傳回該集合的樹根*/
int find(int i)
{
  while (parent[i] > 0)
    i = parent[i];
  return i;
}

/*這個函數會判斷將指定的邊加入擴張樹是否會造成循環，是就傳回1，否則傳回0*/
int cycle(int e_index)
{
  int i = find(edges[e_index].Vi);	/*找出邊的起點所在之集合的樹根*/
  int j = find(edges[e_index].Vj);	/*找出邊的終點所在之集合的樹根*/
  if (i == j) return 1;     				/*若樹根相同，表示位於相同集合，就傳回1*/
  return 0;                 				/*否則傳回0*/ 
}

/*這個函數會將邊的頂點加入擴張樹的頂點集合並標示為已選取*/ 
void add_edge(int e_index)
{
  int i = find(edges[e_index].Vi);	/*找出邊的起點所在之集合的樹根*/ 
  int j = find(edges[e_index].Vj);	/*找出邊的終點所在之集合的樹根*/
  parent[i] = j;		    						/*令第一個集合成為第二個集合的子樹*/
  edges[e_index].selected = 1;			/*將該邊標示為已選取*/
}

/*這個函數會印出最小成本擴張樹的邊及權重總和*/
void show_spanningtree()
{
  int i, totalcost = 0;
  printf("被選取的邊為 ");
  for (i = 0; i < E; i++)
    if(edges[i].selected == 1){
      printf("(%d, %d) ", edges[i].Vi, edges[i].Vj);
      totalcost += edges[i].cost; 
    }
  printf("\n最小成本擴張樹的權重總和為%d", totalcost);
}

/*這個函數會實作Kruskal演算法*/
void kruskal()
{
  /*這個變數用來記錄目前的邊的索引*/
  int e_index;
  /*這個變數用來記錄已經選取的邊數，初始值為0*/
  int e_num = 0;
  
  while (e_num < V - 1){						/*當選取的邊數小於頂點個數減1時*/
    e_index = select_edge();   			/*選取未被考慮且權重最小的邊*/
    if (cycle(e_index) == 0){  			/*若該邊加入擴張樹不會造成循環*/
      add_edge(e_index);       			/*將該邊加入擴張樹*/
      e_num++;              				/*將已經選取的邊數遞增1*/
    }
    else
      edges[e_index].selected = 2;	/*否則將該邊排除*/
  }
  show_spanningtree();          		/*印出最小成本擴張樹的邊及權重總和*/ 
}

/*主程式*/
int main()
{
  for (int i = 0; i < V; i++)				/*將用來存放互斥集合的陣列初始化*/
    parent[i] = -1;
  for (int i = 0; i < E; i++){			/*根據graph[][] 將所有邊放入edges[]*/
    edges[i].Vi = graph[i][0];
    edges[i].Vj = graph[i][1];
    edges[i].cost = graph[i][2];
    edges[i].selected = graph[i][3];
  }  
  kruskal();
 }