#include<iostream>
using namespace std;
int main ()
{
  int st,end,n,i;
  std::cin>>st>>end;
  for(n=st;n<=end;n++){
    i=1;
    int sum = 0;
    while(i<n){
      if(n%i==0)
           sum=sum+i;
          i++;
    }
    if(sum==n)
      std::cout<<n<<" ";
  }
      printf("\n");
}
  