#include<iostream>
using namespace std;
int main()
{
  int x,y,a=3,b=4,c,d;
  std::cin>>x>>y;
  c=x-a;d=y-b;
  if(c>d)
    std::cout<<c;
  else
    std::cout<<d;
}