#include<iostream>
int main()
{
  int a,arr[6],flag=0,i=0;
std::cin>>a;

while(a>0)
{
    arr[i] = a % 10;
    a /= 10;
  i++;
}
int len=i;
  for(int i=0;i<len;i++)
  {
    if(arr[i]==2)
    {
      flag=1;
      std::cout<<"Possible";
      break;
    }
    
  }
  if(flag==0)
    std::cout<<"Not possible";
}
