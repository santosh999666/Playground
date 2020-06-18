#include<iostream>
using namespace std;
int main()
{
  int ag;
  float t;
  std::cin>>ag>>t;
  if( (ag>=13) && (t==13.30f) )
    std::cout<<"$5.00";
  else if( (ag<13) && (t==13.30f) )
    std::cout<<"$2.00";
  else if( (ag>=13) && (t!=13.30) )
    std::cout<<"$8.00";
  else if( (ag<13) && (t!=13.30) )
    std::cout<<"$4.00";
}