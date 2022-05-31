package de.tum.in.ase.eist;

public abstract class Hashing implements HashFunction {
    private HashFunction hashFunction;

    public Hashing(){}

    abstract String hashDocument(String string);
}
