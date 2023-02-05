package collection_practice;

public class FindNonRepeatedChar {
    public static void main(String[] args) {
        findNonRepeatedCharInString("papaya");
    }

    static void findNonRepeatedCharInString(String givenValue){
        // {"Papaya"}
        /*String repeatedValue = "";
        char[] aa = givenValue.toCharArray();
        for(int i=0;i<givenValue.length();i++) {
             for(int j= i+1; j<aa.length; j++){
                if(givenValue.charAt(i) == aa[j]) {
                    repeatedValue += givenValue.charAt(i);
                    System.out.println("----------- print repeated char"+givenValue.charAt(i));
                  }
           }*/

        int index = -1;
        char fnc = ' ';
        for (char i : givenValue.toCharArray()) {  // papaya
            System.out.println("Index 1:"+givenValue.indexOf(i)+"::::"+"LastIndexOf:"+givenValue.lastIndexOf(i));
            if (givenValue.indexOf(i) == givenValue.lastIndexOf(i)) {
                fnc = i;
                break;
            }
            else {
                index += 1;
            }
        }
        if (index == 1) {
            System.out.println("Either all characters are repeating or "
                    + "string is empty");
        }
        else {
            System.out.println("First non-repeating character is " + fnc);
        }

        }
    }
