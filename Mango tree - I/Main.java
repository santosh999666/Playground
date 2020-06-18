#include<iostream>
using namespace std;
int main()
{
  int m,n,a;
std::cin>>m>>n>>a;
int arr[m][n],i,j,s=1,flag=0,c=1;
    
    for (i = 0; i < m; i++) { 
    for (j = 0; j < n; j++) { 
      arr[i][j]=c;
      c++;
    } 
  }
  
  if(a>=arr[0][0] && a<=arr[0][n-1]){
    for(i=0;i<n;i++){
    if(arr[0][i]==a){
      std::cout<<"Yes";
      flag=1;
      break;
    }}
  }
  else if(a>=arr[0][0] && a<=arr[m-1][0]){
    for(i=0;i<m;i++){
    if(arr[i][0]==a){
      std::cout<<"Yes";
      flag=1;
      break;
    }}
  }
  else{
    for(i=0;i<m;i++){
    if(arr[i][n-1]==a){
      std::cout<<"Yes";
      flag=1;
      break;
    }}
  }
    if(m==1 && n==1){
    std::cout<<"Yes";
      flag=1;
    }   
  if(flag==0)  
    std::cout<<"No";
  
}