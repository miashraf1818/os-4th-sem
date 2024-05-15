class room
{
    int len,wid;
    static int ht=12;
    room(int x, int y)
    {
        len=x;
        wid=y;
    }
    int roomarea()
    {
        return(len*wid*ht);
    }
}

public class area 
{
    public static void main (String[] args)
    {
        int a;
        room r=new room(10,12);
        a=r.roomarea();
        System.out.println("area of room is "+a);
    }
}
