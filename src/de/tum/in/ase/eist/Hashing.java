package de.tum.in.ase.eist;

public abstract class Hashing implements HashFunction {
    private HashFunction hashFunction = new HashFunction() {
        @Override
        public String calculateHashCode(String input) {
            return input;
        }
    };

    public Hashing() { }

    abstract public String hashDocument(String string);

}
