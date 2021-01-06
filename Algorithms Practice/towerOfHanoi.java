package Algo_practice;

public class towerOfHanoi {
    static int count = 0;
    static void tower_Of_Hanoi(int n, char from_rod, char to_rod, char aux_rod)
    {
        if (n == 1)
        {
            count++;
            return;
        }
        tower_Of_Hanoi(n-1, from_rod, aux_rod, to_rod);
        count++;
        tower_Of_Hanoi(n-1, aux_rod, to_rod, from_rod);
    }

    public static void main(String[] args) {
        int n= 2;
        tower_Of_Hanoi(n,'A','B','C');
        System.out.println(count);
    }
}
