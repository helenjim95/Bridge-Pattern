package de.tum.in.ase.eist;

public class EnterpriseHashing extends Hashing {

    private final HashFunction implementation;
    public EnterpriseHashing() {
        this.implementation = new CryptoSecureHashAlgorithm();
    }

    @Override
    public String hashDocument(String string) {
        return this.getImplementation().calculateHashCode(string);
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
