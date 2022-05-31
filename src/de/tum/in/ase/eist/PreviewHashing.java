package de.tum.in.ase.eist;

public class PreviewHashing extends Hashing {
    Hashing hashing;
    SimpleHashAlgorithm simpleHashAlgorithm = new SimpleHashAlgorithm();

    public PreviewHashing() {
        super();
    }

    @Override
    public String hashDocument(String string) {
        return string;
    }

    @Override
    public String calculateHashCode(String input) {
        if (input.length() > 1000) {
            throw new IllegalArgumentException();
        } else {
            return simpleHashAlgorithm.calculateHashCode(input);
        }
    }
}
