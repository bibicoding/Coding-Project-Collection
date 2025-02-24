#include <cstdlib>
#include <iostream>
#include <functional>
#include <string>
#include <map>
using namespace std;

//定義Book書籍類別，此類別有Id、Name、Price屬性
//Book類別的建構式可以設定 Id、Name、Price屬性的初值 
class Book{
	public:
	  string Id, Name;
	  int Price;
	  Book(string _id, string _name, int _price ){
	  	Id=_id;
	  	Name=_name;
	  	Price=_price;
	  }
};

int main(int argc, char** argv)
{	
    //使用greater<string>函式物件，故本例鍵值由大到小排序
    typedef map<string, Book, greater<string> >  my_map ;
	my_map container;
	container.insert
	(my_map::value_type("py001", Book("py001","Python基礎必修課", 400)));
	container.insert
	(my_map::value_type("cs001", Book("cs001","Visual C#基礎必修課", 540)));
	container.insert
	(my_map::value_type("cs002", Book("cs002","Visual C#程式設計經典",680)));
	// 將map 容器內所有的鍵與值顯示出來
	// 值為Book類別物件，依序顯示該物件的Name與Price屬性 
	// 印出鍵由大到小排序的結果 
	my_map::iterator ptr;
	cout << "書號\t書名\t\t\t單價\n";
	cout << "=====================================\n";
	for (ptr=container.begin (); ptr!=container.end(); ptr++){
		cout << ptr->first << "\t" << ptr->second.Name << "\t" << ptr->second.Price<< "\n";
	}
	system("PAUSE");
	return 0;
}

