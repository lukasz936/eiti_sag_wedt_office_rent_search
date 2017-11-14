package com.office.rent.search;

import akka.actor.AbstractActor;
import akka.actor.Props;

public class WebsiteActor extends AbstractActor {

    static public Props props() {
        return Props.create(WebsiteActor.class, new WebsiteActor());
    }

    public WebsiteActor (){

    }

    @Override
    public Receive createReceive() {
        return null;
    }
}
