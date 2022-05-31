package de.tum.in.ase.eist;

public class PreviewHashing extends Hashing {
    SimpleHashAlgorithm simpleHashAlgorithm;
    public PreviewHashing() {
        super();
        simpleHashAlgorithm = new SimpleHashAlgorithm();
    }

    @Override
    public String hashDocument(String string) {
        return string;
    }

    @Override
    public String calculateHashCode(String input) throws IllegalArgumentException {
        final int upper_limit = 1000;
        if (input.length() > upper_limit) {
            throw new IllegalArgumentException();
        } else {
            return simpleHashAlgorithm.calculateHashCode(input);
        }
    }
}
