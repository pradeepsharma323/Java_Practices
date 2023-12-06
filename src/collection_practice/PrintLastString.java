package collection_practice;

public class PrintLastString {
        static void printLast(String s, int t)
        {

            // Vector to store individual strings.
            // Save all strings in the vector.
            String[] v = s.split("\n");

            if (v.length == 0)
            {
                System.out.println("ERROR: string doesn't " +
                        "contain '\\n' character");
                return;
            }

            // If the string has t lines
            if (v.length >= t)
            {
                for (int i = v.length - t; i < v.length; i++)
                {
                    System.out.println(v[i]);
                }
            }
            else
            {
                for (int i = 0; i < v.length; i++)
                {
                    System.out.println(v[i]);
                }
            }
        }

        // Driver Code
        public static void main(String[] args)
        {
            String s1 = "str1\nstr2\nstr3\nstr4\nstr5\nstr6\nstr7" +
                    "\nstr8\nstr9\nstr10\nstr11\nstr12\nstr13" +
                    "\nstr14\nstr15\nstr16\nstr17\nstr18\nstr19" +
                    "\nstr20\nstr21\nstr22\nstr23\nstr24\nstr25";
            int n = 2;
            printLast(s1, n);
        }
}
