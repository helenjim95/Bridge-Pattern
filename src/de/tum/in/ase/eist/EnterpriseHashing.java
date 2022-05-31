package de.tum.in.ase.eist;

public class EnterpriseHashing extends Hashing {
    private CryptoSecureHashAlgorithm cryptoSecureHashAlgorithm = new CryptoSecureHashAlgorithm();;
    public EnterpriseHashing() {
        super();
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
