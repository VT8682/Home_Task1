public class Lesson_time {
    public static void main (String[] args){

        int n= 8;
        int time = n*45 + (n/2)*5+((n-1)/2)*15;

        int min = time%60;
        int h = (time-time%60)/60 + 9;

        System.out.println(h+" "+min);
    }
}
