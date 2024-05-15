class A
{
    int x;
    A(int m)
    {
        x=m;

    }
    void display()
    {
        System.out.println("from class b");
    }
}

class B extends A
{
    int y;
    B(int m,int n)
    {
        super(m);
        y=n;
    }
    void display()
    {
        System.out.println("from class b");
    }
}

public class overriding
{
    public static void main(String[] args)
    {
        B b=new B(10,20);
        b.display();
        System.out.println(b.x);
        System.out.println(b.y);
    }
}
