#include <cstdlib>
#include <iostream>
#include <list>
using namespace std;

template <class T>
void PrintOut(T& container);

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	list<int> container;

	cout << "將 3, 4 兩個元素壓入list容器的最後面...\n";
	container.push_back (3);
	container.push_back (4);
	PrintOut(container);

	cout << "將list容器內最前面的元素刪除...\n";
	container.erase (container.begin ());
	PrintOut(container);

    cout << "將 5 元素放入list容器的最後面...\n";
	container.insert  (container.end(), 5);
	PrintOut(container);

	cout << "將 6,7 兩個元素壓入list容器的最前面...\n";
	container.push_front (6);
	container.push_front (7);
	PrintOut(container);

	cout << "將list容器內的元素進行由遞增排序...\n";
    container.sort ();
	PrintOut(container);

	cout << "由list容器內最前面彈出兩個元素...\n";
	container.pop_front ();
	container.pop_front ();
	PrintOut(container);

	cout << "由list容器內的元素清空...\n";
	container.clear ();
	PrintOut(container);

	cout << "list容器內有 " << container.size () << " 個元素\n";
	cout << "list容器內最大可存放 " << container.max_size () << " 個元素\n\n";
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
        list<int>::iterator ptr;
		 cout << "容器內的資料為：";
        for(ptr=container.begin();ptr!=container.end();ptr++)
        {
            cout << *ptr << " ";
        }
        cout << "\n\n";
    }
}

