#include<stdio.h>
int main()
{
	//type your code here
    char str[100];
    gets(str);
    char x;
    int count = 0;
    for (int i=0;i<strlen(str);i++){
        if(i==0) x = str[i];
        if(str[i]==x){
            count++;
        }else{
            if(count>20){
                printf("Invalid Input");
                return 0;
            }
            printf("%c",str[i-1]);
            printf("%d", count);
            count = 1;
            x = str[i];
        }
        if(i==strlen(str)-1){
            if(count>20){
                printf("Invalid Input");
                return 0;
            }
            printf("%c",str[i]);
            printf("%d", count);
        }
    }
}