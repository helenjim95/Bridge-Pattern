package de.tum.in.ase.eist;

public abstract class Hashing implements HashFunction {
    private HashFunction hashFunction;

    public Hashing(HashFunction hashFunction) {
        this.hashFunction = hashFunction;
    }

    public String hashDocument(String string) {
        return string;
    }
}
