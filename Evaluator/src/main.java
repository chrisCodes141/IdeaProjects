public class main {
    /*
    **************NOT FINISHED AND BALONEEEEEEEEEEEE******************
    * ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
     */
    public static void main(String[] args) {
        // a + b * c - d / e
        //2 + 5 x 7 - 9 / 3 = 34
        //infix vs postfix


        computeExpression("*");
    }

    //function for returning answer (keeps track of results between parenthsy b4 ultimate sum)




    //function for computing
    public static int computeExpression(String expression){
        int expL = expression.length();
        int x = 0;
        char C;
        //char m = *, d = /;
        System.out.println("made it here"+0x002A);

        while(expL != 0){
            for(int i = 0; i < expression.length(); i++){
                C = expression.charAt(i);

                if((expression.charAt(i)) == 0xFE61){
                    System.out.println("Did i do it?**************");
                }
                /*if((expression.charAt(i)).equals(*)){ // cant use cuz not object

                }
                if((expression.charAt(i)).compareTo("*")){ // cant use cuz not string

                }*/


            }

        }

        return x;
    }




    public static int multiply(int a, int b){
        return a*b;
    }
    public static int divide(int a, int b){
        return a/b;
    }
    public static int subtract(int a, int b){
        return a-b;
    }
    public static int add(int a, int b){
        return a+b;
    }
}
