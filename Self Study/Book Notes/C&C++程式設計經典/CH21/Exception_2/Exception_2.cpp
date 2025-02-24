#include <cstdlib>
#include <iostream>

using namespace std;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
    try
    {
       int x, y, result ;
       cout << "請輸入被除數 x：" ;
       cin >> x;
       cout << "請輸入  除數 y：" ;
       cin >> y; 
       if (y==0) throw (0) ;  // 若除數y等於0，則丟出整數0 
       //if (y==0) throw ("除數不可為零") ;//若除數y等於0，則丟出字串常值 
       result = x / y;
       cout << "x / y = " << result;
    }
    catch(int ex)                // 若丟出整數型別會執行此區塊 
    {
       cout << "產生例外，除數不可為 " << ex ;
    }
    catch(const char *ex)         // 若丟出字串常值會執行此區塊 
    {
       cout << "產生例外，錯誤訊息為" << ex ;
    }
    cout << endl << endl;
    system("PAUSE");
    return 0;
}
