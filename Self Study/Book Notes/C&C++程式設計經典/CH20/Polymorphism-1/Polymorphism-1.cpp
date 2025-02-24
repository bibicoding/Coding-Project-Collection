 #include <cstdlib>
 #include <iostream>
 #include <string>
 using namespace std;

 class Employee{			//定義Employee員工類別
 protected:
	//_salary宣告為保護層級,此欄位可以在子類別中使用
	int _salary;
 public:
	int GetSalary(){  
		return _salary;
	}
	void SetSalary(int value){		//設定薪水介於20000~40000
		if ((value >= 20000) && (value <= 40000)){
			_salary = value;
		}
		else{
			_salary = 20000;
		}
	}
 };

 class Manager:public Employee{ //定義Manager經理類別繼承自Employee員工類別
 public:
	int Bonus;
	int GetSalary (){
		return _salary;				//使用父類別的m_salary
	}
	void SetSalary(int value){		//設定薪水介於30000~60000
		if ((value >= 30000) && (value <= 60000)){
			_salary = value;
		}
		else{
			_salary = 30000;
		}
	}
	void ShowTotal(){
		cout << "實領薪水：" << ( Bonus + GetSalary()) << endl;
	}
 };

int main(int argc, char** argv) {
  	Manager peter;
	peter.SetSalary(70000);
	cout << "peter經理薪水" << peter.GetSalary() << endl;
	peter.Bonus = 30000;
	cout << "peter經理獎金" << peter.Bonus << endl;
	peter.ShowTotal();
   	system("PAUSE");
   	return 0;

}
