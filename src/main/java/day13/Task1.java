package day13;

import java.util.List;

import static day13.MessageDatabase.getMessages;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Bobby");
        User user2 = new User("John");
        User user3 = new User("Mike");

        user1.sendMessage(user2, "Hi! How is it going?");
        user1.sendMessage(user2, "Haven't you still gone insane making this Day13 Task?");

        user2.sendMessage(user1, "Hi pal!");
        user2.sendMessage(user1, "Oh yeah, these guys who created the marathon are killing me softly!");
        user2.sendMessage(user1, "I think it would be great if they post some article about key-word THIS before we start making the task!");

        user3.sendMessage(user1, "Hi Bobby!");
        user3.sendMessage(user1, "Where are you?");
        user3.sendMessage(user1, "I didn't see you in the office yesterday.");

        user1.sendMessage(user3, "Hi Mike!");
        user1.sendMessage(user3, "Yes, I lost myself doing some Java exercises. Sorry");
        user1.sendMessage(user3, "I can hardly move my fingers to write the messages now!");

        user3.sendMessage(user1, "Ok, I see! I wouldn't wish walking in your shoes!");

        MessageDatabase.showDialog(user1, user3);

        // List<Message> list =  MessageDatabase.getMessages();
        //System.out.println(list);


    }
}
