 #include <cstdlib>
 #include <iostream>
 #include <string>
 using namespace std;

 class Student{
 public:
	int No;					// 用來記錄是第幾位學生
	static int Total ;		// 靜態資料成員(靜態變數)，記錄學生總數
	string Name;
	static void ShowTotalStudents()	{	// 靜態成員函式(靜態方法)
		cout << "現在共有 " << Total << " 位學生" << endl ;
	}
	void ShowMe(){ 
		cout << this->Name << " 是第 " << No << " 位學生。" << endl;
	}
	Student(string vStudentName){		//建構式
		Total += 1;
		No = Total;		//記錄學生總數
		Name = vStudentName;
	}
	~Student(){			//解構式
		Total -= 1;
	}
 };

int Student::Total = 0;	//Student類別的靜態資料成員學生總數為0

int main(int argc, char** argv) {
 	Student::ShowTotalStudents();	// 呼叫靜態成員函式
	Student Jack("Jack") ;			// 宣告第一位學生
	Jack.ShowMe();
	Student Winnie("Winnie") ;		// 宣告第二位學生
	Winnie.ShowMe();
	Student Max("Max");				// 宣告第三位學生
	Max.ShowMe(); 
	Student::ShowTotalStudents();
	Student *MyStudent;				// 宣告一個 Student 的參考
	MyStudent = &Winnie;			// 將MyStudent指向學生Winnie 
	MyStudent->ShowMe();
	Student::ShowTotalStudents();		
	system("PAUSE");
	return 0;
}
