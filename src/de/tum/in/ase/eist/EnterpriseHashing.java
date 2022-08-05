package de.tum.in.ase.eist;

public class EnterpriseHashing extends Hashing {

    public EnterpriseHashing() {
        this.setImplementation(new CryptoSecureHashAlgorithm());
    }

    @Override
    public String hashDocument(String string) {
        return this.getImplementation().calculateHashCode(string);
    }
}
