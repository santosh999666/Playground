#include<iostream>
int main()
{
  int num, temp,count=0,flag=0;
    std::cin >> num;
if( num==0) 
  count=1;
else
{
while(num>0)
{
num=num/10;
count++;
  flag=1;
}
}
std::cout << count;

    return 0;
}