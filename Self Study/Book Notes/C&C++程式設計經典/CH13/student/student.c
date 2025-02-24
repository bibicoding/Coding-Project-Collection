#include <stdio.h>
#include <stdlib.h>
#include<string.h>
#define SIZE 10

struct student
{
	char name[SIZE];
	int score;
	char *remark;
} student1, student2;

int main(int argc, char *argv[]) {
    char str[32];
    struct student student3 = {"王五", 75, 
        "沉默寡言，個性憨厚，不善與人爭，做事有責任心。"};
    strcpy(student1.name, "張三");
    student1.remark = "心思敏捷，能舉一反三，唯有時注意力不集中。";
    student1.score = 79;
    
    printf("請輸入姓名："); 
    gets(student2.name);
    printf("請輸入成績："); 
    gets(&student2.score);
    printf("請輸入評語："); 
    gets(str);
    student2.remark = str;
    
    printf("\n ====== 學生成績列表 ====== \n");

    printf("學生姓名：%s\n", student1.name);
    printf("學生成績：%d\n", student1.score);
    printf("老師評語：%s\n\n", student1.remark);
    
    printf("學生姓名：%s\n", student2.name);
    printf("學生成績：%d\n", student2.score);
    printf("老師評語：%s\n\n", student2.remark);
    
    printf("學生姓名：%s\n", student3.name);
    printf("學生成績：%d\n", student3.score);
    printf("老師評語：%s\n\n", student3.remark);
    system("PAUSE");
	return 0;
}
