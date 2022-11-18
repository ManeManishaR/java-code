class Object
{
 int id;
String name; 
 String company;
 

Object(int n, String m)
 
    {
 
   id=n;
    name=m;
        }
   void display()
         {
   System.out.println(id+" "+company+"  "+name);
         }
 public static void main(String[]args)
         {
     Object x1= new Object(25,"Mahi");
     Object x2= new Object(26,"Mahima");
     Object x3= new Object(27,"Manisha");

     x1.company ="MNC";
     x2.company ="LwS";
     x3.company = "MTV";

     x1.display();
     x2.display();
      x3.display();
          }
    }