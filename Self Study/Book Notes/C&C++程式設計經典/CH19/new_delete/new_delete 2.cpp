#include <cstdlib>
#include <iostream>
#include <string>
using namespace std;

class Student{
private :
	string _name;
	int _score;
	
public :
	void setName(string value) {
	    _name = value;
	}
	string getName() {
	    return _name;
	}
	void setScore(int value){
		if (value < 0 ){
			_score=0;
		}
		else if(value > 100) {
			_score = 100;
		}else{
			_score = value;
		}
	}
	int getScore(){
		return _score;
	}
	void print(){
		cout << getName() << "\t" << getScore()  << endl;		
	}
	Student()	//預設建構式，沒有引數的建構式			
	{
	}		
	Student(string name, int score)		//此建構式必須傳入姓名和薪資
	{
		this->setName(name);
		this->setScore(score); 
	}
	~Student(){		//解構式, 執行delete時會執行解構式
		cout << "學生->" << this->getName() << "被刪除了" << endl;
	}
	void ShowStudent(){
		cout << "姓名：" << this->getName() << "   成績：" << this->getScore() << endl; 
	}
};

int main(int argc, char** argv) {
 	Student *ptr1, *ptr2;		//宣告屬於Student類別的ptr1及ptr2指標
	ptr1 = new Student;			//使用new動態記置憶體,此時執行預設建構式
	ptr1->setName("張無忌");	//指定姓名
	ptr1->setScore(120);		//指定成績
	ptr1->ShowStudent ();		//執行Student類別的ShowStudent()方法
	//使用new動態配置記憶體，並傳入姓名及成績
	ptr2 = new Student("小龍女", 80);
	ptr2->ShowStudent ();		//執行Student類別的ShowStudent()方法
	cout << "delete ptr1  " ;
	delete ptr1;				//使用delete運算子釋放記憶體，並執行解構式
	cout << "delete ptr2  ";
	delete ptr2;				//使用delete運算子釋放記憶體，並執行解構式
  	system("PAUSE");
  	return 0;
}
