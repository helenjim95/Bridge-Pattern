package de.tum.in.ase.eist;

public abstract class Hashing implements HashFunction {
    private HashFunction implementation;
    public Hashing() { }

    public abstract String hashDocument(String string);
    @Override
    public String calculateHashCode(String input) {
        String hashCode = "";
        if (implementation.equals("PreviewHashing")) {
            SimpleHashAlgorithm simpleHashAlgorithm = new SimpleHashAlgorithm();
            hashCode = simpleHashAlgorithm.calculateHashCode(input);
        } else if (implementation.equals("EnterpriseHashing")) {
            CryptoSecureHashAlgorithm cryptoSecureHashAlgorithm = new CryptoSecureHashAlgorithm();
            hashCode = cryptoSecureHashAlgorithm.calculateHashCode(input);
        }
        return hashCode;
    }
    public HashFunction getImplementation() { return implementation; }

}
