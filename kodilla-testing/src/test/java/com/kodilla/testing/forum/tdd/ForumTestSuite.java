//package com.kodilla.testing.forum.tdd;
//import com.kodilla.testing.forum.ForumComment;
//import com.kodilla.testing.forum.ForumPost;
//import com.kodilla.testing.forum.ForumUser;
//import org.junit.*;
//
//public class ForumTestSuite {
//    private static int testCounter = 0;
//
//    @BeforeClass
//    public static void beforeAllTests(){
//        System.out.println("This is the beginning of tests");
//    }
//
//    @AfterClass
//    public static void afterAllTests(){
//        System.out.println("All tests are finished");
//    }
//
//    @Before
//    public void beforeEveryTest(){
//        testCounter++;
//        System.out.println("Preparing to execute test #" + testCounter);
//    }
//
//    @Test // test1
//    public void testAddPost(){
//        //Given
//        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
//        //When
//        forumUser.addPost("mrsmith", "Hello, this is my first post");
//        //Then
//        Assert.assertEquals(1, forumUser.getPostsQuantity());
//    }
//
//    @Test // test2
//    public void testAddComment(){
//        //Given
//        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
//        ForumPost forumPost = new ForumPost("This is my first post", "mrsmith");
//        //When
//        forumUser.addComment(forumPost, "mrsmith", "This is my first comment");
//        //Then
//        Assert.assertEquals(1, forumUser.getCommentQuantity());
//    }
//
//    @Test // test3
//    public void testGetPost(){
//        //Given
//        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
//        ForumPost forumPost = new ForumPost("This is my first post", "mrsmith");
//        forumUser.addPost(forumPost.getAuthor(), forumPost.getPostBody());
//        //When
//        ForumPost retrievedPost = forumUser.getPost(0);
//        //Then
//        Assert.assertEquals(forumPost, retrievedPost);
//    }
//
//    @Test // test4
//    public void testGetComment(){
//        //Given
//        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
//        ForumPost forumPost = new ForumPost("Hello everyone!", "mrsmith");
//        ForumComment forumComment = new ForumComment(forumPost, "This is a first comment", "mrsmith");
//        forumUser.addComment(forumPost, forumComment.getAuthor(), forumComment.getAuthor());
//        //When
//        ForumComment retrievedComment = forumUser.getComment(0);
//        //Then
//        Assert.assertEquals(forumComment, retrievedComment);
//    }
//
//    @Test // test5
//    public void testRemovePostNotExisting(){
//        //Given
//        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
//        ForumPost forumPost = new ForumPost("Hello everyone!", "mrsmith");
//        //When
//        boolean result = forumUser.removePost(forumPost);
//        //Then
//        Assert.assertFalse(result);
//    }
//
//    @Test // test6
//    public void testRemoveCommentNotExisting() {
//        //Given
//        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
//        ForumPost forumPost = new ForumPost("Hello everyone!", "mrsmith");
//        ForumComment forumComment = new ForumComment(forumPost, "This is a first comment", "mrsmith");
//        //When
//        boolean result = forumUser.removeComment(forumComment);
//        //Then
//        Assert.assertFalse(result);
//    }
//
//    @Test // test7
//    public void testRemovePost() {
//        //Given
//        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
//        ForumPost forumPost = new ForumPost("Hello everyone!", "mrsmith");
//        forumUser.addPost(forumPost.getAuthor(), forumPost.getPostBody());
//        //When
//        boolean result = forumUser.removePost(forumPost);
//        //Then
//        Assert.assertTrue(result);
//        Assert.assertEquals(0, forumUser.getPostsQuantity());
//    }
//
//    @Test // test8
//    public void testRemoveComment() {
//        //Given
//        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
//        ForumPost forumPost = new ForumPost("Hello everyone!", "mrsmith");
//        ForumComment forumComment = new ForumComment(forumPost, "This is a first comment", "mrsmith");
//        forumUser.addComment(forumPost, forumComment.getAuthor(),forumComment.getCommentBody());
//        //When
//        boolean result = forumUser.removeComment(forumComment);
//        //Then
//        Assert.assertTrue(result);
//        Assert.assertEquals(0, forumUser.getCommentQuantity());
//    }
//}
