#include<stdio.h>
int main()
{
  //your code here
  float p, t, r;
  scanf("%f\n%f\n%f", &p, &t, &r);
  
  float result = (p*t*r)/100;
  printf("%f", result);
  return 0;
}