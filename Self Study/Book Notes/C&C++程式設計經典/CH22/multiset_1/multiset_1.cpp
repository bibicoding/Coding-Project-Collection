#include <cstdlib>
#include <iostream>
#include <string>
#include <set>

using namespace std;
template <class T>
void PrintOut(T& container);


/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
    string name[]={"Peter", "John", "Tom", "Mary"};
	multiset<string, less<string> > container(name, name+4);
	PrintOut(container);

	string input_name;
	cout << "由multiset容器內插入資料：";
	cin >> input_name;
	container.insert(input_name);
	PrintOut(container);

	string s_name;
	cout << "請輸入要尋找的姓名：";
	cin >> s_name;
    multiset<string>::iterator ptr;
	ptr = container.find (s_name);
	if (ptr==container.end()){
		cout << "multiset容器內沒有" << s_name << "\n";
	}else{
		cout << "multiset容器內有" << s_name << "\n";
	}
     cout << "\n";
	cout << "multiset容器內有 " << container.size () << " 個元素\n";
	cout << "multiset容器內最大可存放 " << container.max_size () <<
		" 個元素\n\n";
	system("PAUSE");

    return 0;
 }

 template <class T>
 void PrintOut(T& container)
 {
     if(container.empty())
     {
         cout << "容器為空";
     }
     else
     {
         multiset<string>::iterator ptr;
		 cout << "容器內的資料為：";
         for(ptr=container.begin();ptr!=container.end();ptr++)
         {
             cout << *ptr << " ";
         }
         cout << "\n\n";
     }
 }
