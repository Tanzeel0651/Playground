#include<stdio.h>
int main()
{
  	//type your code here
  float n,check,max=0;
  scanf("%f",&n);
  
  for(int i=0;i<n;i++){
    scanf("%f",&check);
    if(i==0) max=check;
  	if(check>max){
    	max =check;
    }
  }
  printf("%.0f", max);
  return 0;
}