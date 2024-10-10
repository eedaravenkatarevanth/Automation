package strings;

import java.util.Scanner;

public class StringBUilderAndBuffer {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("revanth");
        StringBuilder sbuild= new StringBuilder("Kosuru");
        sb.append(" eedara");
        sbuild.append(" Somendra");

        sb.insert(4," hello");
        sb.deleteCharAt(4);

        StringBuilder [] sbu= new StringBuilder[3];

        Scanner sc = new Scanner(System.in);
        System.out.println(sb.reverse());

        System.out.println(sb.substring(3));

        System.out.println(sb.deleteCharAt(3));

        for(int i=0;i<sbu.length;i++){
            System.out.println("Enter the data for the index "+ i + " ");
            String input= sc.nextLine();
            sbu[i]= new StringBuilder(input);
        }
        System.out.println(sbu);

        System.out.println(sb);
        System.out.println(sbuild);
    }
}
