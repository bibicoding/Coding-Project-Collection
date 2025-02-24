/********************************
  檔名:template.cpp
  功能:函式樣板化   - 泛型
 ********************************/

#include <iostream>
#include <stdlib.h>

using namespace std;

class CMyclass
{
   public:
   template <class N> N max(N a,N b)  // N為保留的資料型態
   {      if(a>=b)   return a;   else  return b;    }

};


int main(void)
{
  double a1=0.7,b1=9.3,c1;
  int a2=25,b2=56,c2;

  CMyclass obj1;

  c1 = obj1.max(a1,b1);   //呼叫時指定正確的資料型態
  c2 = obj1.max(a2,b2);   //呼叫時指定正確的資料型態


  cout << c1<< endl; 
  cout << c2<< endl;   

  system("pause");
  return 0;
}
