package collection_practice;

public class StringPrefix {
    public static void main(String[] args) {
        StringPrefix prefix = new StringPrefix();
        String a[] = {"flower","flow","flight"};
        System.out.println(prefix.longestCommonPrefix(a));
    }
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                System.out.println("index is:"+(strs[i].indexOf(prefix)));
                prefix=prefix.substring(0,prefix.length()-1);
                System.out.println("Print Prefix:"+prefix);
            }

        }
        return prefix;


    }
}
