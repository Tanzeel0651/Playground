#include<stdio.h>
int main()
{
	//type your code here
  int n;
  scanf("%d", &n);
  int arr[n];
  
  int even_count = 0;
  int odd_count = 0;
  for(int i=0;i<n;i++){
  	if(i==0) arr[0]=0;
    else{
    	if(i%2==0){
        	arr[i] = (even_count+2);
          even_count += 2;
        }else{
        	arr[i] = odd_count;
          odd_count++;
        }
    }
  }
  printf("%d", arr[n-1]);
}