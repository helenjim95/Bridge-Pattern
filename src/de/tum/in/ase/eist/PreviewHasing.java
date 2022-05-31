package de.tum.in.ase.eist;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PreviewHasing extends Hashing {
    SimpleHashAlgorithm simpleHashAlgorithm = new SimpleHashAlgorithm();

    public PreviewHasing(Hashing hashing) {
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
