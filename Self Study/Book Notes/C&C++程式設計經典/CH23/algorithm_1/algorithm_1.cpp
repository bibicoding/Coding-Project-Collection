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
   vector<int> container1(10);
   //將container1[0]~container1[9]指定為1  
   fill(container1.begin(), container1.end(), 1);
   PrintOut(container1);
    
   int ary[]={2,2,2,2,2};
   //將container2[0]~container2[4]指定為2  
   vector<int> container2(ary, ary+5);
   //將container2[0]~container2[4]拷貝到container1[3]~container1[7] 
   copy(container2.begin(), container2.end(), container1.begin()+3);
   PrintOut(container1);
   
   vector<int>::iterator ptr;
   //將container1容器內含1的元素移除 
   ptr = remove(container1.begin(), container1.end(), 1);
   container1.erase(ptr, container1.end());
   PrintOut(container1);
   //將container1[0]~container1[1]元素資料由原本的2改成3  
   replace(container1.begin(), container1.begin()+2, 2, 3);
   PrintOut(container1);
  
   system("PAUSE");
   return 0;
}
