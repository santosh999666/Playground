#include<iostream>
using namespace std;
int main()
{
  int a,b[4],i;
  std::cin>>a;
  while(a>0)
  {
    b[i]=a%10;
    a=a/10;
    i++;
  }
  std::cout<<b[0]+b[3];
}