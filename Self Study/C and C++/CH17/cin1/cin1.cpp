#include <cstdlib>
#include <iostream>
#include <string>
using namespace std;

int main(int argc, char** argv) {
    char miname[30];			// 宣告miname字元陣列(字串)
	int price;					// 宣告price整數變數
	double discount;			// 宣告discount浮點變數
	cout << "請輸入樂器名稱：";
	cin >> miname;				// 將鍵盤輸入的資料指定給miname
	cout << "請輸入單價：";
	cin >> price;				// 將鍵盤輸入的資料指定給price
	cout << "請輸入折扣：";
	cin >> discount;			// 將鍵盤輸入的資料指定給discount
	cout << "\n===印出資料如下===\n";
	cout << miname	<< "是一支好樂器~\n";
	cout << " 單價："<< price	<< "\n";
	cout << " 折扣："<< discount << "\n";
	cout << " 總價："<< price * discount << "\n";
   	system("PAUSE");
	return 0;
}
