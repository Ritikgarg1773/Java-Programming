package correct.March_longchallenge.miscelleaneous;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab06 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String t = s.nextLine();
            optimised(new StringBuilder(),t , 0);
            System.out.println(arrayList.size());

        }
        static ArrayList<String> arrayList = new ArrayList<>();
        public static void optimised(StringBuilder processed, String unprocessed, int index){
            if (index == unprocessed.length()){
            System.out.println(processed);
            arrayList.add(processed.toString());
                return;
            }

            char ch = (char)(unprocessed.charAt(index) - '0' - 1 + 'a');
//            System.out.println(ch);
            if (ch>='a' && ch<='z') {
                processed.append(ch);
                optimised(processed, unprocessed, index + 1);
                processed.deleteCharAt(processed.length() - 1);


                if (index < unprocessed.length() - 1) {
                    ch = (char) ((unprocessed.charAt(index) - '0') * 10 + (unprocessed.charAt(index + 1) - '0' - 1 + 'a'));
                    if (ch >= 'a' && ch <= 'z') {
                        processed.append(ch);
                        optimised(processed, unprocessed, index + 2);
                        processed.deleteCharAt(processed.length() - 1);
                    }
                }
            }
        }
}
