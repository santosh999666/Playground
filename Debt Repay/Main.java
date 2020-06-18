#include<iostream>
#include <iomanip> 
#include<stdio.h>
using namespace std;
int main()
{
  float p,r,t;
  float a,b,si;
  std::cin>>p>>r>>t;
  si=(float)(p*t*r)/100.00;
  a=si*(2.0/100);
  b=(p+si)-a;
  printf("%.2f\n%.2f\n%.2f\n%.2f\n",si,p+si,a,b);
  //std::cout<<si<<endl;
  //std::cout<<p+si<<endl;
  //std::cout << a<<endl;
  //std::cout << b<<endl;
}