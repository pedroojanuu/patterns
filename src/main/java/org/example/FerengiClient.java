package org.example;

public class FerengiClient extends AlienClient {
    protected OrderingStrategy createOrderingStrategy() {
        return new SmartStrategy();
    }
}
