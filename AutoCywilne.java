package gda.ckziu1;

public class AutoCywilne extends Auto implements Jezdzenie {


    @Override
    public void jedz() {

    }

    @Override
    public String toString() {
        return "AutoCywilne{" +
                "nazwa='" + nazwa + '\'' +
                ", wielkosc=" + wielkosc +
                ", rodzajSilnika='" + rodzajSilnika + '\'' +
                ", wielkoscTransportu=" + wielkoscTransportu +
                ", wyposazenie='" + wyposazenie + '\'' +
                ", iloscMiejscSiedzacych=" + iloscMiejscSiedzacych +
                ", marka='" + marka + '\'' +
                ", rodzajPaliwa='" + rodzajPaliwa + '\'' +
                '}';
    }
}
