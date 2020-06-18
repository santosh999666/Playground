#include<iostream>
using namespace std;
int main()
{
  float m;
  std::cin>>m;
  int p,d;
  std::cin>>p>>d;
  if((m*p)>=d)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
}