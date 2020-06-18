#include<iostream>
#include <iomanip> 
using namespace std;
int main()
{
  int p,r,t,si;
  float a,b;
  std::cin>>p>>r>>t;
  si=(p*t*r)/100;
  a=si*(2.0/100);
  b=(p+si)-a;
  std::cout<<si<<endl;
  std::cout<<p+si<<endl;
  std::cout << a<<endl;
  std::cout << b<<endl;
  //Type your code here.
}