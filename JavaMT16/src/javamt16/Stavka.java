
package javamt16;


public class Stavka {
    private String naziv;
    private double cena;

    public Stavka() {
    }

    public Stavka(String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
    
    
    
    public void stampajStavku(int sirinaRacuna){
        int sirinaZaNaziv = sirinaRacuna - 13;
        
        String nazivZaIspis = getNaziv();
        
        if(getNaziv().length()> sirinaZaNaziv){
        nazivZaIspis = getNaziv().substring(0, sirinaZaNaziv - 3) +"...";
        }
        String format1 = "%%%ds%%12.2f\n";
        String format2 = String.format(format1,sirinaZaNaziv);
        System.out.printf(format2, nazivZaIspis, getCena());
    }
          
    
    
}
