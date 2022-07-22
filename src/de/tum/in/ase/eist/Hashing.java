package de.tum.in.ase.eist;

public abstract class Hashing implements HashFunction {
    private HashFunction implementation;
    public Hashing() {
    }

    public abstract String hashDocument(String string);

    public abstract String calculateHashCode(String input);
    public HashFunction getImplementation() { return implementation; }

}
