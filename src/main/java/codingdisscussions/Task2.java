package codingdisscussions;

public class Task2 {
    public static void main(String[] args) {
        String[] s= {"abc", "def", "ghi"};
        int len= s[0].length();
        for(int i=0; i<s.length; i++){
            char[] a= new char[3];
            for(int j=0; j<len; j++){
                if(i+j<len){
                    a[j]=s[j].charAt(i+j);
                }
                else a[j]=s[j].charAt((i+j)-3);
            }
            System.out.println(a);
        }
    }
}
