#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int t,v;
  std::cin>>t>>v;
  float WCF = 35.74 + 0.6215*t + (0.4275*t - 35.75) * pow(v,0.16);
  std::cout<<WCF;
}