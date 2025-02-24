#include <cstdlib>
#include <iostream>
#include <string>
using namespace std;
//定義Student學生類別
class Student{
private :
	string _name;
	int _score;
	
public :
	void setName(string value) {	//設定學生姓名 
	    _name = value;
	}
	string getName() {	//取得學生姓名
	    return _name;
	}
	void setScore(int value){	//設定學生成績範圍0~100 
		if (value < 0 ){
			_score=0;
		}
		else if(value > 100) {
			_score = 100;
		}else{
			_score = value;
		}
	}
	int getScore(){	//取得學生成績
		return _score;
	}
	void print(){	// 印出學生的姓名與成績 
		cout << getName() << "\t" << getScore()  << endl;		
	}
};

int main(int argc, char** argv) {
	string name;
    int i, score, num;
    cout << "請輸入學生的人數：";
    cin >> num;
	Student *ptr;				//宣告Student類別的指標
	//動態配置陣列，ptr指向物件陣列的第一個元素的位址
	ptr=new Student[num];		//產生num個陣列元素
	cout << "請輸入 " << num << " 位學生的姓名與成績\n";
	for (i=0; i<num; i++){
		cout << "第 " << (i+1) << " 位學生姓名：" ;
		cin >> name;
		ptr->setName(name);     //使用指標設定姓名 
		cout << "第 "  << (i+1) << " 位學生成績：";
		cin >> score;
		ptr->setScore(score); //使用指標設定成績 
		ptr++;					//指標往下移，相當於陣列元素跳下一個註標
	}
	cout << "\n印出所有學生的姓名與成績\n";
	cout << "編號\t姓名\t成績\n";
	cout << "==================\n";
	ptr-=num;		//ptr指向物件陣列的第一個元素的位址
	for (i=0; i<num; i++){    
	    //印出第i位學生的姓名與成績
		cout <<" " << (i+1) << "\t";
		ptr->print();
		ptr++;					//指標往下移，相當於陣列元素跳下一個註標
	}
	system("PAUSE");
	return 0;
}

