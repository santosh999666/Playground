#include<iostream>
int main()
{
 int w1,w2;
  std::cin>>w1>>w2;
  if(w1>w2)
    std::cout<<"Yes, you can enter.";
  else if(w1==w2)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
  }