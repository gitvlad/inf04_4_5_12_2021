package gda.ckziu1;

public abstract class Transport {
    String rodzajSilnika;
    Double wielkoscTransportu;
    String wyposazenie;
    Integer iloscMiejscSiedzacych;
    String marka;
    String rodzajPaliwa;

    public String getRodzajPaliwa() {
        return rodzajPaliwa;
    }

    public void setRodzajPaliwa(String rodzajPaliwa) {
        this.rodzajPaliwa = rodzajPaliwa;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setRodzajSilnika(String rodzajSilnika) {
        this.rodzajSilnika = rodzajSilnika;
    }

    public void setWielkoscTransportu(Double wielkoscTransportu) {
        this.wielkoscTransportu = wielkoscTransportu;
    }

    public void setWyposazenie(String wyposazenie) {
        this.wyposazenie = wyposazenie;
    }

    public void setIloscMiejscSiedzacych(Integer iloscMiejscSiedzacych) {
        this.iloscMiejscSiedzacych = iloscMiejscSiedzacych;
    }

    public String getRodzajSilnika() {
        return rodzajSilnika;
    }

    public Double getWielkoscTransportu() {
        return wielkoscTransportu;
    }

    public String getWyposazenie() {
        return wyposazenie;
    }

    public Integer getIloscMiejscSiedzacych() {
        return iloscMiejscSiedzacych;
    }
}
