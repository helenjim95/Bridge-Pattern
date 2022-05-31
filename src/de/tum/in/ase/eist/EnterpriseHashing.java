package de.tum.in.ase.eist;

public class EnterpriseHashing extends Hashing {
    private CryptoSecureHashAlgorithm cryptoSecureHashAlgorithm;
    public EnterpriseHashing() {
        super();
        cryptoSecureHashAlgorithm = new CryptoSecureHashAlgorithm();
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
