#include <cstdlib>
#include <iostream>
#include <string>

using namespace std;

int main(int argc, char** argv) {
   	cout << "\t==數字系統格式化輸出==\n";
	cout << "十進制的" << 12345 << "等於  八進制的";
	cout.setf(ios::oct, ios::basefield);	//設定八進制的輸出
	cout << 12345 << "\n";				    //印出30071
	cout.unsetf(ios::basefield);			//取消八進制的輸出
	cout << "十進制的" << 12345 << "等於十六進制的";
	cout.setf(ios::hex, ios::basefield);	//設定十六進制的輸出
	cout << 12345 << "\n";				    //印出3039
	cout.unsetf(ios::basefield);			//取消十六進制的輸出
	cout.setf(ios::showbase);			    //設定輸出完整的數字系統進制
	cout << "十進制的" << 12345 << "等於  八進制的";
	cout.setf(ios::oct, ios::basefield);	//設定八進制的輸出
	cout << 12345 << "\n";				    //印出030071
	cout.unsetf(ios::basefield);			//取消八進制的輸出
	cout << "十進制的" << 12345 << "等於十六進制的";
	cout.setf(ios::hex, ios::basefield);	//設定十六進制的輸出
	cout << 12345 << "\n";				    //印出0x3039
	cout.unsetf(ios::basefield);			//取消十六進制的輸出
	cout.unsetf(ios::showbase);			    //取消輸出完整的數字系統進制

	cout << "\n\t==浮點數格式化輸出==\n";
	cout << 9876.54321 << "\n";			    //印出9876.54
	cout.setf(ios::fixed, ios::floatfield); //設定以浮點數的方式來輸出
	cout << 9876.54321 << "\n";			    //印出9876.543210
	//設定浮點數以科學記號的方式來輸出
	cout.setf(ios::scientific, ios::floatfield);	
	cout << 9876.54321 << "\n";			   //印出9.876543e+003
	cout.unsetf(ios::floatfield);		   //取消以浮點數的方式來輸出
	cout << "\n\t==布林資料格式化輸出==\n";
	bool t=true, f=false;	//宣告布林型別的變數，其中t為true, f為false
	cout << "真是 " << t << "\n";		  //印出 1
	cout << "假是 " << f << "\n";		  //印出 0
	cout.setf(ios::boolalpha);			  //設定以布林值的方式來輸出
	cout << "真是 " << t << "\n";		  //印出true
	cout << "假是 " << f << "\n";		  //印出false
	cout.unsetf(ios::boolalpha);		  //取消以布林值的方式來輸出

	cout << "\n\t==正負數值格式化輸出==\n";
	cout << +9876.54321 << "\n";		  //印出9876.54
	cout << -9876.54321 << "\n";		  //印出-9876.54
	cout.setf(ios::showpos);			  //正整數之前加上「+」，否則加上「-」
	cout << +9876.54321 << "\n";		  //印出+9876.54
	cout << -9876.54321 << "\n";		  //印出-9876.54
	cout.unsetf(ios::showpos);	//取消cout.setf(ios::showpos);的設定

	cout << "\n\t==對齊格式化輸出==\n";
	cout.width(30);					     //設定實際輸出字元為30個
	cout.setf(ios::left, ios::adjustfield);	//設定靠左對齊
	cout << "C&C++程式設計經典";
	cout << "\n";						 //換行
	cout.unsetf(ios::adjustfield);	     //取消靠左對齊
	cout.width(30);						 //設定實際輸出字元為30個
	cout.setf(ios::right, ios::adjustfield);	//設定靠右對齊
	cout << "C&C++程式設計經典\n";
	cout << "\n";						//換行
	cout.unsetf(ios::adjustfield);	    //取消靠右對齊
   	cout << "\n"; 
   	system("PAUSE");
   	return 0;
}

