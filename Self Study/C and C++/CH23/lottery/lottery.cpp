#include <cstdlib>
#include <ctime>
#include <iostream>
#include <functional>
#include <algorithm>
#include <vector>

using namespace std;
//PrintOut用來印出vector容器中的所有元素 
void PrintOut(vector<int>& container)
{
    if(container.empty())
    {
        cout << "目前尚未開獎";
    }
    else
    {
        vector<int>::iterator ptr;
        for(ptr=container.begin();ptr!=container.end();ptr++)
        {
            cout << *ptr << "  ";
        }
        cout << "\n\n";
    }
}


int main(int argc, char** argv) {
	// 使用vector容器物件建立num[0]~num[48]用來放置大樂透號碼1~49 
	vector<int> num(49);
	int i;
	for(i=0; i<num.size(); i++){
		num[i]=(i+1);
	}
	// 使用vector容器物件建立lotteryNum[0]~lotteryNum[5]用來放置六個得獎號碼 
	vector<int> lotteryNum(6);
	srand((unsigned)time(NULL));  //用時間當亂數種子 
	int k, index;
	// 由num[0]~num[48]中亂數找六個元素放至lotteryNum[0]~lotteryNum[5] 
	for(k = 0; k<lotteryNum.size(); k++){		
		index = rand() % num.size(); // 產生亂數index 
		lotteryNum[k]=num[index];    // 將第index個的num放到lotteryNum[k] 
		num.erase(num.begin()+index); // 移除num[index]，表示被抽中的號碼不會再出現 
	}	
	cout<< "大樂透開獎號碼(未排序)" << endl;
	//印出lotteryNum容器內的元素 
	PrintOut(lotteryNum);
	//使用sort()函式將lotteryNum內的所有元素進行遞增排序 
	sort(lotteryNum.begin(), lotteryNum.end(), less<int>());
	cout<< "大樂透開獎號碼(遞增排序)" << endl; 
	//印出lotteryNum容器內的元素 
	PrintOut(lotteryNum);
	system("PAUSE");
	return 0;
}
