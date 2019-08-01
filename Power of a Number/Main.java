#include <stdio.h>
int main()
{
  	//Your code here  
  int a, b;
  scanf("%d", &a);
  scanf("%d", &b);
  if (b<0){
    printf("Wrong input");
    return 0;
  }
  int res = pow(a,b);
  printf("%d",res);
    return 0;
}