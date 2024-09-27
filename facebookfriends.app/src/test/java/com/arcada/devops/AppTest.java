package com.arcada.devops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	

    @Test
    public void testFriendListExists() {
        App app = new App();
        String[] friends = app.getFriendList("https://facebook.com/user1");
        assertNotNull(friends);
    }
    
    @Test
    public void testCorrectFriendList() {
    	App app = new App();
    	String[] friends = app.getFriendList("https://facebook.com/user2");
    	assertArrayEquals(new String[] {"John", "Jane"}, friends);
    }
    
    @Test
    public void testEmptyFriendList() {
    	App app = new App();
    	String[] friends = app.getFriendList("https://facebook.com/user3");
    	assertEquals(0, friends.length);
	}
    
    @Test
    public void testInvalidUser() {
    	App app = new App();
    	String[] friends = app.getFriendList("https://facebook.com/user4");
    	assertNull(friends);
	}
    
    @Test
    public void testPerformance() {
    	long startTime = System.currentTimeMillis();
    	App app = new App();
    	String[] friends = app.getFriendList("https://facebook.com/user1");
        long endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime-startTime) + "ms to start app and fetch " + (friends.length) + " friends"); 
    }
    
}
