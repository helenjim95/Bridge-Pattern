package de.tum.in.ase.eist;

// TODO: Concrete abstraction class
public class PreviewHashing extends Hashing {

//  TODO: Reference of the implementation class
    private final HashFunction implementation;

//    TODO: initiate implementation class
    public PreviewHashing() {
        this.implementation = new SimpleHashAlgorithm();
    }

    @Override
    public String hashDocument(String string) {
        final int upperLimit = 1000;
        if (string.length() > upperLimit) {
            throw new IllegalArgumentException();
        } else {
            return string;
        }
    }

    @Override
    public String calculateHashCode(String input) {
            return implementation.calculateHashCode(input);
    }

    @Override
    public HashFunction getImplementation() {
        try {
            return implementation;
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        }
        return implementation;
    }
}
