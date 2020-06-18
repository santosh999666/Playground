#include<iostream>
using namespace std;
int main()
{
  int b,a,c;
  std::cin>>b>>a>>c;
  a=a*75;
  c=c*30;
  if((a+c)<=b)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will sink";
    
  //Type your code here.
}