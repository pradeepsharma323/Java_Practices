package collection_practice;

public class StringCropTest {
    public static void main(String[] args) {

        System.out.println(cropString("Codility we test croppers",14));
    }

    public static String cropString(String message, int k){
        String croppedString=message.substring(0,k+1);
        System.out.println("CroppedString is:"+croppedString);
        System.out.println("CroppedlastIndex is:"+croppedString.lastIndexOf(" "));
        return croppedString.substring(0, croppedString.lastIndexOf(" ")).trim();
        /*String[] msgSplit = message.substring(0,k).split(" ");

        for(int i=0; i<k; i++){
            if(message.charAt(k) == ' '){
                message.substring(0,k);
               return message.trim();
            }
        }
        for(int j=0; j<msgSplit.length; j++){

        }
        if (message.length() < k) {
            return message;
        }
        else {

        }*/
       // return croppedString;
    }
}
