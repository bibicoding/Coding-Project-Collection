#include <cstdlib>
#include <iostream>
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
    typedef map<string, Book, less<string> >  my_map ;
    // map 容器 的鍵對應的值為Book類別物件 
	my_map container;
	container.insert
	(my_map::value_type("py001", Book("py001","Python基礎必修課", 400)));
	container.insert
	(my_map::value_type("cs001", Book("cs001","Visual C#基礎必修課", 540)));
	container.insert
	(my_map::value_type("cs002", Book("cs002","Visual C#程式設計經典",680)));
	// 將map 容器內所有的鍵與值顯示出來
	// 值為Book類別物件，依序顯示該物件的Name與Price屬性 
	my_map::iterator ptr;
	cout << "書號\t書名\t\t\t單價\n";
	cout << "=====================================\n";
	for (ptr=container.begin (); ptr!=container.end(); ptr++){
		cout << ptr->first << "\t" << ptr->second.Name << "\t" << ptr->second.Price<< "\n";
	}
	cout << "\n";
	// 將查詢的書號指定給bkid字串 
	string bkid;
	cout << "請輸入欲查詢的書號：" ; 
	cin >> bkid;
	
	//使用map容器的find()方法依鍵進行查詢 
	ptr = container.find(bkid);
	if(ptr==container.end()){
		cout << "查無書號 " << bkid << " 的書籍資料" << endl; 
	}else{
		cout << "書號：" << ptr->second.Id << endl;
		cout << "書名：" << ptr->second.Name << endl;
		cout << "單價：" << ptr->second.Price << endl;
	}
	cout << endl;	
	system("PAUSE");
    return 0;
}

