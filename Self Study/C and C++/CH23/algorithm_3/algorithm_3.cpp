#include <cstdlib>
#include <iostream>
#include <functional>
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
   cout << "未排序：\n";
   PrintOut(container1);
   cout << "由小到大排序\n";
   //以less<int>整數做遞增排序 
   sort(container1.begin(), container1.end(), less<int>());   
   PrintOut(container1);
   cout << "由大到小排序\n";
   //以greater<int>整數做遞減排序 
   sort(container1.begin(), container1.end(), greater<int>());   
   PrintOut(container1);
   system("PAUSE");
   return 0;
}
