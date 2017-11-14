package com.office.rent.search;

import akka.actor.AbstractActor;
import akka.actor.Props;

public class UserActor extends AbstractActor {

    static public Props props() {
        return Props.create(UserActor.class, new UserActor());
    }

    public UserActor (){

    }

    @Override
    public Receive createReceive() {
        return null;
    }
}
