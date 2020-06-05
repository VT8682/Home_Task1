public class Auto_traffic {

    public static void main (String[] args) {

        int n = 700, m = 2000;

        int day = m/n + (m%n)*10/(m%n*10 - 1);

        System.out.println(day);
    }
}
