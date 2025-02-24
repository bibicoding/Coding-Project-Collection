#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
    printf("== 1234567890\n");
    printf("1. %9d \n",456);
	printf("2. %9d \n",-456);
	printf("3. %-9d \n",456);
	printf("4. % -9d \n",456);
	printf("5. %-9d \n",-456);
	printf("6. %+9d \n",456);
	printf("7. %+9d \n",-456);
	printf("8. %-+9d \n",456);
	printf("9. %-+9d \n",-456);
	printf("10 %09d \n",456); 
	printf("11 %09d \n",-456);
	printf("12 %-09d \n",456);
	printf("13 %-09d \n",-456);
	printf("14 %+09d \n",-456);
	printf("15 %-+09d \n",-456);
	printf("16 % -9d \n",456);
	printf("17 % -2d \n",-456);
	system("PAUSE");
	return 0;
}
