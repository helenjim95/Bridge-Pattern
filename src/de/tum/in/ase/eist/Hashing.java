package de.tum.in.ase.eist;

// TODO: Abstraction class
public abstract class Hashing {

//  TODO: reference to implementation interface
    private HashFunction implementation;

    public Hashing() {
    }

    public abstract String hashDocument(String string);

    public HashFunction getImplementation() {
        return this.implementation;
    }

    public void setImplementation(HashFunction implementation) {
        this.implementation = implementation;
    }

}
