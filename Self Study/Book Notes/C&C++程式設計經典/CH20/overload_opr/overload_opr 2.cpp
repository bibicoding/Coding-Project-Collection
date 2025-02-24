#include <cstdlib>
#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

class Point{
private:
	int x, y;
public:
	Point();
	Point operator+(Point);		//多載+二元運算子
	Point operator+(int);		//多載+二元運算子
	Point operator++();			//多載+一元運算子(前置運算)
	void getxy();
	void setxy(int, int);
};

Point::Point(){
	x=0;
	y=0;
}

Point Point::operator+(Point obj){
	Point t;		
	t.x=x+obj.x; 
	t.y=y+obj.y;	
	return t;		
}

Point Point::operator+(int n){
	Point t;
	t.x=x+n;
	t.y=y+n;
	return t;
}

Point Point::operator++(){
	x=x+1;
	y=y+1;
	return *this;
}
 
void Point::getxy(){
	cout << "x座標:" << x << "\ty座標:" << y << endl;
 }
 
void Point::setxy(int x1, int y1){
	x=x1;
	y=y1;
}

int main(int argc, char** argv) {
	Point p1, p2, p3;
	p1.setxy (10,20);
	cout << "obj1座標->" ;
	p1.getxy ();
	p2.setxy (15,23);
	cout << "obj2座標->" ;
	p2.getxy ();
	p3.setxy (0,0);
	cout << "obj3座標->" ;
	p3.getxy ();
	cout << endl;
	p3=p1+p2;
	cout << "p1+p2=p3\np3座標->" ;
	p3.getxy ();
	cout << endl;
	p3=p3+6;
	cout << "p3+6\np3座標->" ;
	p3.getxy ();
	cout << endl;
	++p3;
	cout << "++p3\np3座標->" ;
	p3.getxy ();
    system("PAUSE");
    return 0;
}
