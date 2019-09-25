package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int numberOfForumUsers;
    private int numberOfForumPosts;
    private int numberOfForumComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        this.numberOfForumUsers = statistics.usersNames().size();
        this.numberOfForumPosts = statistics.postsCount();
        this.numberOfForumComments = statistics.commentsCount();
        this.averagePostsPerUser = statistics.postsCount() / statistics.usersNames().size() + 1;
        this.averageCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size() + 1;
        this.averageCommentsPerPost = statistics.commentsCount() / statistics.postsCount() + 1;
    }

    public int getNumberOfForumUsers() {
        return numberOfForumUsers;
    }

    public int getNumberOfForumPosts() {
        return numberOfForumPosts;
    }

    public int getNumberOfForumComments() {
        return numberOfForumComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
