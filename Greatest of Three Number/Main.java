#include <stdio.h>

int main()
{ 
    // type your code here
  int a,b,c,max;
  scanf("%d,%d,%d", &a,&b,&c);
  if((a>b)&&(a>b)){
  	max = a;
  }
      else if((b > a) && (b > c))
    {
        max = b;
    }
    else if((c > a) && (c > b))
    {
        max = c;
    }
    printf("%d", max);
  return 0;
}