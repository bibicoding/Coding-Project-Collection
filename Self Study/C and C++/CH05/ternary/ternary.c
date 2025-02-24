#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
	int score;
    printf("=== 成績評比 ===\n");
	printf("請輸入你的期中考分數：");
	scanf("%d", &score);
	printf("你期中考的成績評比是 %s ! ^_^ ... \n", score>=80? "表現優異":
 			(60<=score && score<80 ? "差強人意" : "有待加強"));	

   	printf("\n\n");
   	system("PAUSE");	
	return 0;
}
