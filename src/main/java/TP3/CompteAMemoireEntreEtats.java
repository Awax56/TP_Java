package TP3;

import java.util.*;

public class CompteAMemoireEntreEtats extends CompteAMemoireLimitee {

    private LinkedList<Operation> Op = new LinkedList<Operation>();

    public CompteAMemoireEntreEtats(String nomClient) {
        super(nomClient);
    }

    public void enregistrer(Operation o) {
        if (o.montant() > 0) {
            this.credite(o.montant());
        }
        else {
            this.debite(-o.montant());
        }
        Op.add(o);
    }

    @Override
    public void editeEtat() {
        System.out.println("\tDate\t\tTransaction\t\tLibelle\t\tDebit\t\tCredit\t");
        System.out.println("\t-------------------------------------------------------------------------------");

        Collections.sort(Op);
        ListIterator<Operation> i = Op.listIterator();
        while (i.hasNext()) {
            Operation o = (Operation) i.next();
            o.editeOp();
        }

        System.out.println();
        Op.clear();
        super.editeEtat();
    }
}
