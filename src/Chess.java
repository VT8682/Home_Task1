public class Chess {
    public static void main (String[] args){
        String result;
        int x1 = 1, y1=1, x2=2, y2=2;

        if (x1==x2 || y1==y2)
            result = "YES";
        else
            result = "NO";

        System.out.println(result);
    }
}