#include <iostream>
using namespace std;
class Calculation
{
    public:
  float speedconversion(int x);
  int length_of_train(float y, float z);
};
float Calculation::speedconversion(int x)
{ return (float)x*5/18; }

int Calculation::length_of_train(float y, float z)
{
  return (int)(y*z);
}
int main() {
  int speed,sec;
  std::cin>>speed>>sec;
  Calculation train;
  float ans=train.speedconversion(speed);
  std::cout<<"The length of train is "<<train.length_of_train(ans,sec)<<" meter";
  return 0;
}