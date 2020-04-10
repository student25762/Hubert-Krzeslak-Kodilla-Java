package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char sex;
    private final int numberOfPosts;
    private final LocalDate dateOfBirth;


    public ForumUser(int userID, String userName, char sex, int numberOfPosts, int year, int month, int day) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.numberOfPosts = numberOfPosts;
        this.dateOfBirth = LocalDate.of(year, month, day);
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int age(ForumUser forumUser) {
        return LocalDate.now().getYear() - forumUser.getDateOfBirth().getYear();
    }


    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", numberOfPosts=" + numberOfPosts +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
