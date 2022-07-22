package de.tum.in.ase.eist;

public class EnterpriseHashing extends Hashing {

    private String implementation = "CryptoSecureHashAlgorithm";
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

    @Override
    public String getImplementation() {
        try {
            return implementation;
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        }
        return implementation;
    }
}
