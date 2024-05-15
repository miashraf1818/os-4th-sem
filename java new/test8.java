class Bulla {
    int len, wid;

    Bulla(int x, int y) {
        len = x;
        wid = y;
    }

    void area() {
        int a = len * wid;
        System.out.println("Area: " + a);
    }
}

public class test8 {
    public static void main(String[] args) {
        Bulla r = new Bulla(12, 4);
        r.area();
    }
}
