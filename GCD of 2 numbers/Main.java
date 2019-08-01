// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int a, b, max;
  scanf("%d",&a);
  scanf("%d",&b);
    if (a>b){
      max = a;
    }
     else{
        max=b;
     }
    for(int i=max;i>0;i--){
      //printf("%d",i);
    	if(a%i==0 && b%i==0){
        	printf("%d",i);
          return 0;
        }
    }
   return 0;
}