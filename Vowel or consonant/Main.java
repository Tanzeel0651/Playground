#include<stdio.h>
#include<string.h>
int main(){
	char vowel[10] = "aeiouAEIOU";
  char check;
  scanf("%c", &check);
  	for (int i=0;i<10;i++){
    	if (check == vowel[i]){
        	printf("Vowel");
          return 0;
        }
    }
  printf("Consonant");
  return 0;
}