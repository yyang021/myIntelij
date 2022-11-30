package Main;
import Player.player;

import java.util.Scanner;


public class main {

    static int stages = 1;
    static int rounds = 1;
    /*发牌*/
    public static void fapai(player p1,player p2,heguan h1){
        ArrayList<card>list=new ArrayList<>();
        int color[]={1,2,3,4};
        int[] number = {2,3,4,5,6,7,8,9,10,11,12,13,14};
        //将52张牌存入牌盒
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < number.length; j++) {
                list.add(new card(number[j],color[i]))  ;
            }
        }
        //打乱扑克
        Collections.shuffle(list);
        //取头七张
        card t1[]=new card[2];
        card t2[]=new card[2];
        card t3[]=new card[5];
        for (int i = 0; i < 7; i++) {
            if(i<=1) {
                t1[i] = list.get(i);
            }
            else if(i>1&&i<=3){
                t2[i-2]=list.get(i);
            }
            else{
                t3[i-4]=list.get(i);
            }
        }
        p1.setHandCard(t1);
        p2.setHandCard(t2);
        h1.setCard(t3);
    }

    /*1.preflop*/
    public static void preflop(player player1,player player2){

    }

    /*2.flop*/
    public  static void flop(player player1,player player2){

    }

    /*3.turn*/
    public  static void turn(player player1,player player2){

    }

    /*4.river*/
    public  static void river(player player1,player player2){

    }

    /*5.PK*/
    public  static void PK(player player1,player player2){

    }

    public static void main(String[] args) {
    player player1 = new player();//我,AI
    player player2 = new player();

    player1.Blind =1;
    player2.Blind =2;

    int chipPool = 0;
    Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------牌局--------------------------");
        while(true){

        System.out.printf("筹码池: %d\n",chipPool);
        System.out.println("player1剩余筹码:"+player1.chip);
        System.out.println("player2剩余筹码:"+player2.chip);
        stages = scanner.nextInt();

        switch (stages){
            case 1: {
                System.out.println("第"+stages+"轮:preflop");

                preflop(player1,player2);
                break;
            }
            case 2: {
                System.out.println("第"+stages+"轮:flop");

                flop(player1,player2);
                break;
            }
            case 3: {
                System.out.println("第"+stages+"轮:turn");

                turn(player1,player2);
                break;
            }
            case 4: {
                System.out.println("第"+stages+"轮:river");

                river(player1,player2);
                break;
            }
            case 5: {
                System.out.println("第"+stages+"轮:比牌");

                PK(player1,player2);
                break;
            }
        }

        //stages++;

        if(player1.chip==0||player2.chip==0||stages==5){
            break;
        }
    }

    }
}
