public class Ejercicio1 {
    public static void main(String[] args) {

        int a=6, b=2, c=3;

        //a. (A * C) % C = 0
        //b. A * B / C = 4
        //c. C % B + C * B = 7
        //d. A % ( A * B * C / (B + C) ) = 6
        //e. B * B + C – B * (A % B ) = 7

        System.out.println((a*c)%c);
        System.out.println(a*b/c);
        System.out.println((c%b)+(c*b));
        System.out.println(a%(a*b*c/(b+c)));
        System.out.println(b*b+c-b*(a%b));
    }
}
