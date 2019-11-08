package TP4;

public class ContratExistant extends Exception {

    private static final long serialVersionUID = 3815542166095392724L;

    public ContratExistant() {
        super("un contrat de meme nom et de meme immatriculation exite deja...");
    }
}
