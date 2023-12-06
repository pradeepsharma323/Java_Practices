package collection_practice;

public class NumberOfSegmentString {
    public static void main(String[] args) {
        System.out.println("String has segments as:"+getStringSegments(", , , a, b,"));
        System.out.println("String has segments as:"+getSegemnt(", , , a, ,"));
    }
    static int getStringSegments(String s) {
        String trimmed=s.trim();
       // int segLength = 0;
        if(trimmed.isBlank()){
            return 0;
        } else {
        String[] seg= trimmed.split("\\\\s+");
            /*for(String s2 : seg){
                if(s2.isBlank()){
                    segLength = 0;
                }else {
                 return segLength = segLength+s2.length();
                }
            }*/
        return seg.length; }
    }

    static int getSegemnt(String s){
        String trimmed = s.trim();
        if (trimmed.equals("")) {
            return 0;
        }
        return trimmed.split("\\\\s+").length;
    }
    }
