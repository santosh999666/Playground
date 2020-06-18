#include<iostream>
using namespace std;
int main()
{
  int r,h,lt,hr,v;
  std::cin>>r>>h>>lt>>hr;
  v=3.14*(r*r)*h;
  if(v<=(lt*hr))
    cout<<"The tank can be filled within "<<hr<<" hours";
  else
    cout<<"The tank cannot be filled within "<<hr<<" hours";
  
}