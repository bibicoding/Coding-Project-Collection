#include <stdio.h>
#include <stdlib.h>

void encode(char []);
void decode(char []);

int main(int argc, char *argv[]) 
{
    char name[5][10] = {"Helen", "John", "Mary", "Brown", "張三"};
    int i;
    
    for(i = 0; i < 5; i ++)
    {
        encode(name[i]);
        printf("編碼後=%s\n", name[i]);
        decode(name[i]);
        printf("解碼後=%s\n", name[i]);
    }
    system("PAUSE");
    return 0;
}

void encode(char str[])
{
    int i = 0;
    
    while(1)
    {
        if(*(str + i) == '\0')
            return;
        *(str + i) += i % 3;
        i++;
    }
}

void decode(char str[])
{
    int i = 0;
    
    while(1)
    {
        if(*(str + i) == '\0')
            return;
        *(str + i) -= i % 3;
        i++;
    }
}
 
