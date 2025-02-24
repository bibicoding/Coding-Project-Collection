#include <cstdlib>
#include <iostream>
#include <string>

using namespace std;

int main(int argc, char** argv) {
    char apname[]="C&C++主題遊樂園";
	int price=850;
	int number=30;
	double discount=0.8;
	cout << apname << "是一個好玩的地方~\n\n";		//輸出apname字串
	cout << " 全票票價："<< price << "\n\n";		//輸出price整數
	cout << " 學生折扣："<< discount << "\n\n";		//輸出discout浮點數
	cout << " 學生人數："<< number << "\n\n";		//輸出number整數
	cout << " 總價："<< price * discount * number << "\n\n";	//輸出運算結果
	
   	system("PAUSE");
	return 0;
}
