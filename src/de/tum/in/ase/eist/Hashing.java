package de.tum.in.ase.eist;

public abstract class Hashing implements HashFunction {
    public Hashing(){
    }

    abstract String hashDocument(String string);
}
