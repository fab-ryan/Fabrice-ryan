class calculation1
{
    float number1;
    float number2;
    public  calculation1(float number1, float number2) {
        this.number1=number1;
        this.number2=number2;
        float product =number1*number2;
        System.out.println("the result of product is "+ product);
        
        
    }
    public  calculation1(int n, int b)
    {
        number1=n;
        number2=b;
        if (number1>number2)
        {
            for(int i=0; i<=5;i++)
            {
                for (int j=5; j>=i; j--)
                {
                    System.out.print("");
                }
                for(int k=1; k<=i*2+1;k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else
        {
            for(int f=0;f<10; f++)
            {
                System.out.println("I HATE JAVA ");
            }
        }
    }
}
class Triangle1
{
    int hieght;
    int base;
    public Triangle1(int hieght, int base)
    {
        this.hieght=hieght;
        this.base=base;
        int area = (hieght*base)/2;
        System.out.println("the area of traiangle should be "+ area);
    }
}
public class Testresults1
{
    public static void main(String [] args)
    {
        calculation1 btn=new calculation1(3.3f,4.5f);
        calculation1 bt=new calculation1(3,4);
       
        Triangle1 csz = new Triangle1(4,3);
       
    }
}