public class overloading
{
    int add(int a, int b)
    {
        int sum=a+b;
        return (sum);
    }    
    double add(double a, int b)
    {
        double sum=a+b;
        return (sum);
    } 
    double add(int a,double b)
    {
        double sum=a+b;
        return(sum);
    }
    double add(double a,double b)
    {
        double sum=a+b;
        return(sum);
    }
    public static void main(String[] args) 
    {
        overloading obj=new overloading();
        int m=obj.add(5,10);
        double n=obj.add(5.5,10);
        double p=obj.add(5,10.5);
        double q=obj.add(5.5,10.5);
        System.out.println(m);
        System.out.println(n);
        System.out.println(p);
        System.out.println(q);
    }
}    


