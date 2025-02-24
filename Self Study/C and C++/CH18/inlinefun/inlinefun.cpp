#include <cstdlib>
#include <iomanip>
#include <iostream>
#include <string>

using namespace std;
inline int getmin(int, int);
inline double getmin(double, double);
inline char getmin(char, char);

int main(int argc, char** argv) {
	int n1, n2;
	cout << "叫块ㄢ俱计" ;
	cin >> n1 >> n2;
	cout << n1 << " 籔 " << n2 << " ぇい程计 " << getmin(n1, n2) << "\n\n";
	
	double d1, d2;
	cout << "叫块ㄢ疊翴计" ;
	cin >> d1 >> d2;
	cout << d1 << " 籔 " << d2 << " ぇい程计 " << getmin(d1, d2) << "\n\n";

	char c1, c2;
	cout << "叫块ㄢじ" ;
	cin >> c1 >> c2;
	cout << c1 << " 籔 " << c2 << " ぇい程じ " << getmin(c1, c2) << "\n\n";

	system("PAUSE");
	return 0;
}

inline int getmin(int a, int b){
	return a<b ? a : b;
}

inline double getmin(double a, double b){
	return a<b ? a : b;
}

inline char getmin(char a, char b){
	return a<b ? a : b;
}
