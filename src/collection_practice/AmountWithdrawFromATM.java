package collection_practice;

public class AmountWithdrawFromATM {

    public static void main(String[] args) {
        int [] givenNote = {2000,500,100};
        countNotes(5000, givenNote);
    }
     // output 2000--2 , 500 -1, 100-1
    public static void countNotes(int amount, int [] givenNote) {
        int count=0;
        for (int i=0; i<givenNote.length; i++) {
            count= amount/givenNote[i];
            if(count !=0){
                System.out.println(givenNote[i]+"\tx\t"+count);
            }
            amount = amount%givenNote[i];
        }
        //System.out.println("Print notesCount:"+notes);
    }
}
