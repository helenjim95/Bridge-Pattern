package de.tum.in.ase.eist;

// TODO: Concrete abstraction class
public class PreviewHashing extends Hashing {

    private static final int MAX_LENGTH = 1000;

    //  TODO: Reference of the implementation class
//    TODO: initiate implementation class
    public PreviewHashing() {
        this.setImplementation(new SimpleHashAlgorithm());
    }

    @Override
    public String hashDocument(String string) {
        if (string.length() > MAX_LENGTH) {
            throw new IllegalArgumentException();
        } else {
            return this.getImplementation().calculateHashCode(string);
        }
    }

}
