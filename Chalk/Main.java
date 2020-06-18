#include <cmath> 
#include <iomanip> 
#include <iostream> 
using namespace std;
int main()
{
  double a;
  std::cin>>a;
  if (a==0)
    std::cout<<0;
  else if (a==1)
    std::cout<<1;
  else{
  float b=sqrt(a);
   int x=b;
  if(x==b){
  int c=a+ceil(a/(b))+1;
  std::cout<<c;
  }
    else{
      int c=a+ceil(a/(b));
  std::cout<<c;
    }
  }
}