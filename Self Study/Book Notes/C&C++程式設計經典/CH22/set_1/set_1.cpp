#include <cstdlib>
#include <iostream>
#include <string>
#include <set>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
using namespace std;
template <class T>
void PrintOut(T& container);

int main(int argc, char** argv) {
	string name[]={"Peter", "John", "Tom", "Mary"};
	set<string, less<string> > container(name, name+4);
	PrintOut(container);

	string input_name;
	cout << "由set容器內插入資料：";
	cin >> input_name;
	container.insert(input_name);
	PrintOut(container);

	string s_name;
	cout << "請輸入要尋找的姓名：";
	cin >> s_name;
    set<string>::iterator ptr;
	ptr = container.find (s_name);
	if (ptr==container.end()){
		cout << "set容器內沒有" << s_name << "\n";
	}else{
		cout << "set容器內有" << s_name << "\n";
	}
    cout << "\n";
	cout << "set容器內有 " << container.size () << " 個元素\n";
	cout << "set容器內最大可存放 " << container.max_size () << " 個元素\n\n";
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
        set<string>::iterator ptr;
		 cout << "容器內的資料為：";
        for(ptr=container.begin();ptr!=container.end();ptr++)
        {
            cout << *ptr << " ";
        }
        cout << "\n\n";
    }
}

