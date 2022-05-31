package de.tum.in.ase.eist;

public abstract class Hashing implements HashFunction {

    private HashFunction hashFunction;

    public Hashing(HashFunction hashFunction) {
        this.hashFunction = hashFunction;
    }

    public abstract String hashDocument(String string);
}
