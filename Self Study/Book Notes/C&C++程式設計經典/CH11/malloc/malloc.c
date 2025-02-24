#include <stdio.h>
#include <stdlib.h>

void swap(int *, int *);
int main(int argc, char *argv[]) 
{
    int *ptr;
    int n, i, j;

    printf("請問要輸入幾個整數：");
    scanf("%d", &n); 
    ptr = (int *)malloc(sizeof(int) * n);
    if(ptr != NULL)
    {
        for(i = 0; i < n; i ++)
        {
            printf("  第%2d個整數：", i + 1);
            scanf("%d", ptr + i);
        }
        for(i = 0, j = n - 1; i < n / 2; i++, j--)
        {
            swap(ptr + i, ptr + j);
        }
        printf("翻轉後的資料\n");
        for(i = 0; i < n; i ++)
        {
            printf("%d\t", *(ptr + i));
        }
        printf("\n");
        free(ptr);
    }
    else
    {
        printf("記憶體配置失敗!\n");
    }
    system("PAUSE");
	return 0;
}

void swap(int *x, int *y)
{
    int temp;
    temp = *x;
    *x = *y;
    *y = temp;
}
