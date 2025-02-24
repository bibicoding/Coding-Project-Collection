#include <stdio.h>
#include <stdlib.h>             /* 輸出入函式標頭檔 */
#define MSG1 " 圓半徑 : "   	/* 程式中 "圓半徑:" 以MSG1符號取代 */
#define MSG2 " 圓周長 : "   	/* 程式中 "圓周長:" 以MSG2符號取代 */
#define MSG3 " 圓面積 : "   	/* 程式中 "圓面積:" 以MSG3符號取代 */
#define PI 3.14159        	    /* 程式中 圓周率 3.14159 以PI符號取代 */

int radius = 100;           /* 宣告radius售價為全域整數變數並設定初值 */

float get_area(void);       /* 宣告get_area()為自訂函式 */

int main(int argc, char *argv[]) {  	/* 程式進入點 */
	float perimeter;        /* 宣告perimeter圓周長為區域變數,資料型別為浮點數 */
	printf(" %s %d \n\n" , MSG1, radius);      /* 顯示圓半徑數值 */
	perimeter = 2 * PI * radius;               /* 計算圓周長 perimeter*/
	printf(" %s %.2f \n\n" , MSG2, perimeter); /* 顯示圓周長的計算結果 */
   	/* 呼叫get_area()函式,取得圓面積計算後傳回主函式的值,再顯示圓面積的結果 */	
	printf(" %s %.2f \n\n" , MSG3, get_area());
	system("PAUSE");	    /* 暫停執行以觀看執行結果 */
	return 0;              	/* 結束程式執行 */
}

float get_area(void) {      /* 計算圓面積自定函式 */
	float area;             /* 宣告area圓面積為區域變數，資料型別為浮點數 */
	area = PI * radius * radius;               /* 計算圓面積 area */
	return(area);           /* 將計算後圓面積area傳回main()主函式呼叫處*/
}

