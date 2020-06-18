#include<iostream>
#include<cmath>
using namespace std;
class Shape
{
 public:
     int length;
     int breadth;
     int height;
     int radius;
    public:
    Shape()
    {
    }
    Shape(int radius,int height)
    {
      this->radius=radius;
      this->height=height;
      cout<<"Area of Cylinder is "<<calculateAreaOfCylinder();
    }
  Shape(int radius)
  {
    this->radius=radius;
    cout<<"Area of Sphere is "<<calculateAreaOfSphere();
  }
  Shape(int length,int breadth,int height)
  {
    this->length=length;
    this->breadth=breadth;
    this->height=height;
    cout<<"Area of Rectangular prism is "<<calculateAreaOfRectangle();
  }
  float calculateAreaOfSphere()
  {
    return (float)(4*3.14*pow(radius,2));
  }
  float calculateAreaOfCylinder()
  {
    return (float)((2*3.14)*(pow(radius,2))+(2*3.14*radius*height));
  }
  int calculateAreaOfRectangle()
  {
    return (length+breadth+height);
  }                 
};int main()
{
 Shape ob;
    cout<<"1.Cylinder\n2.Sphere\n3.Rectangular prism\n";
    cout<<"Enter the choice\n";
    int x;
    cin>>x;
    if(x==1)
    {
      int radius,height;
      cin>>radius>>height;
      ob=Shape(radius,height);
    }
    else if(x==2)
    {
      int radius;
      cin>>radius;
      ob=Shape(radius);
    }
    else if(x==3)
    {
      int length,breadth,height;
      cin>>length>>breadth>>height;
      ob=Shape(length,breadth,height);
    }
}