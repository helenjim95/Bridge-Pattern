package de.tum.in.ase.eist;

public abstract class Hashing implements HashFunction {
    private String implementation;
    public Hashing() { }

    public String hashDocument(String string) {
        String output = "";
        if (implementation.equals("SimpleHashAlgorithm")) {
            PreviewHashing previewHashing = new PreviewHashing();
            output = previewHashing.hashDocument(string);
        } else if (implementation.equals("CryptoSecureHashAlgorithm")) {
            EnterpriseHashing enterpriseHashing = new EnterpriseHashing();
            output = enterpriseHashing.hashDocument(string);
        }
        return output;
    }
    @Override
    public String calculateHashCode(String input) {
        return input;
    }
    public String getImplementation() { return implementation; }

}
