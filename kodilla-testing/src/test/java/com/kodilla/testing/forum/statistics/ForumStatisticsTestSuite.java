package com.kodilla.testing.forum.statistics;
import org.junit.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

public class ForumStatisticsTestSuite {

    @Test
    public void testForumStatisticsNumberOfUsersIsZero(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> forumUsersNames = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(forumUsersNames);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        int numberOfUsers = 0;
        //Then
        Assert.assertEquals(numberOfUsers, forumUsersNames.size());
    }
    @Test
    public void testForumStatisticsNumberOfUsersIsHundred(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> forumUsersNames = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(forumUsersNames);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        int numberOfUsers = 100;
        //Then
        Assert.assertNotEquals(numberOfUsers, forumUsersNames.size());
    }
}
