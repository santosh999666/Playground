#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f;
  std::cin>>a>>b>>c;
  a=a-(a*b/100);
  d=a+c;
  std::cin>>a>>b>>c;
  a=a-(a*b/100);
  e=a+c;
  std::cin>>a>>b>>c;
  a=a-(a*b/100);
  f=a+c;
  std::cout<<"In Flipkart Rs."<<d<<endl;
  std::cout<<"In Snapdeal Rs."<<e<<endl;
  std::cout<<"In Amazon Rs."<<f<<endl;
  
  if (d <= e && d <= f) 
        std::cout << "He will prefer Flipkart"; 
  
    else if (e <= f) 
        std::cout << "He will prefer Snapdeal"; 
  
    else
        std::cout <<"He will prefer Amazon"; 
  
    return 0; 
}