#include<stdio.h>
int main()
{
  //type your code here
  int n,i=0;
  scanf("%d", &n);
  int octal_number[32];
  while (n>0){
  	octal_number[i] = n%8;
    n = n/8;
    i++;
  }
  for(int j=i-1;j>=0;j--){
  	printf("%d", octal_number[j]);
  }
  return 0;
}