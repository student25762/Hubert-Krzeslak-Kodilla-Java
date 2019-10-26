package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String []args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMap = forum.getUserList().stream()
                .filter(user -> user.getNumberOfPosts() > 0)
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.age(user) >= 20)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        resultMap.entrySet().stream()
                .forEach(System.out::println);

    }
}
