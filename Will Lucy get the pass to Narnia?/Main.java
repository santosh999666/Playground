# include <iostream>
using namespace std;

int main()
{
    int op;
    int num1, num2;

    std::cin >> num1 >> num2;
    std::cin >> op;
  std::cout<<"Enter first number : Enter second number : Menu"<<endl;
  std::cout<<"1.Addition"<<endl;
  std::cout<<"2.Subtraction"<<endl;
  std::cout<<"3.Multiplication"<<endl;
  std::cout<<"4.Division"<<endl;
  std::cout<<"5.Remainder"<<endl;
    switch(op)
    {
        case 1:
            std::cout << num1+num2;
            break;

        case 2:
            std::cout << num1-num2;
            break;

        case 3:
            std::cout << num1*num2;
            break;

        case 4:
            std::cout << num1/num2;
            break;
        case 5:
            std::cout << num1%num2;
            break;

        default:
            std::cout << "Invalid operation";
            break;
    }
}