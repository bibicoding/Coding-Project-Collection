#include <cstdlib>
#include <iostream>
#include <string>
using namespace std;

class Traffic{        
protected:
	static int _miles; 			//_miles用來記錄前進的公里數
public:	 
	virtual void SpeedUp()=0;	//SpeedUp為純虛擬函式，表示Traffic為抽象類別
};

int Traffic::_miles = 0;		//_miles靜態成員初始化為0

class Car : public Traffic{
public:
	void SpeedUp(){  			//Car子類別必須覆寫SpeedUp()方法
		_miles += 2;
		cout << "駕駛車子, 加速中, 前進" << _miles <<"公里" << endl;
	}
};

class Plane : public Traffic{
public:
	void SpeedUp(){				//Plane子類別必須覆寫SpeedUp()方法
		_miles += 15;
		cout << "駕駛飛機, 加速中, 前進" << _miles << "公里" << endl;
	}
};

int main(int argc, char** argv) {
   	Traffic *t;			//t是Taffic類別的物件指標
	Car myCar ;			//myCar是Car的物件實體，繼承Taffic
	Plane myPlane ;		//myPlane是Plane的物件實體，繼承Taffic
	int input;
	while (true){
		cout <<"請問要駕駛->1.車子  2.飛機  其他.離開：";
		cin >> input ;
		if (input == 1)	{
			t = &myCar;       	//開車子, t指標指向myCar物件實體的位址
		}
		else if (input == 2){
			t = &myPlane;  		//開飛機, t指標指向myPlane物件實體的位址
		}
		else{
			break;
		}
		t->SpeedUp();			//呼叫t指標指向物件實體的SpeedUp()方法
		cout << endl;
	}
    system("PAUSE");
    return 0;
}
