public class Main {

    public static void main(String[] args) {
        System.out.println(ReverseString("1 Test 2 String 3"));
    }

    static public String ReverseString (String s){

        String Reverse = "";

        for(int i = s.length(); i > 0; i--){
            Reverse += s.charAt(i-1);
        }
        return Reverse;
    }
}


