package de.tum.in.ase.eist;

public class PreviewHashing extends Hashing {

    private final HashFunction implementation;
    public PreviewHashing() {
        this.implementation = new SimpleHashAlgorithm();
    }

    @Override
    public String hashDocument(String string) {
        return string;
    }

    @Override
    public String calculateHashCode(String input) throws IllegalArgumentException {
        final int upperLimit = 1000;
        if (input.length() > upperLimit) {
            throw new IllegalArgumentException();
        } else {
            return implementation.calculateHashCode(input);
        }
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
