package de.tum.in.ase.eist;

public class PreviewHashing extends Hashing {
    SimpleHashAlgorithm simpleHashAlgorithm = new SimpleHashAlgorithm();

    public PreviewHashing(Hashing hashing) {
        super(hashing);
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
