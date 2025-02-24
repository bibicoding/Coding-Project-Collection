 #include <cstdlib>
 #include <iostream>
 #include <string>
 using namespace std;

 class MathA {
 public:
	int GetMax(int a, int b){	//取兩數之最大數
		return  (a>b) ? a:b;
	}
 };

 class MathB {
 public:
	int GetAbs(int a){			//取某數絕對值
		return  (a>0) ? a : -(a) ;
	}
};
//MathC繼承自MathA和MathB類別
//因此MathC類別有GetMax, GetAbs, GetFactorial方法
class MathC: public MathA, public MathB{
public :
	int GetFactorial(int a){		//求某數階層
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
	cout << "100和65最大數是：" << objC.GetMax (100, 65) << endl;
	cout << "-99的絕對值：" << objC.GetAbs (-99) << endl;
	cout << "5 ! 階層：" << objC.GetFactorial (5) << endl;
   	system("PAUSE");
   	return 0;
}
