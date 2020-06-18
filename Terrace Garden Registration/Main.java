#include<iostream>
using namespace std;

class Customer
{public:
 string nm,add,num,eml,prf,id;
 public:
 string getName()
 { return nm;
 }
 void setName(string nm)
 {
   this->nm=nm;
 }
 
 string getAdd()
 { return add;
 }
 void setAdd(string add)
 {
   this->add=add;
 }
 
 string getNum()
 { return num;
 }
 void setNum(string num)
 {
   this->num=num;
 }
 
 string getEml()
 { return eml;
 }
 void setEml(string eml)
 {
   this->eml=eml;
 }
 
 string getPrf()
 { return prf;
 }
 void setPrf(string prf)
 {
   this->prf=prf;
 }
 
 string getId()
 { return id;
 }
 void setId(string id)
 {
   this->id=id;
 }
 
 
 void display()
 {
   std::cout<<"Customer Details"<<endl;
   cout<<this->getName()<<endl;
   cout<<this->getAdd()<<endl;
   cout<<this->getNum()<<endl;
   cout<<this->getEml()<<endl;
   cout<<this->getPrf()<<endl;
   cout<<this->getId()<<endl;
   cout<<"Thank you for registering. Your id is 1..."<<endl;
 }
 
};
int main()
{
    string nm,add,num,eml,prf,id;
  std::cout<<"Registration"<<endl;
  std::cout<<"Enter your name"<<endl;
  std::cin>>nm;
  std::cout<<"Enter your address"<<endl;
  std::cin>>add;
  std::cout<<"Contact Number"<<endl;
  std::cin>>num;
  std::cout<<"E-Mail ID"<<endl;
  std::cin>>eml;
  std::cout<<"Enter proof type"<<endl;
  std::cin>>prf;
  std::cout<<"Enter proof id"<<endl;
  std::cin>>id;
  Customer cust;
  cust.setName(nm);
  cust.setAdd(add);
  cust.setNum(num);
  cust.setEml(eml);
  cust.setPrf(prf);
  cust.setId(id);
  cust.display();
  
  return 0;
}