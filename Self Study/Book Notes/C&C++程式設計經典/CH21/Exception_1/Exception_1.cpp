#include <cstdlib>
#include <iostream>

using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
   int x, y, result ;
   cout << "請輸入被除數 x：" ;
   cin >> x;
   cout << "請輸入  除數 y：" ;
   cin >> y; 
   result = x / y;			// 若除數y等於0，則會產生執行時期的例外
   cout << "x / y = " << result << endl;
   system("PAUSE");
   return 0;

}
