#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[6];
  int r;
  cin>>str>>r;
  if(strcmp(str,"front")==0||strcmp(str,"FRONT")==0)
  {
    if(r==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else
  {
    if(r==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
      
      
  }
}