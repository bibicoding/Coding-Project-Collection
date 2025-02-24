#include <cstdlib>
#include <iostream>
#include <iomanip>
#include <string>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

using namespace std;
template<class T>
T abs1(T);			// 宣告abs1的樣版函式，並宣告T為型別代名


int main(int argc, char** argv) {
   int i;
   double d;
   cout << "  請輸入一個整數 i：" ;
   cin >> i;
   cout << "請輸入一個浮點數 d：";
   cin >> d;
   cout << "i 的絕對值：" << abs1(i)<< endl;
   cout << "d 的絕對值：" << abs1(d) << endl;
   system("PAUSE");
   return 0;
}

//定義abs1樣版函式的主體，傳入及傳回的資料型別為代名T
template<class T>
T abs1(T a)	
{
   if(a<0)
   {
      a=-(a);
   }
   return a;
}
