#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int x1,y1,r1,x2,y2,r2,d;
  cin>>x1>>y1>>r1>>x2>>y2>>r2;
  d=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
  if((int)(sqrt(d))==r1+r2)
    cout<<"Tangential";
  else if((int)(sqrt(d))>r1+r2)
    cout<<"Do not Overlap";
  else
  cout<<"Overlap";
}