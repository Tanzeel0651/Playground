#include<stdio.h>
int main()
{
  //type your code here
  int a=1, b=1, n;
  scanf("%d",&n);
  int x[n];
  //x[0] = 1;
  for(int i=1;i<(n+1);i++){
  	if(i%2==0){
    	x[i-1]=a;
      a = a*3;
    }
    else{
    	x[i-1]=b;
      b=b*2;
    }
  }
  printf("%d",x[n-1]);
  return 0;
}