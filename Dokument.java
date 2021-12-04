package gda.ckziu1;

import java.util.Date;

public class Dokument {
    String typPliku;
    String rozszerzenie;
    String lokalizacja;
    double rozmiar;
    Date dataUtworzenia;

    public String getTypPliku() {
        return typPliku;
    }

    public void setTypPliku(String typPliku) {
        this.typPliku = typPliku;
    }

    public String getRozszerzenie() {
        return rozszerzenie;
    }

    public void setRozszerzenie(String rozszerzenie) {
        this.rozszerzenie = rozszerzenie;
    }

    public String getLokalizacja() {
        return lokalizacja;
    }

    public void setLokalizacja(String lokalizacja) {
        this.lokalizacja = lokalizacja;
    }

    public double getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(double rozmiar) {
        this.rozmiar = rozmiar;
    }

    public Date getDataUtworzenia() {
        return dataUtworzenia;
    }

    public void setDataUtworzenia(Date dataUtworzenia) {
        this.dataUtworzenia = dataUtworzenia;
    }
}
