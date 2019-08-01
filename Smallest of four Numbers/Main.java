#include<stdio.h>

int main()
{
  // Type your code here
  int a[4];
  for (int i=0;i<4;i++){
  	scanf("%d", &a[i]);
  }
  int smallest = 0;
  for (int i=0;i<4;i++){
  	if (i==0) smallest = a[i];
    else{
    	if(a[i]<smallest) smallest=a[i];
    }
  }
  printf("%d", smallest);
}