package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Player player1 = new Player(rand.nextInt(Player.MAX_STAMINA - 90 + 1) + 90);
        Player player2 = new Player(rand.nextInt(Player.MAX_STAMINA - 90 + 1) + 90);
        Player player3 = new Player(rand.nextInt(Player.MAX_STAMINA - 90 + 1) + 90);
        Player player4 = new Player(rand.nextInt(Player.MAX_STAMINA - 90 + 1) + 90);
        Player player5 = new Player(rand.nextInt(Player.MAX_STAMINA - 90 + 1) + 90);
        Player player6 = new Player(rand.nextInt(Player.MAX_STAMINA - 90 + 1) + 90);
        /*Player player7 = new Player(rand.nextInt(11) + 90);
        Player player8 = new Player(rand.nextInt(11) + 90);*/

        //System.out.println(Player.getCountPlayers());
        Player.info();

        // System.out.println(player1.getStamina());
        int staminaLevel = player4.getStamina();
        for (int i = 0; i < staminaLevel; i++) player4.run();


        //player1.run();
        System.out.println("Stamina4 = " + player4.getStamina());
        //System.out.println("Stamina1 = " + player1.getStamina());


        System.out.println(Player.getCountPlayers());
        Player.info();


    }
}
