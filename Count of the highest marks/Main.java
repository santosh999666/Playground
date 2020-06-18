#include<iostream>
using namespace std;
class Student
{
  int  m[5],sum;
  public:
  Student():sum(0){
  }
 void input();
 int calculateTotalScore();
  
};
void Student::input()
{
  for(int i=0;i<5;i++)
    cin>>m[i];
}
int Student::calculateTotalScore()
{
  for(int i=0;i<5;i++)
    sum=sum+m[i]; 
  return sum;
}
int main()
{
  int n;
  cin>>n;
  Student s[n];
  for(int i=0;i<n;i++)
  {
    s[i].input();
  }
  int score=s[0].calculateTotalScore();
  int count=0;
  for(int i=1;i<n;i++)
  {
    int total=s[i].calculateTotalScore();
    if(total>score)
      count++;
  }
  cout<<count;
  return 0;
}