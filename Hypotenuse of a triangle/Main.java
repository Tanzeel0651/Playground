#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float a,b;
  scanf("%f", &a);
  scanf("%f", &b);
  float c = sqrt(pow(a,2)+pow(b,2));
  printf("%.2f",c);
  return 0;
}