package TP3;

abstract class Operation implements Comparable<Operation> {

    protected double montant;
    protected final DateModifiable dateop;

    public Operation(double m, String d) {
        montant = m;
        dateop = new DateModifiable(d);
    }

    abstract void editeOp();

    public double montant() {
        return this.montant;
    }

    @Override
    public int compareTo(Operation autre) {
        Operation o = (Operation) autre;
        return this.dateop.compareTo(o.dateop);
    }
}
