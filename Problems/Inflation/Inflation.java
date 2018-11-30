import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Inflation {
    public static void main(String [] args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String l = null;
        String [] ls = null;
        int n = 0;
        ArrayList<Integer> canisters = new ArrayList<Integer>();
        try {
            l = br.readLine();
            ls = l.split(" ");
            n = Integer.parseInt(ls[0]);
            l = br.readLine();
            ls = l.split(" ");
            for (int i = 0; i < n; i++)
            {
                canisters.add(Integer.parseInt(ls[i]));
            }
        }
        catch (IOException e)
        {
            System.exit(0);
        }
        Collections.sort(canisters);

        double min = 1.0;

        for (int i = 0; i < n; i++) {
            if (canisters.get(i) > (i+1))
            {
                System.out.println("Impossible");
                return;
            }
            double fraction = canisters.get(i) / (i + 1.0);
            if (fraction < min)
                min = fraction;
        }
        System.out.println(min);
    }

    public static void printArr(ArrayList<Integer> arr)
    {
        int l = arr.size();
        for (int i = 0; i < l; i++)
            System.out.print(arr.get(i) + ", ");
    }
}
