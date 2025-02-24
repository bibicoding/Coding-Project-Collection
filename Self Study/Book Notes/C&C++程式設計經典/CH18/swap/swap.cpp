#include <cstdlib>
#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

void swapbyref(int &, int &);
void swapbyadd(int *, int *);

int main(int argc, char** argv) {
	cout << " ==ㄏノ把σ㊣秈︽ㄢ计ユ传==" << endl;
	int x, y;
	cout << " 叫块俱计 x " ;
	cin >> x;
	cout << " 叫块俱计 y " ;
	cin >> y;
	cout << " x=" << x << ", y=" << y  
	 << ", x=" << &x << ", y=" << &y << endl;
	swapbyref(x, y);
	cout << " ㄢ计ユ传ЧΘ, 挡狦" << endl;
	cout << " x=" << x << ", y=" << y  
	 << ", x=" << &x << ", y=" << &y << endl;
	
	cout << endl << endl;
	
	cout << " ==ㄏノ肚㊣秈︽ㄢ计ユ传==" << endl;
	int k, z;
	cout << " 叫块俱计 k " ;
	cin >> k;
	cout << " 叫块俱计 z " ;
	cin >> z;
	cout << " k=" << k << ", z=" << z  
	 << ", k=" << &k << ", z=" << &z << endl;
	swapbyadd(&k, &z);
	cout << " ㄢ计ユ传ЧΘ, 挡狦" << endl;
	cout << " k=" << k << ", z=" << z  
	 << ", k=" << &k << ", z=" << &z << endl;
	system("PAUSE");
	return 0;
}

void swapbyref(int &a, int &b){
	int t;
	cout << " a=" << a << ", b=" << b  
	 << ", a=" << &a << ", b=" << &b 
	 << ", 秈swapbyref()ㄧΑ秈︽ㄢ计ユ传" << endl;
	t=a;
	a=b;
	b=t;
	cout << " a=" << a << ", b=" << b  
	 << ", a=" << &a << ", b=" << &b 
	 << ", 瞒秨swapbyref()ㄧΑЧΘㄢ计ユ传" << endl;
}

void swapbyadd(int *a, int *b){
	int t;
	cout << " 秈swapbyadd()ㄧΑ秈︽ㄢ计ユ传" << endl;
	cout << " a=" << a << ", b=" << b  
	 << " *a=" << *a << ", *b=" << *b  
	 << ", a=" << &a << ", b=" << &b << endl ;	 
	t=*a;
	*a=*b;
	*b=t;
	cout << " 瞒秨swapbyadd()ㄧΑЧΘㄢ计ユ传" << endl;
	cout << " a=" << a << ", b=" << b  
	 << " *a=" << *a << ", *b=" << *b  
	 << ", a=" << &a << ", b=" << &b  << endl;
}
