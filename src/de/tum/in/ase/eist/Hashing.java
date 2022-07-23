package de.tum.in.ase.eist;

// TODO: Abstraction class
public abstract class Hashing implements HashFunction {

//  TODO: reference to implementation interface
    private HashFunction implementation;

    public Hashing() {
    }

    public abstract String hashDocument(String string);

//    TODO: Delegate method calls to implementation interface
    public String calculateHashCode(String input) {
        if (this.implementation instanceof SimpleHashAlgorithm) {
            HashFunction simpleHashAlgorithm = new SimpleHashAlgorithm();
            return simpleHashAlgorithm.calculateHashCode(input);
        } else if (this.implementation instanceof CryptoSecureHashAlgorithm) {
            HashFunction cryptoSecureHashAlgorithm = new CryptoSecureHashAlgorithm();
            return cryptoSecureHashAlgorithm.calculateHashCode(input);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public HashFunction getImplementation() {
        try {
            return implementation;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }

    public void setImplementation(HashFunction implementation) {
        this.implementation = implementation;
    }

}
