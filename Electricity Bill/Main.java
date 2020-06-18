#include<iostream>
using namespace std;
int main()
{
  int i,a,b,c,d;
  std::cin>>i;
  if(i<=200)
  {  a=i*0.5;
    std::cout<<"Rs."<<a;
  }
  else if(i>200 && i<=400)
  { b=(i*0.65)+100;
    std::cout<<"Rs."<<b;
  }
  else if(i>400 && i<=600)
  {c=(i*0.80)+200;
    std::cout<<"Rs."<<c;
  }
  else
  { d=(i*1.25)+425;
    std::cout<<"Rs."<<(i*1.25)+425;
  }
    //Type your code here.
}