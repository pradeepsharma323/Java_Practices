package collection_practice;

public class RemovedSpecialChar {
    public static void main(String[] args) {
        String str= "Mahadev@!#$";
        System.out.println("Removed Special Char:"+removedSpecialChar(str));
        //System.out.println("print string after removed special char:"+str.replaceAll("[^a-z A-Z]",""));
    }

    public static String  removedSpecialChar(String s){
        String removedChar ="";
        int count =0;
        for (int i=0; i<s.length();i++){
            if(!Character.isDigit(s.charAt(i)) && !Character.isAlphabetic(s.charAt(i)) && !Character.isLetter(s.charAt(i))){
               // removedChar = removedChar+s.charAt(i);
                count++;
            }
            else {
                removedChar = removedChar+s.charAt(i);
                //System.out.println("Special Char Removed :"+removedChar);*/
            }
        }
        System.out.println("Total special char is:"+count);
        return removedChar;
    }
}
