#include <cstdlib>
#include <iostream>
using namespace std;

class Stack{	//定義Stack堆疊類別
private:
    //宣告三個指標
    //full表示堆疊頂端, empty表示堆疊底部, ptr表示目前堆疊移到的位置 
    int *full, *empty,  *ptr; 

public:
    Stack(int n){	//建構式
        ptr = new int[n];	//動態配置堆疊的數量 
        full = ptr + n ;  	//設定full堆疊頂端 
        empty = ptr;      	//設定empty堆疊底部 
    }
    void Push(int n){	//將資料放入堆疊的Push()方法 
        if (ptr==full){   	//判斷堆疊是否已滿 
            cout << "    堆疊滿了";
            return;               
        }
        *ptr = n ;       	//將整數存入目前指標指向堆疊的位置 
        cout << "    放入" << *ptr << "到堆疊內";
        ptr++;          	 	//堆疊指標位置往上移 
    }
    void Pop(){	//將堆疊的資料彈出的Pop()方法 
        if (ptr==empty){  	//判斷堆疊是否已空 
            cout << "    堆疊空了";
            return;                          
        }
        ptr--;          		//堆疊指標位置往下移
        cout << "    由堆疊取出資料：" <<  *ptr;         
    }
    void PrintStack(){//印出堆疊的所有資料的PrintStack()方法
    	if (ptr==empty){ 	//判斷堆疊是否已空
            cout << "    堆疊內沒有資料";
            return;                
        }
        cout << "    印出堆疊內容：";
        int *lptr;
        lptr = ptr;
        do{     	//由目前堆疊位置開始印資料一直印到堆疊底部 
            if (lptr!=empty){
                lptr--;
                cout << *lptr << " ";
            }
            else{
                break;
            }
        }while(1);
        cout << endl;
    }
};

int main(int argc, char** argv) {
   cout << "請輸入堆疊可存放的數量：";
   int num ;
   cin >> num;
   Stack s(num) ;     //建立Stack堆疊物件s，s物件可存放num個整數資料 
   int sel, input;
   do{
        cout << "\n\n=== 堆疊 (Stack) 操作選單 ===\n";
        cout << "    1. 放入資料 (Push) \n";
        cout << "    2. 取出資料 (Pop) \n";
        cout << "    3. 顯示堆疊資料 \n";
        cout << "    4. 結束 \n";
        cout << "============================= \n";
        cout << "    請選擇 [1 - 4]：";
        cin >> sel ;         
        if (sel == 1){
            cout << "    請輸入要放入堆疊的資料：";
            cin >> input ;
            s.Push(input);    	//將input輸入的資料放入堆疊中 
        }
        else if (sel == 2){
            s.Pop();          	//由堆疊內彈出資料 
        }
        else if (sel == 3){
            s.PrintStack();   	//印出堆疊內所有的資料 
         }
         else if (sel == 4){
            cout << "    離開系統 \n";
            break;
         }
         else{
            cout << "    === 請輸入 1-4 !! \n";
         }
   } while (1);
   system("PAUSE");
   return 0;
}
