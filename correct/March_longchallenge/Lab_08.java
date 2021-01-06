package correct.March_longchallenge;
//                        #CORRECT
import java.util.*;
import static java.util.Arrays.sort;

public class Lab_08 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int i = 0; i < T; i++) {
            int n = s.nextInt();
            if (n == 0) {
                System.out.println(0);
                continue;
            }
            int[] array = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = s.nextInt();
            }
            create_team(array);

        }
    }

    private static void create_team(int[] array) {
        sort(array);
        solve(array);
    }

    private static void solve(int[] array)throws NullPointerException {
        try {
            HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();

            for (int j = 0; j < array.length; j++) {
                create_newteams(map, array, j);

            }
            print(map);
        }
        catch (Exception e){
            return;
        }
    }

    private static void create_newteams(HashMap<Integer, PriorityQueue<Integer>> map, int[] array, int j) {
        int possible_value;
        PriorityQueue<Integer> teams = map.get(array[j] - 1);
        if (teams == null) {
            possible_value = 1;
        } else {
            possible_value = teams.peek() + 1;
            teams.remove();
            if (teams.size() == 0) {
                map.remove(array[j] - 1);
            }
        }
        PriorityQueue<Integer> newTeams = map.get(array[j]);
        create_other_team(newTeams,map, possible_value, array, j);

    }
    private static void create_other_team(PriorityQueue<Integer> newTeams,HashMap<Integer, PriorityQueue<Integer>> map , int possible_value, int[]array, int j ){
        if (newTeams == null) {
            newTeams = new PriorityQueue<>();
            map.put(array[j], newTeams);
        }
        newTeams.add(possible_value);
    }
    private static void print(HashMap<Integer, PriorityQueue<Integer>> map) {
        int min = 10000000;
        for (int skill : map.keySet()) {
            min = Math.min(min, map.get(skill).remove());
        }
        System.out.println(min);
    }


}

