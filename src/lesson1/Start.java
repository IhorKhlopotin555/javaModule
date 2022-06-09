package lesson1;

import java.util.ArrayList;

public class Start {
    public static void main(String [] args){

//        User user = new User();
//        User user1 = new User(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto");
//        System.out.println(user1.getUserId());
//
//        System.out.println(user1.getId());
//
//        String greeting = user1.greeting("");
//        System.out.println(greeting);
//
//        String greeting2 = user1.greeting2("");
//        System.out.println(greeting2);
        User2 user2 = new User2();
        ArrayList<String> userInfo = user2.getUserInfo();
        userInfo.add("id: " + 1);
        userInfo.add("postId: " + 1);
        userInfo.add("name: Ihor");
        userInfo.add("gmail: hlopotinigor555@gmail.com");
        userInfo.add("body: \"laudantium enim quasi est quidem magnam voluptate ipsam eos\\ntempora quo necessitatibus\\ndolor quam autem quasi\\nreiciendis et nam sapiente accusantium\" ");

        User2 user3 = new User2(userInfo);
        user3.addOneUserInfo("add: interests");
        System.out.println(user3);
    }
}
