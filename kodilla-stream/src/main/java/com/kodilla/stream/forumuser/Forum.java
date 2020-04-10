package com.kodilla.stream.forumuser;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> listOfForumUsers = new ArrayList<>();

    public Forum() {
        listOfForumUsers.add(new ForumUser(1, "beszika", 'F', 3, 1981, 11, 20));
        listOfForumUsers.add(new ForumUser(2, "bazooka", 'M', 20, 1999, 10, 3));
        listOfForumUsers.add(new ForumUser(3, "rabbit", 'M', 0, 1985, 5, 3));
        listOfForumUsers.add(new ForumUser(4, "nickname", 'F', 0, 2000, 4, 7));
        listOfForumUsers.add(new ForumUser(5, "speed", 'M', 7, 1989, 12, 1));
        listOfForumUsers.add(new ForumUser(6, "forumUser89", 'M', 1, 2009, 11, 11));
        listOfForumUsers.add(new ForumUser(7, "maria", 'F', 30, 1979, 3, 6));
        listOfForumUsers.add(new ForumUser(8, "banksy", 'M', 0, 2003, 8, 1));
        listOfForumUsers.add(new ForumUser(9, "olia", 'F', 2, 1991, 5, 9));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(listOfForumUsers);
    }


}