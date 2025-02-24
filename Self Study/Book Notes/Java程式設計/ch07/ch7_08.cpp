/*   檔名:ch7_08.cpp   功能:傳參考呼叫   */

#include <iostream>
#include <stdlib.h>
using namespace std;

class CVector2                      //二維向量類別
{
  public: int x,y;               //二維向量的兩項元素資料
  public: void set(int m,int n)  //用於設定二維向量的兩項元素資料
  {          
        x = m;
        y = n;      
  }
};

class CMyClass
{
    public: void swap(CVector2 &a,CVector2 &b)  //互換函式,傳參考呼叫
    {
        CVector2 temp;
        temp = a;
        a = b;
        b = temp;
    }
};

int main(char args[])
{
   CVector2 i;
   i.set(20,40);
   CVector2 j;
   j.set(15,45);
   cout << "-----原始------" << endl;      //列印
   cout << "Vector i=(" << i.x << "," << i.y << ")" << endl;
   cout << "Vector j=(" << j.x << "," << j.y << ")" << endl;
   CMyClass X;
   X.swap(i,j);   //互換i,j
   cout << "-----swap後-------" << endl;   //列印
   cout << "Vector i=(" << i.x << "," << i.y << ")" << endl;
   cout << "Vector j=(" << j.x << "," << j.y << ")" << endl;
   //system("pause");
   return 0;
}


