package de.tum.in.ase.eist;

public class PreviewHashing extends Hashing {
    private SimpleHashAlgorithm simpleHashAlgorithm;
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
        final int upperLimit = 1000;
        if (input.length() > upperLimit) {
            throw new IllegalArgumentException();
        } else {
            return simpleHashAlgorithm.calculateHashCode(input);
        }
    }
}
