#include <cstdlib>
#include <iostream>
#include <iomanip>
#include <string>

using namespace std;

int main(int argc, char** argv) {    
    cout << "\t==數字系統格式化輸出==\n";
	cout << "十進制的" << 12345 << "等於  八進制的";
	cout << oct << 12345 << endl;		//以八進制輸出，印出30071
	cout.unsetf(ios::basefield);		//取消八進制輸出
	cout << "十進制的" << 12345 << "等於十六進制的";
	cout << hex << 12345 << endl;		//以十六進制輸出，印出3039
	cout.unsetf(ios::basefield);		//取消十六進制輸出
	cout << showbase;					//設定輸出完整的數字系統進制
	cout << "十進制的" << 12345 << "等於  八進制的";
	cout << oct << 12345 << endl;		//以八進制輸出，印出030071
	cout.unsetf(ios::basefield);		//取消八進制輸出
	cout << "十進制的" << 12345 << "等於十六進制的";
	cout << hex << 12345 << endl;		//以十六進制輸出，印出0x3039
	cout << noshowbase ;			    //取消輸出完整的數字系統進制
	cout.unsetf(ios::basefield);		//取消十六進制的輸出

	cout << "\n\t==浮點數格式化輸出==\n";
	cout << 9876.54321 << endl;			//印出9876.54
	cout << fixed << 9876.54321 << endl;	//以浮點數輸出，印出9876.543210
    //設定浮點數以科學記號方式輸出，印出9.876543e+003
	cout << scientific << 9876.54321 << endl;
	cout.unsetf(ios::floatfield);		//取消以浮點數的方式來輸出

	cout << "\n\t==布林資料格式化輸出==\n";
	bool t=true, f=false;	//宣告布林型別變數, 其中t為true, f為false
	cout << "真是 " << t << endl;		//印出 1
	cout << "假是 " << f << endl;		//印出 0
	cout << boolalpha ;					//設定以布林值的方式來輸出
	cout << "真是 " << t << endl;		//印出 true
	cout << "假是 " << f << endl;		//印出 false
	cout << noboolalpha;				//取消以布林值的方式來輸出

	cout << "\n\t==正負數值格式化輸出==\n";
	cout << +9876.54321 << endl;		//印出9876.54
	cout << -9876.54321 << endl;		//印出-9876.54
	cout << showpos;					//正整數之前加上「+」，否則加上「-」
	cout << +9876.54321 << endl;		//印出+9876.54
	cout << -9876.54321 << endl;		//印出-9876.54
	cout << noshowpos;					//取消showpos的設定

	cout << "\n\t==對齊格式化輸出==\n";
	//輸出30個字元，並設定靠左對齊
	cout << setw(30) << left << "C&C++程式設計經典";
	cout << endl;						//換行
	cout.unsetf(ios::adjustfield);		//取消靠左對齊
	//輸出30個字元，並設定靠右對齊
	cout << setw(30) << right << "C&C++程式設計經典";
	cout << endl;						//換行
	cout.unsetf(ios::adjustfield);		//取消靠右對齊
	cout << endl;						//換行
    	
	system("PAUSE");
    return 0;
}

