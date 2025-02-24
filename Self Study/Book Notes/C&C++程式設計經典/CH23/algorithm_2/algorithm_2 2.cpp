#include <cstdlib>
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
//PrintOut用來印出容器內的元素 
void PrintOut(vector<int>& container)
{
    if(container.empty())
    {
        cout << "容器為空";
    }
    else
    {
        vector<int>::iterator ptr;
		 cout << "容器內的資料為：";
        for(ptr=container.begin();ptr!=container.end();ptr++)
        {
            cout << *ptr << "  ";
        }
        cout << "\n\n";
    }
}


/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
   int ary1[]={1,5,6,7,4,10,9};       
   //將ary1陣列放入container1容器               
   vector<int> container1(ary1, ary1+7);
   PrintOut(container1);        	//印出container1容器 
   
   vector<int>::iterator ptr;   	//宣告指位器
   //判斷container1容器內是否有 6 
   ptr = find(container1.begin(), container1.end(), 6);
   if(ptr==container1.end()){
      cout << "容器內沒有 6\n" ;                          
   }else{
      cout << "容器內有 6\n"   ;
   }
   
   int ary2[]={7,4};
   //將ary2陣列放入container2容器 
   vector<int> container2(ary2, ary2+2);
   //判斷container1容器內是否存在與container2容器相同的片段 
   ptr=search(container1.begin(), container1.end(), 
      container2.begin(), container2.end());

   if(ptr==container1.end()){
      cout << "容器內沒有 7,4\n";                       
   }else{
      cout << "容器內有 7,4\n";
   }
   cout << "\n";
   system("PAUSE");
   return 0;
}
