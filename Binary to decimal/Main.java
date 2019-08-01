#include<stdio.h>
int main()
{
  //Type your code here
  int n, result, i=1;
  scanf("%d", &n);
  while(n>0){
  	result += (n%10)*i;
    n = n/10;
    i = i*2;
  }
  printf("%d", result);
  return 0;
}