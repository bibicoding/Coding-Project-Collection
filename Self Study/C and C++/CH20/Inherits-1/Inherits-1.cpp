#include <cstdlib>
#include <iostream>
#include <string>
using namespace std;

class Employee{		//定義Employee員工類別
private :
	int _salary;   	//Employee員工類別有_Salary薪水私有成員
public:
	int GetSalary()	{	//取得薪水方法(成員函式)

		return _salary;
	}
	//設定薪水方法(成員函式), 薪水介於20000~40000之間
	void SetSalary(int value) {
		if (value < 20000) 		//薪水最少20000
			_salary = 20000;
		else if (value > 40000)		//薪水最多40000
			_salary = 40000;
		else
			_salary = value;
	}
 };
 //Manager經理類別繼承自Employee員工類別，因為繼承存取權限設為public
 //因此Manager子類別的Bonus和ShowTotal()成員可以由外界直接存取
 class Manager : public Employee { 
 public :
	int Bonus;			//加入Bonus獎金公開成員
	void ShowTotal(){  	//加入顯示實領獎金方法(成員函式)
		cout << "實領薪水：" << ( Bonus + GetSalary()) << endl;
	}
};

int main(int argc, char** argv) {
    Employee tom ;				//建立Employee員工類別的tom物件
	tom.SetSalary (50000);    	//設定薪水
	cout << "tom員工薪水" <<  tom.GetSalary() << endl; 		//顯示薪水
	cout << "================\n\n";
	Manager peter ; 				//建立Manager經理類別peter物件
	peter.SetSalary(50000);   	//設定薪水
	cout << "peter經理薪水 " << peter.GetSalary() << endl;	//顯示薪水
	peter.Bonus = 30000;  		//設定peter的獎金30000
	cout << "peter經理獎金 " << peter.Bonus << endl; 		//顯示獎金
	peter.ShowTotal();      	//顯示peter實領薪水
   system("PAUSE");
   return 0;
}
