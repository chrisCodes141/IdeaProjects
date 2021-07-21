public class main {
    public static void main(String[] args) {
        String[] Fruits = new String[1];

        Fruits[0] = "ap";
        /*Fruits[1] = "GRApe";
        Fruits[2] = "baNAna";
        Fruits[3] = "IFKNDIDIT";*/

        System.out.println("FInal : " + camelCase(Fruits));
    }

/*
    static String camelCase(String[] s) {

        if(s.length <= 1){
            return s[0].toLowerCase();
        }

        String stringConcat = "";

        int[] PositionsToCapitalize = new int[s.length - 1];

        for(int i = 0; i < s.length; i++){
            stringConcat += s[i];

            //only for first iteration
            if(i == 0) {
                PositionsToCapitalize[i] = s[i].length();
                continue;
            }
            if(i + 1 == s.length) break;
            PositionsToCapitalize[i] = s[i].length() + PositionsToCapitalize[i - 1];
        }

        stringConcat = stringConcat.toLowerCase();

        char[] arr = stringConcat.toCharArray();

        for(int i = 0; i < s.length - 1; i++){
            arr[PositionsToCapitalize[i]] = Character.toUpperCase(arr[PositionsToCapitalize[i]]);
        }

        return new String(arr);
    }
*/


    static String camelCase (String[] s){
        if(s.length == 1){
            StringBuilder sb = new StringBuilder();
            sb.append(s[0]);
            for(int i = 0; i < sb.length(); i++){
                char c = sb.charAt(i);
                sb.setCharAt(i, Character.toLowerCase(c));
            }
            return sb.toString();
        }

        StringBuilder sb = new StringBuilder();

        int numOfWordsToCapitalize = s.length;
        int[] PositionsToCapitalize = new int[numOfWordsToCapitalize - 1];

        int j = 0;


        for (int i = 0; i < numOfWordsToCapitalize; i++) {
            //appending each String
            sb.append(s[i]);
            //to avoid out of bound exception
            if(i == numOfWordsToCapitalize - 1) break;
            //first pass only to avoid out of bound
            if(i == 0){
                PositionsToCapitalize[j] = s[i].length();
                j++;
                continue;
                //System.out.println("continueing");
            }
            System.out.println("PositionsToCapitalize[j] = "+PositionsToCapitalize[j]);
            //add previous positions to each other
            PositionsToCapitalize[j] = s[i].length() + PositionsToCapitalize[j - 1];
            j++;
        }
        j = 0;
        //System.out.println("J[0] is " + PositionsToCapitalize[0]);
        //System.out.println("J[1] is " + PositionsToCapitalize[1]);

        for (int i = 0; i < sb.length(); i++) {
            //if the letter in sb matches letter to capitalize, capitalize it
            System.out.println("i = " + i + " , j = " + j);
            if(i == PositionsToCapitalize[j]){
                System.out.println("here i j numOfWOrds - 1  " + i + " " + j);

                char c = sb.charAt(i);
                sb.setCharAt(i, Character.toUpperCase(c));
                System.out.println("sb.Tostring : " + sb.toString());
                //to avoid out of bound exception
                System.out.println("J IS>>>> "+ j + "\n numOfWordsToCap>>>>" + numOfWordsToCapitalize);
                j++;
                if(j == numOfWordsToCapitalize - 1) j--;
            }
            else{
                System.out.println("Else here");
                char c = sb.charAt(i);
                sb.setCharAt(i, Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
}
