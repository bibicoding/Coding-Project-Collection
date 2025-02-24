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

