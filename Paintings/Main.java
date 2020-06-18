#include<iostream>
using namespace std;
int main()
{
  int w1,w2,p1,p2,p3,p4;
  std::cin>>w1>>w2>>p1>>p2>>p3>>p4;
  if((p1*p2)+(p3*p4)<=(w1*w2))
    cout<<"Leonardo can fix both painting";
  else
    cout<<"Leonardo cannot fix both painting";
}