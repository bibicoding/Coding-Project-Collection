#include <stdio.h>

int StrLength(char str[])
{
  int i = 0;
  while (str[i] != '\0')
    i++;
  return i;
}

void StrCopy(char str1[], char str2[])
{
  int i = 0;
  while (str2[i] != '\0'){
    str1[i] = str2[i];
    i++;
  }
  str1[i] = '\0';
}

int main()
{
  char str1[] = "abcaaaabc";
  char str2[] = "aaabbbcccddd";
  char str[20];
  printf("%d %d", StrLength(str1), StrLength(str2));
  StrCopy(str, str2);
  printf("%s", str); 
}