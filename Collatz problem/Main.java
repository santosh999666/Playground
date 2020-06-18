#include<iostream>
using namespace std;
void printCollatz(int n) 
{ 
  	int c = 0;
    while (n >1) 
    { 
        int f;
      	
      cout << n <<endl;
        if(n%2==0){
		f=n/2;
      	c++;
        }
	else{
		f=3*n+1;
		c++;
    }
	n=f;
    } 
    cout << n<<endl; 
  	cout << c<<endl;
} 
int main() 
{ 
    int a;
  std::cin>>a;
  printCollatz(a); 
    return 0; 
} 