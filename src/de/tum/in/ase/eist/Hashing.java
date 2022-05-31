package de.tum.in.ase.eist;

public abstract class Hashing implements HashFunction {

    public Hashing() { }

    public abstract String hashDocument(String string);

    @Override
    public String calculateHashCode(String input) {
        return input;
    }

}
