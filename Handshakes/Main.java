#include<iostream>
using namespace std;
int main()
{
  int a,sum=0;
  std::cin>>a;
  if(a==0)
    std::cout<<0;
  else{
    for(int i=1;i<a;i++)
      sum=sum+i;
  }
  std::cout<<sum;
}