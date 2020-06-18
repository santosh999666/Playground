#include<iostream>
using namespace std;
int main()
{
  int r,s;
  std::cin>>r>>s;
  if((r*2)==s)
    std::cout<<"circle can be inside a square";
  else
    std::cout<<"circle cannot be inside a square";
  return 0;//Type your code here.
}