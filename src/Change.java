import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Change {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Введите размер массива n =");
        String s = reader.readLine();
        n = Integer.parseInt(s);
        int[] list = new int[n+1];
        System.out.println("Введите "+n+ " элементов массива");
        for (int i = 0; i < list.length-1; i++)
        {
            String d = reader.readLine();
            list [i] = Integer.parseInt(d);
        }
        for (int i = 0; i < list.length-2; i=i+2){
            int x = list[i];
            list[i] = list[i+1];
            list[i+1] = x;


        }
        for (int i = 0; i < list.length-1; i++) {
            System.out.println(list[i]);
        }
    }
}

