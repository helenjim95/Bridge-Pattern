package de.tum.in.ase.eist;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EnterpriseHashing extends Hashing {
    public EnterpriseHashing(HashFunction hashFunction) {
        super(hashFunction);
    }

    @Override
    public String hashDocument(String string) {
        return string;
    }

    @Override
    public String calculateHashCode(String input) {
        CryptoSecureHashAlgorithm cryptoSecureHashAlgorithm = new CryptoSecureHashAlgorithm();
        return cryptoSecureHashAlgorithm.calculateHashCode(input);
    }
}
