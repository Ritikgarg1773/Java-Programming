package correct.CP1;
//                        #CORRECT
import java.util.*;

public class prbmB {
    static class Node{

        long questions = 0;
        long penalty = 0;
        public Node(long questions,long penalty){
            this.questions = questions;
            this.penalty = penalty;
        }

        public long getQuestions() {
            return questions;
        }

        public void setQuestions(long questions) {
            this.questions = questions;
        }

        public long getPenalty() {
            return penalty;
        }

        public void setPenalty(long penalty) {
            this.penalty = penalty;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        s.nextLine();
        HashMap<String,Node> array = new HashMap<>();

        for(int i =0;i<k;i++){
            String t = s.nextLine();
//            System.out.println(t);
            String[] arr = t.split(" ");
//            System.out.println(Arrays.toString(arr));
            if(array.containsKey(arr[0])){
                Node node = new Node(array.get(arr[0]).getQuestions()+1,array.get(arr[0]).getPenalty()+Long.parseLong(arr[1]));
                array.put(arr[0],node);
            }
            else {
                Node node = new Node(1, Long.parseLong(arr[1]));
                array.put(arr[0] ,node);
            }
        }

        int rank = 1;
//        System.out.println(array );
        if(array.containsKey("BhayanakMaut")) {
            long r_questions = array.get("BhayanakMaut").getQuestions();
            long r_penalty = array.get("BhayanakMaut").getPenalty();

            for (Node i : array.values()) {
//            System.out.println( i.getPenalty() +" " + i.getQuestions());
//            System.out.println(r_penalty +" "+r_questions);
                if (r_questions < i.getQuestions()) rank++;
                else if (r_questions == i.getQuestions()) {
                    if (r_penalty <= i.getPenalty()) continue;
                    else rank++;
                }
            }
            System.out.println(rank);
        }
        else System.out.println(array.size()+1);
    }
}
