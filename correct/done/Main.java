package correct.done;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    //Input declaration
    static int[] directM = new int[50];
    static int[] associativeM = new int[50];
    static int[] setM = new int[50];
    static int[] mainM = new int[50];
    static int[] fetchOrder = new int[50];

    static double timeToread_fromCache;
    static double timeToread_fromMemory;
    static double timeTocompare;

    static int number_of_lines;
    static int number_of_set;
    static int number_of_linein_sets;
    static int fetch_memory;

    // Output declaration
    static double TTDM;
    static double TTAM;
    static double TTSM;

    static double time_For_DM, time_for_AM, time_for_SM;
    static int hitDM, hitAM, hitSM;
    static int missDM, missAM, missSM;

    public static void Initialize(){
        int i;
        // Variable initialized to zero
        time_For_DM = 0; time_for_AM = 0; time_for_SM = 0;
        hitDM =0; hitAM = 0; hitSM = 0;
        missDM = 0; missAM = 0; missSM = 0;

        // Array initialized to zero
        for( i = 0; i < 50; i++)
        {
            directM[i] = 0; associativeM[i] = 0; setM[i] = 0;
        }
        for( i = 0; i < 100; i++)
        {
            mainM[i] = 0;
        }

    }

    // Filling values into main memory
    public static void FillMainMemory(){
        int n;
        System.out.println("\n\n\n\n\n\n\t\t\tMemory is Restricted from 0 to 99 Blocks Only\n");
        System.out.println("\n\nPass input in the given format { Block No. Data(in Numbers only)}\n");
        System.out.println("\n\nNo. of Blocks to be Added: ");
        n = s.nextInt();
        for (int j = 0; j <n ; j++) {
            int val = s.nextInt();
            int data = s.nextInt();
            mainM[val] = data;
        }
        System.out.println("\n\n\n\t\t\tMain Memory Visualization");
        System.out.println("\n\nBlock No.    Data\n");
        for (int i = 0; i <100 ; i++) {
            if (mainM[i]!=0){
                System.out.println(" " + i + "  "+mainM[i]);
                System.out.println();
            }
        }
    }
//    Print Table of Memory  visualization
    public static void PrintTable(){
        System.out.println("\n\n\t\t\tTable\n");
        System.out.println("Line no.      Direct      Associative          Set\n");
        for (int i = 0; i <number_of_lines ; i++) {
            System.out.println(" " + i + "\t\t" + directM[i]+"\t\t" + associativeM[i] +"\t\t" + setM[i]);
        }
    }
    // calculating direct memory
    public static void DirectM( int number){
        if (directM[number%number_of_lines] == mainM[number]){
            System.out.println("Time taken for the Operation in Direct Mapping = "+ timeToread_fromCache);
            TTDM = TTDM + timeToread_fromCache;
            hitDM++;
        }
        else {
            directM[number%number_of_lines] = mainM[number];
            System.out.println("Time taken for the Operation in Direct Mapping = "+timeToread_fromMemory+timeToread_fromCache);
            TTDM+= timeToread_fromCache+timeToread_fromMemory;
            missDM++;
        }
    }
    // Calculating Associative memory
    public static void AssociativeM( int number){
        int i;
        for ( i = 0; i <number_of_lines ; i++) {
            if (associativeM[i] == mainM[number]){
                System.out.println("\nTime taken for the Operation in Associative Mapping = "+((i+1)*timeTocompare + timeToread_fromCache));
                TTAM+= (i+1)*timeTocompare + timeToread_fromCache;
                hitAM++;
                break;
            }
        }
        if (i== number_of_lines){
            int j;
            for ( j = 0; j < number_of_lines; j++) {
                if (associativeM[j] == 0){
                    associativeM[j] = mainM[number];
                    break;
                }
            }
            if (j == number_of_lines){
                associativeM[0] = mainM[number];
            }
            System.out.println("\nTime taken for the Operation in Associative Mapping = "+(i)*timeTocompare + timeToread_fromCache+ timeToread_fromMemory);
            TTAM+=(i+j)*timeTocompare + timeToread_fromMemory+timeToread_fromCache;
            missAM++;
        }
    }
    //calculating set associative memory
    public static void SetM(int number){
        int set,i;
        set = number%number_of_set;
        for (i = set*number_of_linein_sets;i<(set+1)*number_of_linein_sets;i++){
            if (setM[i] == mainM[number]){
                System.out.println("\nTime taken for the Operation in Set Associative Mapping = "+ ((i-(set*number_of_linein_sets))*timeTocompare) + timeToread_fromCache);
                TTSM+= ((i-(set*number_of_linein_sets))*timeTocompare) + timeToread_fromCache ;
                hitSM++;
                break;
            }
        }
        if (i == (set+1) * number_of_linein_sets){
            int j;
            for ( j = set*number_of_linein_sets; j <(set + 1)*number_of_linein_sets ; j++) {
                if (setM[j] == 0){
                    setM[j] = mainM[number];
                    break;
                }
            }
            if (j == (set+1)*number_of_linein_sets){
                setM[set*number_of_linein_sets] = mainM[number];
            }
            System.out.println("\nTime taken for the Operation in Set Associative Mapping = "+ ((i-(set*number_of_linein_sets))*timeTocompare) + timeToread_fromCache + timeToread_fromMemory);
            TTSM+=  ((i + j -(set*number_of_linein_sets))*timeTocompare) + timeToread_fromCache + timeToread_fromMemory;
            missSM++;
        }
    }

    public static void main(String[] args) {
        //Taking input from cache
//        Scanner s = new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n\t\t\tWelcome to Cache Memory Mapping Simulator\n");
        System.out.println("\n\nEnter  no. of lines in the Cache Memory: ");
        number_of_lines = s.nextInt();
        System.out.println("\n\nEnter Time Required to Read data from Main Memory: ");
        timeToread_fromMemory = s.nextInt();
        System.out.println("\n\nEnter Time Required to Compare data in Cache: ");
        timeTocompare = s.nextInt();
        System.out.println("\n\nEnter no. of Sets in Set Associative Mapping: ");
        int number_of_set = s.nextInt();
        number_of_linein_sets = number_of_lines/number_of_set;

        Initialize();

        FillMainMemory();

        System.out.println("\n\nEnter no. of Memory calls to be made: ");
        fetch_memory = s.nextInt();
        System.out.println("\n\nEnter Memory read Calls in Order by specifying Block number:\n");
        for (int i = 0; i <fetch_memory ; i++) {
            fetchOrder[i] = s.nextInt();
        }
        for (int i = 0; i <fetch_memory ; i++) {
            int number = fetchOrder[i];
            System.out.println("\n\n\n\nAfter "+ number + " --> " + mainM[number] + "\n");
            DirectM(number);
            AssociativeM(number);
            SetM(number);
            PrintTable();
        }

        // Print final comparison table
        System.out.println("\n\n\t\t\tComparison \n\n\tDirect     Associative     Set Associative\n");
        System.out.println("Time\t  "+ TTDM+"\t\t"+TTAM+"\t\t"+TTSM+"\n");
        System.out.println("Hit\t  "+hitDM+"\t\t"+hitAM+"\t\t"+hitSM+"\n");
        System.out.println("miss\t  "+missDM+"\t\t"+missAM+"\t\t"+missSM+"\n");
    }
}
