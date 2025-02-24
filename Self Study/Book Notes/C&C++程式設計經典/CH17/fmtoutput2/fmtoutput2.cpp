#include <cstdlib>
#include <iostream>
#include <string>

using namespace std;

int main(int argc, char** argv) {
    cout.width(35);							//設定要輸出35個字元
	cout << "C&C++ 程式設計經典";	
	cout << "\n\n";

	cout.width(35);							//設定要輸出35個字元
	cout.fill('*');							//設定填滿字元為 '*'
	cout << "Viusal C# 2019 程式設計經典";
	cout << "\n\n";

	cout.width(35);							//設定要輸出35個字元
	cout.setf(ios::left, ios::adjustfield);	//靠左對齊
	cout << "Viusal Basic 2019 程式設計經典";
	cout << "\n\n";
	cout.unsetf(ios::adjustfield);			//取消靠左對齊

	cout.precision(5);							//設定有效位數5位
	cout << 98.7654321 << "\n\n";			//印出 98.765

	cout.setf(ios::fixed, ios::floatfield);	//設定浮點數的輸出格式
	cout << 98.7654321 << "\n\n";			//印出98.76543
	cout.unsetf(ios::floatfield);			//取消浮點數的輸出格式
    cout << "\n";
    system("PAUSE");
    return 0;
}

