#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d", &n);
  int arr[n];
  for (int i=0;i<n;i++){
  	scanf("%d", &arr[i]);
  }
  int find;
  scanf("%d", &find);
  for(int i=0;i<n;i++){
  	if(arr[i]==find){
    	printf("%d",i+1);
      return 0;
    }
  }
  printf("%d isn't present in the array.", find);
  return 0;
}