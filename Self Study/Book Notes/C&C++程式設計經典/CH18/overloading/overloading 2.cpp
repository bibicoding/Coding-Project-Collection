#include <cstdlib>
#include <iostream>
#include <iomanip>
#include <string>
#include <math.h>
using namespace std;

double area(int, int);
double area(int, int, int);

int main(int argc, char** argv) {
	int x=9, y=15, z=14;
	cout<<"三角形底為："<<x<<"、高為："<<y<<"，面積為："<<area(x,y)<<"\n\n";
	cout<<"三角形三邊長為："<<x<<"、"<<y<<"、"<<z<<"，面積為："<<area(x,y,z)<<"\n\n";	
	system("PAUSE");
	return 0;
}

double area(int d, int h){
	return (double)d * (double)h /2;
}

double area(int a, int b, int c){
	double s = (double)(a+b+c)/2;
	return sqrt(s*(s-a)*(s-b)*(s-c));
}

