#include<iostream>
using namespace std;
int main()
{
  int m,n,a;
std::cin>>m>>n>>a;
int arr[m][n],i,j,s=1;
    std::cin>>m>>n>>a;
    
     for (i = 0; i < m; i++) { 
    for (j = 0; j < n; j++) { 
      arr[j][i]=s++; 
    } 
  }
  
  if(a>=arr[0][1] && a<=arr[m-1][1])
    std::cout<<"It is an orange tree";
  else if(a>=arr[0][n-2] && a<=arr[m-1][n-2])
    std::cout<<"It is an orange tree";
  else
    std::cout<<"It is not an orange tree";
}