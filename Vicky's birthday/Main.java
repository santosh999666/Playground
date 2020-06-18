#include<iostream>
int main()
{
  int year;
  std::cin>>year;
  if (year % 4 == 0) {
        if (year % 100 == 0) {
            // the year is a leap year if it is divisible by 400.
            if (year % 400 == 0)
                std::cout<<"Vicky can celebrate his birthday.";
            else
                std::cout<<"Vicky can't celebrate.";
        } else
            std::cout<<"Vicky can celebrate his birthday.";
    } else
        std::cout<<"Vicky can't celebrate.";
}