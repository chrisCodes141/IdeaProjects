public class main {
    public static void main(String[] args) {
        // To use, open cmd in main.java location,
        // >javac main.java
        // >java main thisISargs{0} ThisISargs[1] andSoForth[2]

        //NOTE: You need to call java main(line5) everytime you want to pass arguments

        //print while arguemnts left
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }
}
