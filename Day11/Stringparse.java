public class Stringparse {
    public static void main(String[] args) {
        // String s="$2000";
        // String s2=s.substring(1);
        // int n=Integer.parseInt(s2);
        // n=n+1;
        // String s1=Integer.toString(n);
        // System.out.println("$"+s1);

        String s="$2000";
        String s1=s.replace("$","");
        int n=Integer.parseInt(s1);
        n++;
        System.out.println("$"+n);

    }
}
