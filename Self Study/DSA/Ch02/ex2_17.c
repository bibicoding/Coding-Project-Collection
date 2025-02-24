#include <stdio.h>
#include <string.h>

int StrMatch(char str[], char pat[])
{
  int i, j;
  int start = 0;                
  int end = strlen(str) - 1;    
  int endp = strlen(pat) - 1;   
  int endmatch = endp;          
  
  for (i = 0; endmatch <= end; endmatch++, start++){
    if (str[endmatch] == pat[endp])
      for (j = 0, i = start; j < endp && str[i] == pat[j]; i++, j++) ;
    if (j == endp) return start; 
  }
  return -1;                    
}

int main()
{
  char str[] = "yxyxxxyyxxx";
  char pat[] = "yyx";
  
  printf("%d", StrMatch(str, pat));
}