package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @Test
    public void test1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            users.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int avg = forumStatistics.getAveragePostsPerUser();
        //Then
        Assert.assertEquals(10, avg);
    }

    @Test
    public void test2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int avg = forumStatistics.getAveragePostsPerUser();
        //Then
        Assert.assertEquals(0, avg);
    }

    @Test
    public void test3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            users.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int avg = forumStatistics.getAverageCommentsPerUser();
        //Then
        Assert.assertEquals(0, avg);
    }

    @Test
    public void test4() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(200);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //When
        boolean result = forumStatistics.getNumberOfForumPosts() < forumStatistics.getNumberOfForumComments();
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void test5() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(100);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //When
        boolean result = forumStatistics.getNumberOfForumPosts() < forumStatistics.getNumberOfForumComments();
        //Then
        Assert.assertFalse(result);
    }
}
