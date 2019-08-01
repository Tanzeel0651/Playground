#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char str[100];
  int count = 1;
  gets(str);
  for(int i=0;i<strlen(str);i++){
  	if (str[i]==' ') count++;
  }
  printf("%d",count);
}