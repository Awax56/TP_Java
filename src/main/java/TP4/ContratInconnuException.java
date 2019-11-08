package TP4;

public class ContratInconnuException extends Exception {

    private static final long serialVersionUID = -9173504923775396611L;

    public ContratInconnuException() {
        super("ce type de contrat n'existe pas dans notre compagnie...");
    }
}
