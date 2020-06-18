#include<iostream>
using namespace std;
int main()
{
  int i;
  float t;
  std::cin>>i>>t;
  if(i<2)
    std::cout<<t;
  else if(i==2)
  {
    float a=t+(t*50.0/100.0);
    std::cout<<a;
   }
  else if(i==3)
  {
    float b=2.0*t;
    std::cout<<b;
  }
  else
    std::cout<<"Number of items is more";
  
}