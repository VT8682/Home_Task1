public class Three {
    public static void main (String[] args){
        int match;
        int num1 = 2, num2 = 2, num3 = 2;

        if (num1==num2 && num1==num3)
            match = 3;
        else if ((num1==num2 && num1!=num3) || (num2==num3 && num1!=num3) || (num1==num3 && num1!=num2))
            match = 2;
        else
            match = 0;

        System.out.println(match);
    }
}