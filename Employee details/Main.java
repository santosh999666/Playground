#include<iostream>
using namespace std;
union emp
{
  int sal;
  char nm[20];
}s;
int main()
{
  cout<<"Enter the Employee details"<<endl;
  cout<<"Enter the Employee name :"<<endl;
  cin>>s.nm;
  cout<<"Enter the Employee salary :"<<endl;
  cin>>s.sal;
  cout<<"Employee Details"<<endl;
  cout<<s.nm<<" "<<s.sal;
  
}