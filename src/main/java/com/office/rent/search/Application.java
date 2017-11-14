package com.office.rent.search;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;

public class Application {
  public static void main(String[] args) {
    final ActorSystem system = ActorSystem.create("OfficeRentSearch");
    try {
      final ActorRef userActor = system.actorOf(UserActor.props(), "userActor");
      final ActorRef brokerActor = system.actorOf(BrokerActor.props(), "brokerActor");
      final ActorRef websiteActor = system.actorOf(WebsiteActor.props(), "websiteActor");
    } finally {
      system.terminate();
    }
  }
}
