package correct.JulyLongChallenge;

import java.io.IOException;
import java.util.Scanner;

public class ADAKING1 {
    public static void main(String[] args)throws IOException {
        try{
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            char[][] array = new char[8][8];
            for (int i = 0; i <T ; i++) {
                int K = s.nextInt();
                for (int j = 0; j < 8; j++) {
                    for (int k = 0; k <8 ; k++) {
                        array[j][k] = '.';
                    }
                }
                array[0][7] = 'O';
                if(K==1){
                    array[0][6] = 'X';
                    array[1][7] = 'X';
                    array[1][6] = 'X';
                }
                else if(K==2){
                    array[0][5] = 'X';
                    array[1][7] = 'X';
                    array[1][6] = 'X';
                    array[1][5] = 'X';
                }
                else if(K==3){
                    array[0][4] = 'X';
                    array[1][7] = 'X';
                    array[1][6] = 'X';
                    array[1][5] = 'X';
                    array[1][4] = 'X';
                }
                else if(K==4){
                    array[0][3] = 'X';
                    array[1][7] = 'X';
                    array[1][6] = 'X';
                    array[1][5] = 'X';
                    array[1][4] = 'X';
                    array[1][3] = 'X';
                }
                else if(K==5){
                    array[0][2] = 'X';
                    array[1][7] = 'X';
                    array[1][6] = 'X';
                    array[1][5] = 'X';
                    array[1][4] = 'X';
                    array[1][3] = 'X';
                    array[1][2] = 'X';
                }
                else if(K==6){
                    array[0][1] = 'X';
                    array[1][7] = 'X';
                    array[1][6] = 'X';
                    array[1][5] = 'X';
                    array[1][4] = 'X';
                    array[1][3] = 'X';
                    array[1][2] = 'X';
                    array[1][1] = 'X';
                }
                else if(K==7){
                    array[0][0] = 'X';
                    array[1][0] = 'X';
                    array[1][1] = 'X';
                    array[1][2] = 'X';
                    array[1][3] = 'X';
                    array[1][4] = 'X';
                    array[1][5] = 'X';
                    array[1][6] = 'X';
                    array[1][7] = 'X';
                }
                else if(K==8){
                    array[1][0] = 'X';
                    array[1][1] = 'X';
                    array[1][2] = 'X';
                    array[1][3] = 'X';
                    array[1][4] = 'X';
                    array[1][5] = 'X';
                    array[1][6] = 'X';
                    array[1][7] = 'X';
                }
                else if(K==9){
                    array[1][1] = 'X';
                    array[1][2] = 'X';
                    array[1][3] = 'X';
                    array[1][4] = 'X';
                    array[1][5] = 'X';
                    array[1][6] = 'X';
                    array[1][0] = 'X';
                    array[2][7] = 'X';
                    array[2][6] = 'X';
                }
                else if(K==10){
                    array[1][0] = 'X';
                    array[1][2] = 'X';
                    array[1][3] = 'X';
                    array[1][4] = 'X';
                    array[1][5] = 'X';
                    array[1][1] = 'X';
                    array[2][7] = 'X';
                    array[2][6] = 'X';
                    array[2][5] = 'X';
                }
                else if(K==11){
                    array[1][3] = 'X';
                    array[1][4] = 'X';
                    array[1][5] = 'X';
                    array[1][6] = 'X';
                    array[1][7] = 'X';
                    array[2][6] = 'X';
                    array[2][5] = 'X';
                    array[2][4] = 'X';
                    array[2][3] = 'X';
                }
                else if(K==12){
                    array[1][4] = 'X';
                    array[1][5] = 'X';
                    array[1][6] = 'X';
                    array[1][7] = 'X';
                    array[2][0] = 'X';
                    array[2][1] = 'X';
                    array[2][2] = 'X';
                    array[2][3] = 'X';
                    array[2][4] = 'X';
                }
                else if(K==13){
                    array[1][5] = 'X';
                    array[1][6] = 'X';
                    array[1][7] = 'X';
                    array[2][0] = 'X';
                    array[2][1] = 'X';
                    array[2][2] = 'X';
                    array[2][3] = 'X';
                    array[2][4] = 'X';
                    array[2][5] = 'X';
                }
                else if(K==14){
                    array[1][6] = 'X';
                    array[1][7] = 'X';
                    array[2][0] = 'X';
                    array[2][1] = 'X';
                    array[2][2] = 'X';
                    array[2][3] = 'X';
                    array[2][4] = 'X';
                    array[2][5] = 'X';
                    array[2][6] = 'X';
                }
                else if(K==15){
                    array[1][7] = 'X';
                    array[2][0] = 'X';
                    array[2][1] = 'X';
                    array[2][2] = 'X';
                    array[2][3] = 'X';
                    array[2][4] = 'X';
                    array[2][5] = 'X';
                    array[2][6] = 'X';
                    array[2][7] = 'X';
                }
                else if(K==16){
                    array[2][0] = 'X';
                    array[2][1] = 'X';
                    array[2][2] = 'X';
                    array[2][3] = 'X';
                    array[2][4] = 'X';
                    array[2][5] = 'X';
                    array[2][6] = 'X';
                    array[2][7] = 'X';
                }
                else if(K==17){
                    array[3][0] = 'X';
                    array[3][1] = 'X';
                    array[2][1] = 'X';
                    array[2][2] = 'X';
                    array[2][3] = 'X';
                    array[2][4] = 'X';
                    array[2][5] = 'X';
                    array[2][6] = 'X';
                    array[2][7] = 'X';
                }
                else if(K==18){
                    array[3][0] = 'X';
                    array[3][1] = 'X';
                    array[3][2] = 'X';
                    array[2][2] = 'X';
                    array[2][3] = 'X';
                    array[2][4] = 'X';
                    array[2][5] = 'X';
                    array[2][6] = 'X';
                    array[2][7] = 'X';
                }
                else if(K==19){
                    array[3][0] = 'X';
                    array[3][1] = 'X';
                    array[3][2] = 'X';
                    array[3][3] = 'X';
                    array[2][3] = 'X';
                    array[2][4] = 'X';
                    array[2][5] = 'X';
                    array[2][6] = 'X';
                    array[2][7] = 'X';
                }
                else if(K==20){
                    array[3][0] = 'X';
                    array[3][1] = 'X';
                    array[3][2] = 'X';
                    array[3][3] = 'X';
                    array[3][4] = 'X';
                    array[2][4] = 'X';
                    array[2][5] = 'X';
                    array[2][6] = 'X';
                    array[2][7] = 'X';
                }
                else if(K==21){
                    array[3][0] = 'X';
                    array[3][1] = 'X';
                    array[3][2] = 'X';
                    array[3][3] = 'X';
                    array[3][4] = 'X';
                    array[3][5] = 'X';
                    array[2][5] = 'X';
                    array[2][6] = 'X';
                    array[2][7] = 'X';
                }
                else if(K==22){
                    array[3][0] = 'X';
                    array[3][1] = 'X';
                    array[3][2] = 'X';
                    array[3][3] = 'X';
                    array[3][4] = 'X';
                    array[3][5] = 'X';
                    array[3][6] = 'X';
                    array[2][6] = 'X';
                    array[2][7] = 'X';
                }
                else if(K==23){
                    array[3][0] = 'X';
                    array[3][1] = 'X';
                    array[3][2] = 'X';
                    array[3][3] = 'X';
                    array[3][4] = 'X';
                    array[3][5] = 'X';
                    array[3][6] = 'X';
                    array[3][7] = 'X';
                    array[2][7] = 'X';
                }
                else if(K==24){
                    array[3][0] = 'X';
                    array[3][1] = 'X';
                    array[3][2] = 'X';
                    array[3][3] = 'X';
                    array[3][4] = 'X';
                    array[3][5] = 'X';
                    array[3][6] = 'X';
                    array[3][7] = 'X';
                }
                else if(K==25){
                    array[4][0] = 'X';
                    array[4][1] = 'X';
                    array[3][1] = 'X';
                    array[3][2] = 'X';
                    array[3][3] = 'X';
                    array[3][4] = 'X';
                    array[3][5] = 'X';
                    array[3][6] = 'X';
                    array[3][7] = 'X';
                }
                else if(K==26){
                    array[4][0] = 'X';
                    array[4][1] = 'X';
                    array[4][2] = 'X';
                    array[3][2] = 'X';
                    array[3][3] = 'X';
                    array[3][4] = 'X';
                    array[3][5] = 'X';
                    array[3][6] = 'X';
                    array[3][7] = 'X';
                }
                else if(K==27){
                    array[4][0] = 'X';
                    array[4][1] = 'X';
                    array[4][2] = 'X';
                    array[4][3] = 'X';
                    array[3][3] = 'X';
                    array[3][4] = 'X';
                    array[3][5] = 'X';
                    array[3][6] = 'X';
                    array[3][7] = 'X';
                }
                else if(K==28){
                    array[4][0] = 'X';
                    array[4][1] = 'X';
                    array[4][2] = 'X';
                    array[4][3] = 'X';
                    array[4][4] = 'X';
                    array[3][4] = 'X';
                    array[3][5] = 'X';
                    array[3][6] = 'X';
                    array[3][7] = 'X';
                }
                else if(K==29){
                    array[4][0] = 'X';
                    array[4][1] = 'X';
                    array[4][2] = 'X';
                    array[4][3] = 'X';
                    array[4][4] = 'X';
                    array[4][5] = 'X';
                    array[3][5] = 'X';
                    array[3][6] = 'X';
                    array[3][7] = 'X';
                }
                else if(K==30){
                    array[4][0] = 'X';
                    array[4][1] = 'X';
                    array[4][2] = 'X';
                    array[4][3] = 'X';
                    array[4][4] = 'X';
                    array[4][5] = 'X';
                    array[4][6] = 'X';
                    array[3][6] = 'X';
                    array[3][7] = 'X';
                }
                else if(K==31){
                    array[4][0] = 'X';
                    array[4][1] = 'X';
                    array[4][2] = 'X';
                    array[4][3] = 'X';
                    array[4][4] = 'X';
                    array[4][5] = 'X';
                    array[4][6] = 'X';
                    array[4][7] = 'X';
                    array[3][7] = 'X';
                }
                else if(K==32){
                    array[4][0] = 'X';
                    array[4][1] = 'X';
                    array[4][2] = 'X';
                    array[4][3] = 'X';
                    array[4][4] = 'X';
                    array[4][5] = 'X';
                    array[4][6] = 'X';
                    array[4][7] = 'X';
                }
                else if(K==33){
                    array[5][0] = 'X';
                    array[5][1] = 'X';
                    array[4][1] = 'X';
                    array[4][2] = 'X';
                    array[4][3] = 'X';
                    array[4][4] = 'X';
                    array[4][5] = 'X';
                    array[4][6] = 'X';
                    array[4][7] = 'X';
                }
                else if(K==34){
                    array[5][0] = 'X';
                    array[5][1] = 'X';
                    array[5][2] = 'X';
                    array[4][2] = 'X';
                    array[4][3] = 'X';
                    array[4][4] = 'X';
                    array[4][5] = 'X';
                    array[4][6] = 'X';
                    array[4][7] = 'X';
                }
                else if(K==35){
                    array[5][0] = 'X';
                    array[5][1] = 'X';
                    array[5][2] = 'X';
                    array[5][3] = 'X';
                    array[4][3] = 'X';
                    array[4][4] = 'X';
                    array[4][5] = 'X';
                    array[4][6] = 'X';
                    array[4][7] = 'X';
                }
                else if(K==36){
                    array[5][0] = 'X';
                    array[5][1] = 'X';
                    array[5][2] = 'X';
                    array[5][3] = 'X';
                    array[5][4] = 'X';
                    array[4][4] = 'X';
                    array[4][5] = 'X';
                    array[4][6] = 'X';
                    array[4][7] = 'X';
                }
                else if(K==37){
                    array[5][0] = 'X';
                    array[5][1] = 'X';
                    array[5][2] = 'X';
                    array[5][3] = 'X';
                    array[5][4] = 'X';
                    array[5][5] = 'X';
                    array[4][5] = 'X';
                    array[4][6] = 'X';
                    array[4][7] = 'X';
                }
                else if(K==38) {
                    array[5][0] = 'X';
                    array[5][1] = 'X';
                    array[5][2] = 'X';
                    array[5][3] = 'X';
                    array[5][4] = 'X';
                    array[5][5] = 'X';
                    array[5][6] = 'X';
                    array[4][6] = 'X';
                    array[4][7] = 'X';
                }
                else if(K==39){
                    array[5][0] = 'X';
                    array[5][1] = 'X';
                    array[5][2] = 'X';
                    array[5][3] = 'X';
                    array[5][4] = 'X';
                    array[5][5] = 'X';
                    array[5][6] = 'X';
                    array[5][7] = 'X';
                    array[4][7] = 'X';
                }
                else if(K==40){
                    array[5][0] = 'X';
                    array[5][1] = 'X';
                    array[5][2] = 'X';
                    array[5][3] = 'X';
                    array[5][4] = 'X';
                    array[5][5] = 'X';
                    array[5][6] = 'X';
                    array[5][7] = 'X';
                }
                else if(K==41){
                    array[6][0] = 'X';
                    array[6][1] = 'X';
                    array[5][1] = 'X';
                    array[5][2] = 'X';
                    array[5][3] = 'X';
                    array[5][4] = 'X';
                    array[5][5] = 'X';
                    array[5][6] = 'X';
                    array[5][7] = 'X';
                }
                else if(K==42){
                    array[6][0] = 'X';
                    array[6][1] = 'X';
                    array[6][2] = 'X';
                    array[5][2] = 'X';
                    array[5][3] = 'X';
                    array[5][4] = 'X';
                    array[5][5] = 'X';
                    array[5][6] = 'X';
                    array[5][7] = 'X';
                }
                else if(K==43){
                    array[6][0] = 'X';
                    array[6][1] = 'X';
                    array[6][2] = 'X';
                    array[6][3] = 'X';
                    array[5][3] = 'X';
                    array[5][4] = 'X';
                    array[5][5] = 'X';
                    array[5][6] = 'X';
                    array[5][7] = 'X';
                }
                else if(K==44){
                    array[6][0] = 'X';
                    array[6][1] = 'X';
                    array[6][2] = 'X';
                    array[6][3] = 'X';
                    array[6][4] = 'X';
                    array[5][4] = 'X';
                    array[5][5] = 'X';
                    array[5][6] = 'X';
                    array[5][7] = 'X';
                }
                else if(K==45){
                    array[6][0] = 'X';
                    array[6][1] = 'X';
                    array[6][2] = 'X';
                    array[6][3] = 'X';
                    array[6][4] = 'X';
                    array[6][5] = 'X';
                    array[5][5] = 'X';
                    array[5][6] = 'X';
                    array[5][7] = 'X';
                }
                else if(K==46){
                    array[6][0] = 'X';
                    array[6][1] = 'X';
                    array[6][2] = 'X';
                    array[6][3] = 'X';
                    array[6][4] = 'X';
                    array[6][5] = 'X';
                    array[6][6] = 'X';
                    array[5][6] = 'X';
                    array[5][7] = 'X';
                }
                else if(K==47){
                    array[6][0] = 'X';
                    array[6][1] = 'X';
                    array[6][2] = 'X';
                    array[6][3] = 'X';
                    array[6][4] = 'X';
                    array[6][5] = 'X';
                    array[6][6] = 'X';
                    array[6][7] = 'X';
                    array[5][7] = 'X';
                }
                else if(K==48){
                    array[6][0] = 'X';
                    array[6][1] = 'X';
                    array[6][2] = 'X';
                    array[6][3] = 'X';
                    array[6][4] = 'X';
                    array[6][5] = 'X';
                    array[6][6] = 'X';
                    array[6][7] = 'X';
                }
                else if(K==49){
                    array[7][0] = 'X';
                    array[7][1] = 'X';
                    array[6][1] = 'X';
                    array[6][2] = 'X';
                    array[6][3] = 'X';
                    array[6][4] = 'X';
                    array[6][5] = 'X';
                    array[6][6] = 'X';
                    array[6][7] = 'X';
                }
                else if(K==50){
                    array[7][0] = 'X';
                    array[7][1] = 'X';
                    array[7][2] = 'X';
                    array[6][2] = 'X';
                    array[6][3] = 'X';
                    array[6][4] = 'X';
                    array[6][5] = 'X';
                    array[6][6] = 'X';
                    array[6][7] = 'X';
                }
                else if(K==51){
                    array[7][0] = 'X';
                    array[7][1] = 'X';
                    array[7][2] = 'X';
                    array[7][3] = 'X';
                    array[6][3] = 'X';
                    array[6][4] = 'X';
                    array[6][5] = 'X';
                    array[6][6] = 'X';
                    array[6][7] = 'X';
                }
                else if(K==52){
                    array[7][0] = 'X';
                    array[7][1] = 'X';
                    array[7][2] = 'X';
                    array[7][3] = 'X';
                    array[7][4] = 'X';
                    array[6][4] = 'X';
                    array[6][5] = 'X';
                    array[6][6] = 'X';
                    array[6][7] = 'X';
                }
                else if(K==53){
                    array[7][0] = 'X';
                    array[7][1] = 'X';
                    array[7][2] = 'X';
                    array[7][3] = 'X';
                    array[7][4] = 'X';
                    array[7][5] = 'X';
                    array[6][5] = 'X';
                    array[6][6] = 'X';
                    array[6][7] = 'X';
                }
                else if(K==54){
                    array[7][0] = 'X';
                    array[7][1] = 'X';
                    array[7][2] = 'X';
                    array[7][3] = 'X';
                    array[7][4] = 'X';
                    array[7][5] = 'X';
                    array[7][6] = 'X';
                    array[6][6] = 'X';
                    array[6][7] = 'X';
                }
                else if(K==55){
                    array[7][0] = 'X';
                    array[7][1] = 'X';
                    array[7][2] = 'X';
                    array[7][3] = 'X';
                    array[7][4] = 'X';
                    array[7][5] = 'X';
                    array[7][6] = 'X';
                    array[7][7] = 'X';
                    array[6][7] = 'X';
                }
                else if(K==56){
                    array[7][7] = 'X';
                    array[7][6] = 'X';
                    array[7][5] = 'X';
                    array[7][4] = 'X';
                    array[7][3] = 'X';
                    array[7][2] = 'X';
                    array[7][1] = 'X';
                    array[7][0] = 'X';
                }
                else if(K==57){
                    array[7][1] = 'X';
                    array[7][2] = 'X';
                    array[7][3] = 'X';
                    array[7][4] = 'X';
                    array[7][5] = 'X';
                    array[7][6] = 'X';
                    array[7][7] = 'X';
                }
                else if(K==58){
                    array[7][2] = 'X';
                    array[7][3] = 'X';
                    array[7][4] = 'X';
                    array[7][5] = 'X';
                    array[7][6] = 'X';
                    array[7][7] = 'X';
                }
                else if(K==59){
                    array[7][3] = 'X';
                    array[7][4] = 'X';
                    array[7][5] = 'X';
                    array[7][6] = 'X';
                    array[7][7] = 'X';
                }
                else if(K==60){
                    array[7][4] = 'X';
                    array[7][5] = 'X';
                    array[7][6] = 'X';
                    array[7][7] = 'X';
                }
                else if(K==61){
                    array[7][5] = 'X';
                    array[7][6] = 'X';
                    array[7][7] = 'X';
                }
                else if(K==62){
                    array[7][6] = 'X';
                    array[7][7] = 'X';
                }
                else if(K==63){
                    array[7][7] = 'X';
                }
                for (int j = 0; j <8 ; j++) {
                    for (int k = 0; k <8 ; k++) {
                        System.out.print(array[j][k]);
                    }
                    System.out.println();
                }
                System.out.println();
            }

        }
        catch (Exception e){
            return;
        }
    }
}
