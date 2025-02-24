#include <cstdlib>
#include <iostream>
#include <string>

using namespace std;
class Car{
private:
	int _speed ;

public:
	int GetSpeed ();			//宣告GetSpeed()方法
	void SetSpeed(int );		//宣告SetSpeed()方法
	void Accelerate();			//宣告Accelerate()方法
	void Accelerate(int);		//宣告Accelerate(int)方法
	void Accelerate(string) ;	//宣告Accelerate(string)方法
};

int Car::GetSpeed (){			//定義Car類別的GetSpeed()方法
	return _speed;
}

void Car::SetSpeed(int value){	//定義Car類別的SetSpeed()方法
	if (value < 0){
		value = 0;
	}
	if (value > 200){
		value = 200;
	}
	_speed = value;
}

void Car::Accelerate(){				//定義Car類別的Accelerate()方法
	this->_speed++;
}

void Car::Accelerate(int addSpeed){ //定義Car類別的Accelerate(int)方法
	this->_speed += addSpeed;
}

void Car::Accelerate(string S){	    //定義Car類別的Accelerate(string)方法
	if (S == "STOP"){
		this->_speed  = 0;
	}
}

int main(int argc, char** argv) {
    Car Benz;
	Benz.SetSpeed (0);
	cout << "現在速度:" << Benz.GetSpeed() << endl;
	cout << "加速 ...\n";
	Benz.Accelerate();
	cout << "現在速度:" << Benz.GetSpeed() << endl;
	cout << "加速 10 ...\n";
	Benz.Accelerate(10);
	cout << "現在速度:" << Benz.GetSpeed() << endl;
	cout << "停車 ...\n";
	Benz.Accelerate("STOP");
	cout << "現在速度:" << Benz.GetSpeed() << endl;
    system("PAUSE");
    return 0;
}
