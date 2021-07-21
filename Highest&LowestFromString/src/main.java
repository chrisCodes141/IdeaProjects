public class main {

    public static void main(String[] args) {
        "stuff".equals("stuff");
        System.out.println(highAndLow("1 3 4 5 23 42 100"));
    }
    public static String highAndLow(String numbers) {
        final StringBuilder sb = new StringBuilder(numbers);
        System.out.println(sb.length());
        int min = 2147483647, max = -2147483648;

        for(int i = 0; i < sb.length(); i++){

            if(min < sb.charAt(i)){min = sb.charAt(i);}
            System.out.println(min + " <- ->" +max);
            if(max > sb.charAt(i)){max = sb.charAt(i);}
        }
        String s = max + " " + min;
        return s;
    }
}
