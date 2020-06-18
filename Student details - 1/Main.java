#include<iostream>
using namespace std;
struct Student
{
  int ag,std;
  string fname;
  string lname;
};
int main(){
 Student s1;
  cin>>s1.ag>>s1.fname>>s1.lname>>s1.std;
  cout<<s1.ag<<" "<<s1.fname<<" "<<s1.lname<<" "<<s1.std;
  
  
}