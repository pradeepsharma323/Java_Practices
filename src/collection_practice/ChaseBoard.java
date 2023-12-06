package collection_practice;

public class ChaseBoard {
    public static void main(String[] args) {
        System.out.println("Running code:"+run("2b",3,2));
    }
    public static String run(String startPosition, int R, int C) {
        /*
         * Write your code below; return type and arguments should be according to the problem's requirements
         */
        String[] pos = startPosition.split("");

        // a = 97 - h= 104
        //A 65   Z-90
        int row = Integer.parseInt(pos[0]);

        // char c ='a';
        // System.out.println(Integer.parseInt(a));

        int col = (pos[1].charAt(0)) - 97 + 1;

        int newRow = -1;
        int newCol= -1;

        if(row < 8){
            newRow = (row+R)%8;
            if(newRow == 0){
                newRow = 8;
            }

            newCol = (col+C)%8;
            if(newCol == 0){
                newCol = 8;
            }
        }

        String newPos = newRow+""+(char)(96+newCol);
        System.out.println(newPos);

        // String endPosition = "";
        // return endPosition;
        return newPos;
    }
}
