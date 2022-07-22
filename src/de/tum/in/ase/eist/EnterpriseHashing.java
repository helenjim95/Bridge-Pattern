package de.tum.in.ase.eist;

public class EnterpriseHashing extends Hashing {

    private final HashFunction implementation = new CryptoSecureHashAlgorithm();
    public EnterpriseHashing() { }

    @Override
    public String hashDocument(String string) {
        return string;
    }
    @Override
    public String calculateHashCode(String input) {
        return implementation.calculateHashCode(input);
    }

    @Override
    public HashFunction getImplementation() {
        try {
            return implementation;
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        }
        return implementation;
    }
}
