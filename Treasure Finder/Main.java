#include<iostream>
#include <algorithm>
using namespace std;
int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 

int findGCD(int arr[], int n) 
{ 
    int result = arr[0]; 
    for (int i = 1; i < n; i++) 
        result = gcd(arr[i], result); 
  
    return result; 
} 
int main()
{
    int arr[3],b=3,i;
    for (i = 0; i < 3; i++)
        std::cin >> arr[i];    
    int n = sizeof(arr)/sizeof(arr[0]); 
  
    sort(arr, arr+3); 
    std::cout << "The treasure is in box which has number " << arr[1]<<endl;
std::cout<<"The code to open the box is "<<findGCD(arr, n);

    
}