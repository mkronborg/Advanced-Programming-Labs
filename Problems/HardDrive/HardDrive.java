import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class HardDrive {
    public static void main(String [] args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String l = null;
        String [] ls = null;
        int size = 0;
        int changes = 0;
        int broken = 0;
        int [] bits = null;
        try {
            l = br.readLine();
            ls = l.split(" ");
            size = Integer.parseInt(ls[0]);
            changes = Integer.parseInt(ls[1]);
            broken = Integer.parseInt(ls[2]);

            l = br.readLine();
            ls = l.split(" ");

            bits = new int[broken];

            for (int i = 0; i < broken; i++)
            {
                bits[i] = Integer.parseInt(ls[i]);
            }
        }
        catch (IOException e)
        {
            System.exit(0);
        }

        int [] hd = new int [size];

        int length = bits.length;
        for(int i = 0; i < length; i++)
        {
            hd[bits[i]-1] = -1;
        }

        //printArr(hd);
        int start = 1;
        if (changes % 2 != 0)
        {
            hd[0] = 1;
            changes--;
            start++;
        }
        for (int i = start; changes > 0; i++)
        {
            if (hd[i] == -1)
                continue;
            hd[i++] = 1;
            changes -= 2;
        }

        for(int i = 0; i < length; i++)
        {
            hd[bits[i]-1] = 0;
        }
        printArr(hd);
    }

    public static void printArr(int [] arr)
    {
        int l = arr.length;
        StringBuffer s = new StringBuffer(l);

        for (int i = 0; i < l; i++)
            s.append(arr[i]);
        System.out.println(s);
    }
}
