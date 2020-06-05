public class Snail {

    public static void main (String[] args) {

        int h = 10, a = 3, b = 2;

        int day = h/(a-b)-(h%(a-b))/(a-a%b);

        System.out.println(day);
    }
}
