package de.tum.in.ase.eist;

public abstract class Hashing implements HashFunction {
    private HashFunction implementation;
    public Hashing() { }

    public abstract String hashDocument(String string);
    @Override
    public String calculateHashCode(String input) {
        return implementation.calculateHashCode(input);
    }
    public HashFunction getImplementation() { return implementation; }

}
