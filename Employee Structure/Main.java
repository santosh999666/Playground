#include<iostream>
using namespace std;
struct emp
{
char nm[20],desg[20];
  int id,ag,sal;
}s;
int main()
{
  cout<<"Enter name:"<<endl;
  cin>>s.nm;
  cout<<"Enter ID:"<<endl;
  cin>>s.id;
  cout<<"Enter age:"<<endl;
  cin>>s.ag;
  cout<<"Enter designation:"<<endl;
  cin>>s.desg;
  cout<<"Enter Salary:"<<endl;
  cin>>s.sal;
  cout<<"Employee Details"<<endl;
  cout<<"Name of the Employee : "<<s.nm<<endl;
  cout<<"ID of the Employee : "<<s.id<<endl;
  cout<<"Age of the Employee : "<<s.ag<<endl;
  cout<<"Designation of the Employee : "<<s.desg<<endl;
  cout<<"Salary of the Employee : "<<s.sal<<endl;
  
  
}