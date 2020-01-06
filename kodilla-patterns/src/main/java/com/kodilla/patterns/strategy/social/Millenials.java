package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.FacebookPublisher;

public class Millenials extends User {
    public Millenials(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}
