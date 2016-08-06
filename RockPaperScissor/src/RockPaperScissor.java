import java.util.Random;

public class RockPaperScissor{
     
	public static void main(String[] args){
        
         
         
         int rock = 0;
         int paper = 0;
         int scissor = 0;
         int g;
         
         //rock     0
         //paper    1
         //scissor  2
         
         String winner;
         String pp1 = null;
         String pp2 = null;
         
         int w1 = 0;
         int w2 = 0;
         int tie = 0;;
         
            System.out.println("Game \tPlayer1 \tPlayer2 \tWinner");
            for (g=1;g<=10;++g){
               Random player1 = new Random();
               int p1 = player1.nextInt(3);
               if (p1 == 0){
                   ++rock;
                   pp1 = "Rock";
               }
               else if(p1 == 1){
                   ++paper;
                   pp1 = "Paper";
               }
               else if(p1 == 2){
                   ++scissor;
                   pp1 = "Scissor";
               }else{
                   System.out.println("Error in player1");
               }
               
               Random player2 = new Random();
               int p2 = player2.nextInt(3);
               if (p2 == 0){
                   ++rock;
                   pp2 = "Rock";
               }
               else if(p2 == 1){
                   ++paper;
                   pp2 = "Paper";
               }
               else if(p2 == 2){
                   ++scissor;
                   pp2 = "Scissor";
               }else{
                   System.out.println("Error in player2");
               }
               
               //game rule
               //rock     0
               //paper    1
               //scissor  2
               if (p1 == p2){
                   ++tie;
                   winner = "Tie";
               }else if(p1 == 0 && p2 == 1){
                   winner = "Player2";
                   ++w2;
               }else if(p1 == 1 && p2 == 2){
                   winner = "Player2";
                   ++w2;
               }else if(p1 == 2 && p2 == 0){
                   winner = "Player2";
                   ++w2;
               }else{
                   winner ="Player1";
                   ++w1;
               }
               
               
               
               

            System.out.println(g + "\t"+ pp1 + "\t\t"  + pp2 + "\t\t" + winner);
            }
            System.out.println("");
            System.out.println("Number of Rock:\t\t" + rock);
            System.out.println("Number of Paper:\t" + paper);
            System.out.println("Number of Scissor:\t" + scissor);        
            System.out.println("Number of Tie:\t\t" + tie);
            System.out.println("Player1 wins " + w1 +" time(s)!");
            System.out.println("Player2 wins " + w2 +" time(s)!");       
            
     }
}