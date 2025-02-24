#include <stdio.h>

/*定義加權圖形的頂點個數為8*/
#define V 8

/*定義∞的值為32767*/
#define INFINITE 32767

/*宣告admatrix[][] 陣列存放加權圖形的相鄰矩陣*/
int admatrix[V][V] = {0, 7, 3, INFINITE, INFINITE, INFINITE, INFINITE, INFINITE,
                      7, 0, INFINITE, 12, INFINITE, INFINITE, INFINITE, INFINITE,
                      3, INFINITE, 0, 9, 17, 10, INFINITE, INFINITE,
                      INFINITE, 12, 9, 0, INFINITE, INFINITE, INFINITE, 14,
                      INFINITE, INFINITE, 17, INFINITE, 0, INFINITE, INFINITE, INFINITE,
                      INFINITE, INFINITE, 10, INFINITE, INFINITE, 0, 1, 11,
                      INFINITE, INFINITE, INFINITE, INFINITE, INFINITE, 1, 0, 15,
                      INFINITE, INFINITE, INFINITE, 14, INFINITE, 11, 15, 0};

int distance[V]; 				/*存放起始頂點到其它頂點的最短距離*/
int selected[V]; 				/*記錄頂點的最短路徑是否已經選擇，1表示是，0表示否*/
int previous[V]; 				/*記錄各個頂點最短路徑中的前一個頂點*/

/*這個函數會從尚未選擇的頂點中選擇距離最短者，然後傳回其索引*/
int select_shortest()
{
  int i, Vx, shortest = 32767;
  for (i = 0; i < V; i++)
    if (selected[i] == 0 && distance[i] < shortest){
      Vx = i;
      shortest = distance[i];
    }
  return Vx;
}

/*這個函數會實作Dijkstra演算法，參數Vs表示起始頂點*/
void dijkstra(int Vs)
{
  int i, Vx, Vi;
  for (i = 0; i < V; i++){    	/*將陣列初始化*/
    distance[i] = admatrix[Vs][i];
    selected[i] = 0;
    previous[i] = Vs;
  }
  selected[Vs] = 1;        			/*將起始頂點設定為已經選擇*/
  for (i = 0; i < V - 1; i++){	/*令迴圈重複V-1次，整個演算法才宣告結束*/
    Vx = select_shortest();			/*從尚未選擇的頂點中選擇距離最短者*/
    selected[Vx] = 1;					  /*將該頂點設定為已經選擇*/
    /*檢查有沒有尚未選擇的頂點Vi因為行經Vx而使距離變短*/
    for (Vi = 0; Vi < V; Vi++)
      if (selected[Vi] == 0 && (distance[Vi] > distance[Vx] + admatrix[Vx][Vi])){
        distance[Vi] = distance[Vx] + admatrix[Vx][Vi];
        previous[Vi] = Vx;
      }
  }
}
 
/*主程式*/
int main()
{
  int i, Vi, Vs = 0;					/*Vs為起始頂點，此處是設定為V0 */
  dijkstra(Vs); 						  /*呼叫dijkstra() 函數求取Vs到其它頂點的最短路徑*/
  for (Vi = 0; Vi < V; Vi++){	/*印出Vs到其它頂點的最短路徑*/
    if (Vi == Vs) continue;
    printf("V%d到V%d的最短距離為%d,\t路徑為V%d-->",Vs, Vi, distance[Vi], Vi);
    for (i = previous[Vi]; i != Vs ; i = previous[i])
      printf("V%d-->", i);
    printf("V%d\n", Vs);
  }
 }