package org.example;

public class RomulanClient extends AlienClient {
    protected OrderingStrategy createOrderingStrategy() {
        return new ImpatientStrategy();
    }
}
