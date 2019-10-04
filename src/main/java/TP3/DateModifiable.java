package TP3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class DateModifiable implements Comparable<DateModifiable>, Cloneable {

    private GregorianCalendar c = new GregorianCalendar();
    private int nbJoursDepuisDerniereMAJ = 0;

    private DateModifiable(Date d) {
        c.setTime(d);
    }

    public DateModifiable(String vInit) {
        affecteUniquementC(vInit);
    }

    public DateModifiable() {
        this(new Date());
    }

    public void modifieToi(String nouvV) {
        int j1 = c.get(Calendar.DAY_OF_YEAR);
        int a1 = c.get(Calendar.YEAR);
        affecteUniquementC(nouvV);
        int j2 = c.get(Calendar.DAY_OF_YEAR);
        int a2 = c.get(Calendar.YEAR);
        nbJoursDepuisDerniereMAJ = (j2 - j1) + (a2 - a1) * 365;
    }

    public void plusNombreJours(int n) {
        c.add(Calendar.DAY_OF_YEAR, n);
        nbJoursDepuisDerniereMAJ = n;
    }

    public boolean avant(DateModifiable autre) {
        return compareTo(autre) < 0;
    }

    public int differenceJours(DateModifiable d) {
        long diff = Math.abs(this.c.getTime().getTime() - d.c.getTime().getTime());
        return (int) (diff / (1000 * 60 * 60 * 24));
    }

    public int nbJoursDepuisDerniereMAJ() {
        return nbJoursDepuisDerniereMAJ;
    }

    @Override
    public String toString() {
        StringTokenizer st = new StringTokenizer(c.getTime().toString(), " ");
        String[] s = new String[6];
        int i;
        for (i = 0; i < 6; i++)
            s[i] = st.nextToken();
        return s[2] + ' ' + s[1] + ' ' + s[5];

        /* return c.getTime().toString(); */
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        DateModifiable copie = (DateModifiable) super.clone();
        copie.c = (GregorianCalendar) c.clone();
        return copie;
    }

    @Override
    public int compareTo(DateModifiable o) {
        DateModifiable autre = o;
        int anneeThis = c.get(Calendar.YEAR);
        int anneeAutre = autre.c.get(Calendar.YEAR);
        int res;
        if (anneeThis == anneeAutre)
            res = c.get(Calendar.DAY_OF_YEAR) - autre.c.get(Calendar.DAY_OF_YEAR);
        else
            res = anneeThis - anneeAutre;
        return res;
    }

    public boolean equals(DateModifiable autre) {
        return compareTo(autre) == 0;
    }

    private void affecteUniquementC(String nouvV) {
        StringTokenizer st = new StringTokenizer(nouvV, "/");
        int jj = Integer.parseInt(st.nextToken());
        int mm = Integer.parseInt(st.nextToken());
        int aa = Integer.parseInt(st.nextToken());
        c.set(aa, mm - 1, jj); // 2eme param dans [0,11]
    }
}
