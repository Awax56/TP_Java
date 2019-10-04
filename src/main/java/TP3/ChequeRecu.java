package TP3;

public class ChequeRecu extends Operation {
    private String libelle;

    public ChequeRecu(double m, String d, String l) {
        super(m, d);
        libelle = l;
    }

    @Override
    public void editeOp() {
        System.out.println("\t" + super.dateop + "\t remise ch�que \t\t" + this.libelle + "\t\t\t " + super.montant);
    }
}
