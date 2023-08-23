import java.io.*;

public class printf {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        String input2 = br.readLine();
        String input3 = br.readLine();

        System.out.println("================================");

        String[] split1 = input1.split(" ");
        String[] split2 = input2.split(" ");
        String[] split3 = input3.split(" ");
        int x = Integer.parseInt(split1[1]);
        int y = Integer.parseInt(split2[1]);
        int z = Integer.parseInt(split3[1]);
        
        System.out.printf("%-15s%03d", split1[0], x);
        System.out.printf("\n%-15s%03d", split2[0], y);
        System.out.printf("\n%-15s%03d\n", split3[0], z);

        System.out.println("================================");
    }
}
