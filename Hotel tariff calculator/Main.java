#include<iostream>
using namespace std;
int main()
{
  int m,r,d;
  cin>>m>>r>>d;
  switch(m)
  {
    case 1:
    case 2:
    case 3:
    case 7:
    case 8:
    case 9:
    case 10:cout<<r*d;
      break;
    case 4:
    case 5:
    case 6:
    case 11:
    case 12:cout<<r*d*120/100;
      break;
    default: cout<<"Invalid Input";
      
      
}
}