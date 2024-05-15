class House1 {
    int len, wid;
    
    House1(int x, int y) {
        len = x;
        wid = y;
    }
    
    int area() {
        return len * wid;
    }
}

class House2 extends House1 {
    int ht;
    
    House2(int x, int y, int z) {
        super(x, y);
        ht = z;
    }
    
    int volume() {
        return len * wid * ht;
    }
}

public class House 
{
    public static void main(String[] args) {
        House2 r = new House2(10, 14, 12);
        int a = r.area();
        int v = r.volume();
        System.out.println("Area of house is " + a);
        System.out.println("Volume of house is " + v);
    }
}
