#include <stdio.h>
int main(){
  float a, b;
  scanf("%f", &a);
  scanf("%f", &b);
  float res = 2*3.14*a*(b/360.0) ;
  printf("%.2f", res);
  return 0;
}