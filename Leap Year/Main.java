#include<stdio.h>
#include<stdbool.h>
bool check(int year){
	if(year%400==0) return true;
  	if(year%100==0) return false;
  	if(year%4==0) 
      return true;
  	return false;
}
int main()
{
  //Type your code here
  int year = 0;
  scanf("%d",&year);
  check(year)? printf("LEAP YEAR"):
 			   printf("NOT LEAP YEAR");
  return 0;
}