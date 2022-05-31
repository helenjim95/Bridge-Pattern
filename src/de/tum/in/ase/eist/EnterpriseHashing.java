package de.tum.in.ase.eist;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EnterpriseHashing extends Hashing {
    CryptoSecureHashAlgorithm cryptoSecureHashAlgorithm = new CryptoSecureHashAlgorithm();

    public EnterpriseHashing(Hashing hashing) {
        super(hashing);
    }

    @Override
    public String hashDocument(String string) {
        return string;
    }

    @Override
    public String calculateHashCode(String input) {
        return cryptoSecureHashAlgorithm.calculateHashCode(input);
    }
}
