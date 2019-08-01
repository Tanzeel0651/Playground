#include<stdio.h>
int main()
{
  // Type your code here
  int a, b, c, max;
  scanf("%d %d %d", &a,&b,&c);
  int array[3] = {a,b,c};
  for (int i = 0; i < 3; ++i) 
  {
    for (int j = i + 1; j < 3; ++j) 
    {
      if (array[i] < array[j]) 
      {
        max = array[i];
        array[i] = array[j];
        array[j] = max;
      }
    }
  }
  printf("%d",array[1]);
}