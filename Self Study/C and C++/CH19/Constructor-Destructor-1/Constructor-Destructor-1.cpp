#include <cstdlib>
#include <iostream>

using namespace std;

class Car{
private:
	int _speed ;

public:
	// 物件的建構式 #1       
	Car()  {
		_speed = 0;
		cout << "初始化後速度 = " <<  _speed << endl;
	}
	// 物件的建構式 #2  
	Car(int vSpeed)  {
		_speed = vSpeed;
		cout << "初始化後速度 = " <<  _speed << endl;
	}
	// 物件的解構式
	~Car()  {
		cout << "車子物件消滅了 ..." << "\n\n";
	}
};

void DoSomething()
{
	cout << "進入程序，並宣告 BMW 物件 ...\n";
	Car BMW(10) ;	// 執行第16~19行含有初值的建構式 
	cout << "BMW 物件宣告完成，準備離開方法 ...\n";
 } // BMW物件是此函式的區域變數，離開此函式時BMW物件會被消滅，此時執行21~23行

int main(int argc, char** argv) {
 	DoSomething();
	cout << "宣告 Benz 物件 ..\n";
	Car Benz ;
	cout << "Benz 物件宣告完成 ..\n";
    system("PAUSE");
    return 0;
}
