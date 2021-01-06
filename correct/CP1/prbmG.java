package correct.CP1;

import java.util.*;

public class prbmG {
    public static HashMap<Integer, node> sortByValue(HashMap<Integer, node> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer,node> > list =
                new LinkedList<Map.Entry<Integer,node> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer,node> >() {
            public int compare(Map.Entry<Integer,node> o1,
                               Map.Entry<Integer,node> o2)
            {
                if(o1.getValue().getQuestions() < o2.getValue().getQuestions())return 1;
                else if(o1.getValue().getQuestions() == o2.getValue().getQuestions()){
                    if(o1.getValue().getPenalty()>=o2.getValue().getPenalty())return 1;
                    else return  -1;
                }
                else return -1;
            }
        });

        // put data from sorted list to hashmap
        HashMap<Integer,node> temp = new LinkedHashMap<Integer,node>();
        for (Map.Entry<Integer, node> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    static class node{

        long questions;
        long penalty;
        public node(long questions,long penalty){
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
        int q = s.nextInt();
        HashMap<Integer,node> map = new HashMap<Integer, node>();
        Set<Integer> set = new HashSet<>();
//        TreeMap<Integer,node> sorted_map = new TreeMap<Integer,node>((Map<? extends Integer, ? extends node>) bvc);
//        int rank = 1;
        for (int i = 0; i <q; i++) {
            int key = s.nextInt();
            long penalty = s.nextLong();
            if(map.containsKey(key)){
                node a = map.get(key);
                a.setQuestions(a.getQuestions()+1);
                a.setPenalty(a.getPenalty()+penalty);
                map.put(key,a);
//                sorted_map.putAll(map);
//                System.out.println(sorted_map);
            }
            else {
                node a = new node(1,penalty);
                map.put(key,a);
            }
            Map<Integer, node> sorted_map = sortByValue(map);
//            for (Map.Entry<Integer, node> en : sorted_map.entrySet()) {
//
//                    System.out.println("Key = " + en.getKey() +
//                            ", Value = " + en.getValue().getQuestions() + "  " + en.getValue().getPenalty());
//            }
            if(!sorted_map.containsKey(1)) System.out.println(sorted_map.size()+1);
            else {
                long rank = 1;
                for (Map.Entry<Integer, node> en : sorted_map.entrySet()) {

                    if (en.getKey() == 1) {
                        System.out.println(rank);
                        break;
                    }
                    else rank++;
//                    System.out.println("Key = " + en.getKey() +
//                            ", Value = " + en.getValue().getQuestions() + "  " + en.getValue().getPenalty());
                }
            }
//            System.out.println();
        }
    }
}