package de.tum.in.ase.eist;

public abstract class Hashing implements HashFunction {
    private HashFunction hashFunction;

    public Hashing() { }

    abstract public String hashDocument(String string);

}
