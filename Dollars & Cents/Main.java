#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  float a,b,c,d;
  std::cin>>a>>b>>c>>d;
  float e=a+(b/100)+c+(d/100);
 
  int intgr = e;
  int fract = ((((e - intgr)*100)*100)+.5)/100;
  
  cout<<intgr<<endl;
  cout<<fract;
  }