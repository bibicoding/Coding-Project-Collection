#include <stdio.h>
#include <stdlib.h>
#include "password.h"

int cnt = 3;  /*¥ş°ìÅÜ¼Æ*/
int password = 123456;
int pw(int a)
{
	if(a == password)
		return 1;
	else{
		cnt -= 1;
		return 0;		
	}
}

