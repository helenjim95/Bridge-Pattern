package de.tum.in.ase.eist;

public abstract class Hashing implements HashFunction {

    public Hashing() {
        HashFunction hashFunction = new HashFunction() {
            @Override
            public String calculateHashCode(String input) {
                return input;
            }
        };
    }
    public abstract String hashDocument(String string);

}
