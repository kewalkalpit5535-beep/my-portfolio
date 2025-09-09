
public class Kalpit {

    public static void main(String[] args) {
        int a = 20;
        int b = 2;
        int c = a + b;
        System.out.println(c);
        if (a == 0) {
            System.out.println("in the if");
            c = c + a;
            System.out.println(c);
        } else {
            System.out.println("else");
        }
    }
}
