#include<stdio.h>
int main()
{
  char str[100];
  scanf("%[^\n]s", str);
  //gets(str);
  for(int i=0;i<strlen(str);i++){
      if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||
            str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U'){
                
            }
        else{
            printf("%c", str[i]);
        }
  }
  
  //Type your code here
  
  return 0;
}