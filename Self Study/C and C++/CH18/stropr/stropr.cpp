#include <cstdlib>
#include <iostream>
#include <iomanip>
#include <string>
//#include <cstring>

using namespace std;

int main(int argc, char** argv) {
	string id, pwd;
	cout << "請輸入帳號：";
	cin >> id;
	cout << "請輸入密碼：";
	cin >> pwd;
	cout << endl;
	if(id=="gotop" && pwd=="168"){
		cout << "帳號：" + id + ", 密碼：" + pwd + " 正確, 歡迎光臨" ;
	}
	else{
		cout << "帳號：" + id + ", 密碼：" + pwd + " 錯誤, 請離開系統" ;
	}
	cout << endl;
	system("PAUSE");
	return 0;
}
