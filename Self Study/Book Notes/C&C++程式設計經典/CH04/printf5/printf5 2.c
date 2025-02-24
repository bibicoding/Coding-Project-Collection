#include <stdio.h>
#include <stdlib.h>
int main(int argc, char *argv[]) {
	printf("===123456789012345 \n");
	printf("1. %f \n", 1.2345);
	printf("2. %-f \n", -1.2345);
	printf("3. %.1f \n", 12.345);
	printf("4. %4.3f \n", 123.45);
	printf("5. %10.1f \n", 12.345);
	printf("6. %10.2f \n", -12.345);	
	printf("7. %010.1f \n", 12.345);
	printf("8. %+10.1f \n", 12.345);
	printf("9. %+10.1f \n", -12.345);
	printf("10 %-10.1f \n", 12.345);
	printf("11 %-10.2f \n", -12.3456);
	printf("12 %f \n", 12.3456789);
	printf("13 %g \n", 12.3456789);
	printf("14 %g \n", 123456.789);
	printf("15 %g \n", 12340.00567);
	printf("16 %G \n", 12.3456789);
	printf("17 %10.2e \n", 1234.5678);
	printf("18 %10.6e \n", 1234.5678);
    printf("19 %10.2E \n", 1234.5678);	
    printf("20 %10.2g \n", 1234.567);		
    printf("21 %10.2G \n", 123.4567);		
    printf("22 %10.2G \n", 12.34567);	
	printf("23 %10.2G \n", 1.234567);	
	printf("24 %10.3g \n", 0.00001234);	
	printf("25 %10.2G \n", 0.00001234);	
	printf("26 %10.4G \n", 0.000123456);
	printf("27 %10.3G \n", 0.000123456);
	printf("28 %10G \n", 0.000123456);	
	printf("29 %.6g \n", 0.00001234);	
	printf("30 %.6g \n", 0.00001234567);	
	printf("31 %10.5G \n", 1230.764567);		
	system("PAUSE");
	return 0;
}
