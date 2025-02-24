 #include <cstdlib>
 #include <iostream>
 #include <string>
 using namespace std;

 class MathA {
 public:
	int GetMax(int a, int b){ 	//ㄢ计ぇ程计
		return  (a>b) ? a:b;
	}
 };

 class MathB:public MathA{		//MathB膥┯MathA
	public:
	int GetAbs(int a){			//琘计荡癸
		return  (a>0) ? a : -(a) ;
	}
 };
 class MathC: public MathB{	//MathC膥┯MathB
 public :
	int GetFactorial(int a){	//―琘计顶糷
		if (a==0){
			return 1;
		}
		else{
			return (a * GetFactorial(a-1));
		}
	}
 };

int main(int argc, char** argv) {
   	MathC objC;
	cout << "100㎝65程计琌" << objC.GetMax (100, 65) << endl;
	cout << "-99荡癸" << objC.GetAbs (-99) << endl;
	cout << "5 ! 顶糷" << objC.GetFactorial (5) << endl;
   	system("PAUSE");
   	return 0;
}
