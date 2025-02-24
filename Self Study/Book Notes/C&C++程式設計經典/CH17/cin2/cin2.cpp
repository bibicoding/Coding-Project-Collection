#include <cstdlib>
#include <iostream>
#include <string>

using namespace std;

int main(int argc, char** argv) {
   	char miname[50];
	int price;
	double discount;
	cout << "請輸入樂器名稱：";
	gets(miname);  
	cout << "請輸入單價：";
	cin >> price;
	cout << "請輸入折扣：";
	cin >> discount;
	cout << "\n===印出資料如下===\n";
	cout << miname	<< "是一支好樂器~\n";
	cout << " 單價："<< price	<< "\n";
	cout << " 折扣："<< discount << "\n";
	cout << " 總價："<< price * discount << "\n";
   	system("PAUSE");
  	return 0;
}

