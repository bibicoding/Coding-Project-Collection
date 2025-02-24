#include <cstdlib>
#include <iostream>
#include <string>
using namespace std;

class Employee{
protected:
	//_salary宣告為Protected保護層級,此成員可以在子類別中使用
	int _salary;
public:
	int GetSalary(){
		return _salary;
	}
	void SetSalary(int value){
		if ((value >= 20000) & (value <= 40000)){
			_salary = value;
		}
		else{
			_salary = 20000;
		}
	}
	void ShowTotal(){	//ShowTotal方法允許被覆寫
		cout << "底薪：" <<  GetSalary() << endl;
	}
};

class Manager : public Employee{
public:
	int Bonus;
	int GetSalary(){
		return _salary; //使用父類別的m_salary
	}
	void SetSalary(int value){
		if ((value >= 30000) && (value <= 60000)){
			_salary = value;
		}
		else{
			_salary = 30000;
		}
	}
	void ShowTotal(){				//覆寫Employee的ShowTotal方法
		Employee::ShowTotal();	//呼叫父類別Employee的ShowTotal方法
        cout << "薪水+獎金共：" << (Bonus + GetSalary()) << endl;
	}
};

int main(int argc, char** argv) {
	Employee tom;
	tom.SetSalary( 40000);
	cout << "tom員工薪水" <<  tom.GetSalary() << endl;
	tom.ShowTotal();
	cout << "===================\n\n";
	Manager peter;
	peter.SetSalary(70000);
	cout << "peter經理薪水" << peter.GetSalary() << endl;
	peter.Bonus = 30000;
	cout << "peter經理獎金" << peter.Bonus << endl;
	peter.ShowTotal();
    system("PAUSE");
	return 0;
}
