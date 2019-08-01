#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d", &n);
  int arr[n];
  for(int i=0;i<n;i++){
  	if(i<2) arr[i] = i;
    else{
    	arr[i] = arr[i-2]+arr[i-1];
    }
    printf("%d ",arr[i]);
  }
  return 0;
}