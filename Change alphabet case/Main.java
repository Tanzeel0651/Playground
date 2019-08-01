#include <stdio.h>
#include<ctype.h>
int main() {
	// Type your code here
  char alpha[1];
  scanf("%c",&alpha);
  if(toupper(alpha[0])==alpha[0]){
  	printf("%c", tolower(alpha[0]));
	return 0;
  }else{
  	printf("%c", toupper(alpha[0]));
     return 0;
  }
  
	return 0;
}