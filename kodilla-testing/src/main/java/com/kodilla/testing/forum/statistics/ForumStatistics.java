package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int numberOfForumUsers;
    private int numberOfForumPosts;
    private int numberOfForumComments;
    private int averagePostsPerUser;
    private int averageCommentsPerUser;
    private int averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        this.numberOfForumUsers = statistics.usersNames().size();
        this.numberOfForumPosts = statistics.postsCount();
        this.numberOfForumComments = statistics.commentsCount();
        if (statistics.usersNames().size() == 0) {
            this.averagePostsPerUser = 0;
        } else {
            this.averagePostsPerUser = statistics.postsCount() / statistics.usersNames().size();
        }
        if (statistics.usersNames().size() == 0) {
            this.averageCommentsPerUser = 0;
        } else {
            this.averageCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        }
        if (statistics.postsCount() == 0) {
            this.averageCommentsPerPost = 0;
        } else {
            this.averageCommentsPerPost = statistics.commentsCount() / statistics.postsCount();
        }
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

    public int getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public int getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public int getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
