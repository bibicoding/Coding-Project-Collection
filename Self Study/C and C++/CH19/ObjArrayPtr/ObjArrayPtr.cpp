#include <cstdlib>
#include <iostream>
#include <string>

using namespace std;

//定義Employee員工類別
class Employee{
private :
	string _name;
	int _salary;
	
public :
	//設定員工姓名 
	void setName(string value) {
	    _name = value;
	}
	//取得員工姓名 
	string getName() {
	    return _name;
	}
	//設定員工薪資範圍22000~60000 
	void setSalary(int value){
		if (value < 22000 || value > 60000){
			_salary = 22000;
		}else{
			_salary = value;
		}
	}
	//取得員工薪資 
	int getSalary(){
		return _salary;
	}
	// 印出員工的姓名與薪資 
	void print(){
		cout << getName() << "\t" << getSalary()  << endl;		
	}
};

int main(int argc, char** argv) {
	string name;
    int i, salary;
    
	Employee aryEmployee[5];	//宣告aryEmployee[0]~aryEmployee[4]
	Employee *ptr;				//宣告Employee類別的ptr指標
    ptr = aryEmployee;			//ptr指到陣列元素aryEmployee[0]的位址

	cout << "請輸入 5 位員工的姓名與薪資\n";
	for (i=0; i<5; i++)	{
		cout << "第 " << (i+1) << " 位員工姓名：" ;
		cin >> name;
		ptr->setName(name);     //使用指標設定姓名 
		cout << "第 "  << (i+1) << " 位員工薪資：";
		cin >> salary;
		ptr->setSalary(salary); //使用指標設定薪資 
		ptr++;					//指標往下移，相當於陣列元素跳下一個註標
	}
	cout << "\n印出所有員工的姓名與薪資\n";
	cout << "編號\t姓名\t薪資\n";
	cout << "==================\n";
	ptr = aryEmployee;		//ptr指到陣列元素aryEmployee[0]
	for (i=0; i<5; i++)	{    
	    //印出第i位員工的姓名與薪資
		cout <<" " << (i+1) << "\t";
		ptr->print();
		ptr++;					//指標往下移，相當於陣列元素跳下一個註標
	}
	system("PAUSE");
	return 0;
}
