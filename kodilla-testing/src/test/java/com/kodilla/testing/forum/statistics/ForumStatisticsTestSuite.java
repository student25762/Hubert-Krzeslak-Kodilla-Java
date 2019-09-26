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
            posts.add("comment" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(posts.size());

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        double avg = forumStatistics.getAveragePostsPerUser();

        //Then
        Assert.assertEquals(10, avg);
    }
}
