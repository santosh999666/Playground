#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  std::cin>>a>>b;
  c=a/b;
  std::cout<<"The number of friends in each team is "<<c<<" and left out is "<<a-(c*b);
}