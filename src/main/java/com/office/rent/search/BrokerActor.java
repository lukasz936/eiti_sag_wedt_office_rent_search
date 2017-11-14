package com.office.rent.search;

import akka.actor.AbstractActor;
import akka.actor.Props;

public class BrokerActor extends AbstractActor {

    static public Props props() {
        return Props.create(BrokerActor.class, new BrokerActor());
    }

    public BrokerActor (){

    }

    @Override
    public Receive createReceive() {
        return null;
    }
}
