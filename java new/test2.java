 class react
{
    int len,wid;
    react(int x, int y)
    {
        len=x;
        wid=y;
    }
    int reactarea()
    {
        return len*wid;
    }
}

public class test2
{
    public static void main(String[] args) 
    {
     react r=new react(15,10);
     int area = r.reactarea();
     System.out.println("Area of reactangle is:"+area);
    }
}