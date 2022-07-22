package de.tum.in.ase.eist;

public abstract class Hashing implements HashFunction {
    private HashFunction implementation;

    public Hashing() {
    }

    public abstract String hashDocument(String string);

    public String calculateHashCode(String input) {
        return implementation.calculateHashCode(input);
    }

    public HashFunction getImplementation() {
        try {
            return implementation;
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        }
        return implementation;
    }
}
