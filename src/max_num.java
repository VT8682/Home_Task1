import java.io.BufferedReader;
import java.io.InputStreamReader;


public class max_num {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n, counter = 0;
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
        for (int i = 0; i < list.length-1; i++){
            if (list[i]<list[i+1])
                counter = counter + 1;
        }
        System.out.println(counter);
    }
}