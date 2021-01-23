class calculation
{
    float number1;
    float number2;
    float product;
    public void getsum()
    {
        product =number1*number2;
        System.out.println("the product of two float number is "+product);
    }
    public int  getinfo()
    {
        if(number1>number2)
        {
            for(int i=0; i<=number1; i++)
            {
                for(int j=0; j<=i; j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        else
        {
            for(int k=0;k<10;k++)
            {
                System.out.println("I like JAVA ");
            }
        }
        return 0;
    }
    
}
class Triangle
{
    int hieght;
    int base;
    public String getArea()
    {
        int area =(hieght*base)/2;
        System.out.println("the area of triangle is "+area);
        
        return null;
    }
}
class Testresults
{
    public static void main(String []mucyo)
    {
        calculation btn=new calculation();
        Triangle tria=new Triangle();
        btn.number1=3.2f;
        btn.number2=4.1f;
        tria.hieght=3;
        tria.base=4;
        btn.getsum();
        btn.getinfo();
        tria.getArea();
    }
}