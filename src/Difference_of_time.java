public class Difference_of_time {
    public static void main (String[] args) {
        int h1 = 1, m1 = 2, s1 = 30;
        int h2 = 1, m2 = 3, s2 = 20;

        int delta = (h2 - h1) * 3600 + (m2 - m1) * 60 + (s2 - s1);

        System.out.println(delta);
    }
}
