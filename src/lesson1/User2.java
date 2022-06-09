package lesson1;

import lombok.*;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class User2 {


    private ArrayList<String> userInfo = new ArrayList<>();


    public void addOneUserInfo(String info){
        this.userInfo.add(info);
    }
//    public User2(int postId, int id, String name, String gmail, String body, ArrayList<String> userInfo) {
//        this.postId = postId;
//        this.id = id;
//        this.name = name;
//        this.gmail = gmail;
//        this.body = body;
//        this.userInfo = userInfo;
//    }
}

