#include<iostream>
using namespace std;
int main()
{
  int b,c;
  std::cin>>b>>c;
  if(c>b)
    std::cout<<c-b;
  else
    std::cout<<abs(100-b+c);
}