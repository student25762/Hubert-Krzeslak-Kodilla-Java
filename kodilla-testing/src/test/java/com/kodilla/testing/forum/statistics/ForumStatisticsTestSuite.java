package com.kodilla.testing.forum.statistics;
import org.junit.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

public class ForumStatisticsTestSuite {

    @Test
    public void testAvgPostsPerUser(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> users = new ArrayList<String>();
        for(int i=0; i<100; i++) {
            users.add("user" + i);
        }
        List<String> posts = new ArrayList<String>();
        for(int i=0; i<1000; i++) {
            posts.add("post" + i);
        }
//        List<String> comments = new ArrayList<String>();
//        for(int i=0; i<2000; i++) {
//            comments.add("comment" + i);
//        }

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(posts.size());
//        when(statisticsMock.commentsCount()).thenReturn(comments.size());

        //When
        int numberOfUsers = statisticsMock.usersNames().size();
        int numberOfPosts = statisticsMock.postsCount();
        int avg = numberOfPosts / numberOfUsers;

        //Then
        Assert.assertEquals(10, avg);
    }
}
