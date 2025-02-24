#include <cstdlib>
#include <iostream>
#include <string>

using namespace std;

class Car{
private:
	int _speed ;

public:
	int GetSpeed ()	{
		return _speed;
	}
	void SetSpeed(int value){
		if (value < 0){
			value = 0;
		}
		if (value > 200){
			value = 200;
		}
		_speed = value;
	}
	void Accelerate(){
		this->_speed++;
	}
	void Accelerate(int addSpeed){
		this->_speed += addSpeed;
	}
	void Accelerate(string S) {
		if (S == "STOP") {
			this->_speed  = 0;
		}
	}
 };

int main(int argc, char** argv) {
    Car Benz;			//宣告Car類別的Benz物件
	Car *ptr;			//宣告Car類別的ptr指標，此時ptr可指向Car類別物件
	ptr = &Benz;		//ptr指向Benz物件
	ptr->SetSpeed (0);	//因為ptr是指標，所以可以使用「->」來存取成員函式
	cout << "現在速度:" << ptr->GetSpeed() << endl;
	cout << "加速 ...\n";
	ptr->Accelerate();
	cout << "現在速度:" << ptr->GetSpeed() << endl;
	cout << "加速 10 ...\n";
	ptr->Accelerate(10);
	cout << "現在速度:" << ptr->GetSpeed() << endl;
	cout << "停車 ...\n";
	ptr->Accelerate("STOP");
	cout << "現在速度:" << ptr->GetSpeed() << endl;
	system("PAUSE");
	return 0;
}
