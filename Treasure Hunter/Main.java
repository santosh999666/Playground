#include<iostream>
using namespace std;
int main()
{
 int n,x,y,lb,bb,l;
  std::cin>>n>>x>>y;
  lb=n*x/100;
  std::cout<<lb<<endl;
  bb=((n-lb)*y)/100;
  std::cout<<bb<<endl;
  l=(n-lb-bb)/3;
  std::cout<<l;
  
}