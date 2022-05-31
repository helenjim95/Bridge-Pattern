package de.tum.in.ase.eist;

public class PreviewHashing extends Hashing {
    public PreviewHashing() {
        super();
    }

    @Override
    public String hashDocument(String string) {
        return string;
    }

    @Override
    public String calculateHashCode(String input) throws IllegalArgumentException {
        if (input.length() > 1000) {
            throw new IllegalArgumentException();
        } else {
            SimpleHashAlgorithm simpleHashAlgorithm = new SimpleHashAlgorithm();
            return simpleHashAlgorithm.calculateHashCode(input);
        }
    }
}
