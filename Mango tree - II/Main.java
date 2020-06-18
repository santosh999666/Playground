#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  cin>>r>>c>>n;
  if(n%r==1||n<=r||(n>r*(c-1) && n<=r*c))
    cout<<"Yes";
  else
    cout<<"No";
}