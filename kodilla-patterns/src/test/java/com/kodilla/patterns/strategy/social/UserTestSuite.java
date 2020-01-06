package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSocialStrategy(){
        //Given
        User kasia = new Millenials("Kasia");
        User zenek = new ZGeneration("Zenek");
        User marian = new YGeneration("Marian");

        //When
        String kasiaShareOn = kasia.sharePost();
        String zenekShareOn = zenek.sharePost();
        String marianShareon = marian.sharePost();

        //Then
        Assert.assertEquals("Facebook", kasiaShareOn);
        Assert.assertEquals("Twitter", zenekShareOn);
        Assert.assertEquals("Snapchat", marianShareon);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User marian = new YGeneration("Marian");

        //When
        marian.setSocialMedia(new FacebookPublisher());
        String marianShareOn = marian.sharePost();

        //Then
        Assert.assertEquals("Facebook", marianShareOn);
    }
}
