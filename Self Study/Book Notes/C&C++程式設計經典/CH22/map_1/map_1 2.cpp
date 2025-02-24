#include <cstdlib>
#include <iostream>
#include <string>
#include <map>
using namespace std;

int main(int argc, char** argv)
{
   typedef map<string, string, less<string> >  my_map ;
	
	my_map container;
	container.insert
	(my_map::value_type ("py001", "Python基礎必修課"));
	container.insert
	(my_map::value_type ("cs001", "Visual C#基礎必修課"));
	container.insert
	(my_map::value_type ("cs002", "Visual C#程式設計經典"));
	my_map::iterator ptr;
	cout << "書號\t書名\n";
	cout << "=====================================\n";
	for (ptr=container.begin (); ptr!=container.end(); ptr++){
		cout << ptr->first << "\t" << ptr->second << "\n";
	}
	cout << "\n";
	system("PAUSE");
   return 0;
}

