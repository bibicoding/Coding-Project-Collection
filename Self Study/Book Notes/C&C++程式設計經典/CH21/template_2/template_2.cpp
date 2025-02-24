#include <cstdlib>
#include <iostream>
#include <iomanip>
#include <string>

using namespace std;
//印出陣列資料 
template<class T1, class T2>        
void printAry(T1 *ary, T2 ary_size)
{
    T2 i;
    for(i=0;i<ary_size; i++)
    {
        cout << ary[i] << "  ";
    }
}

//氣泡排序法 
template<class T1, class T2>
void sortAry(T1 *ary, T2 ary_size)
{
 	T2 i, j;
	T1 t;
  for(i=ary_size-2;i>=0;i--)
	{
		for(j=0;j<=i;j++)
		{
			if(ary[j]>ary[j+1])
			{
				t=ary[j];
				ary[j]=ary[j+1];
				ary[j+1]=t;
			}
		}
	}
}

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
   cout << "-氣泡排氣法(由小到大排序)-\n";
	// 宣告idata整數陣列並存放5個初值
	int idata[]={51, 32, 6, 4, 99};	 
	// 印出整數陣列排序前及排序後 
	cout << "  整數排序前：";
	printAry(idata, 5);
	cout << endl;
	sortAry(idata, 5);
	cout << "  整數排序後："; 
	printAry(idata, 5);
	cout << "\n\n" ;

	// 宣告fdata浮點數陣列並存放5個初值              
	double fdata[]={3.2, 7.3, 11.32, 0.55, 98.3, 1.99};   
	// 印出浮點數陣列排序前及排序後 
	cout << "浮點數排序前：";
	printAry(fdata, 6);
	cout << endl;
	sortAry(fdata, 6);
	cout << "浮點數排序後："; 
	printAry(fdata, 6);	
	cout << "\n\n" ;

	string sdata[]={"peter", "tom", "david", "mary"};
	// 顯示字串陣列排序前及排序後 
	cout << "  字串排序前：";
	printAry(sdata, 4);
	cout << endl;
	sortAry(sdata, 4);
	cout << "  字串排序後："; 
	printAry(sdata, 4);	
   printf("\n\n");
   system("PAUSE");
   return 0;
} 
