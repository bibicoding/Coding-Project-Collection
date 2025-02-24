#include <cstdlib>
#include <iostream>

using namespace std;
class Car
{
private:
	int _speed ;

public:
	int GetSpeed(){ 				//GetSpeed()方法用來取得速度屬性值
		return _speed;
	}
	void SetSpeed(int value){	//SetSpeed()方法用來設定速度屬性值，範圍0~200
		if (value < 0){
			value = 0;
		}
		if (value > 200) {
			value = 200;
		}
		_speed = value;
	}
	void Accelerate(){			//Accelerate()方法用來設定目前速度屬性值加1
		_speed ++;				// 速度 + 1
		if (_speed > 200) {	// 檢查速度不可超過 200
			_speed = 200;	
		}
	}
 };

int main(int argc, char** argv) {
    Car Benz ;				//宣告Car類別的Benz物件
	Benz.SetSpeed(199);		
	cout << "現在速度:" <<  Benz.GetSpeed() << endl;
	cout << "加速 ...\n";
	Benz.Accelerate();
	cout << "現在速度:" <<  Benz.GetSpeed() << endl;
	cout << "加速 ...\n";
	Benz.Accelerate();
	cout << "現在速度:" <<  Benz.GetSpeed() << endl;
    system("PAUSE");
    return 0;
}
