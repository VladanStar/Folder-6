
package javamt16;

import java.util.Random;

public class Racun {
    private String imeRadnje, ulicaIBroj, grad;
    private String datum, vreme;
    private String imeKasira;
    
    private int brojTransakcije;
    
    private Stavka[] stavke = new Stavka[50];
    private int sledecaStavka = 0;

    public Racun() {
    }

    public Racun(String imeRadnje,  String ulicaIBroj,String grad, String datum, String vreme, String imeKasira) {
        this.imeRadnje = imeRadnje;
        this.ulicaIBroj = ulicaIBroj;
        this.grad = grad;
        this.datum = datum;
        this.vreme = vreme;
        this.imeKasira = imeKasira;
        
        Random r = new Random();
        this.brojTransakcije =r.nextInt(999);
    }
    private void stampajSeparator( int sirinaRacuna){
        for(int i = 0; i<25; i++){
            System.out.print("= ");
        }
        System.out.println("");
    
    }
    public void dodajStavku(Stavka s){
        stavke[sledecaStavka] = s;
        sledecaStavka++;
        
    }
    public void stampajRacun( int sirinaRacuna){
        System.out.println(imeRadnje);
        System.out.println(ulicaIBroj + " " + grad );
        
        stampajSeparator(sirinaRacuna);
        
         System.out.println("Datum "+ datum);
        System.out.println("Vreme " + vreme);
        
        stampajSeparator(sirinaRacuna);
        
        double suma = 0.0;
        
        for(int i = 0; i<sledecaStavka; i++){
            stavke[i].stampajStavku(sirinaRacuna);
            suma += stavke[i].getCena();
        }
        stampajSeparator(sirinaRacuna);
        
        double porez = suma *0.2;
        double iznos = suma - porez;
        
         int sirinaZaNaziv = sirinaRacuna - 13;
        
        String format1 = "%%%ds%%12.2f\n";
        String format2 = String.format(format1,sirinaZaNaziv);
       
        
        System.out.printf(format2,"Ukupni iznos: ", iznos);
        System.out.printf(format2,"Ukupni porez: ", porez);
        System.out.printf(format2,"Ukupno za uplatu: ", suma);
        
        System.out.println("Kasir: " + imeKasira);
        System.out.println("Broj transakcije:" + brojTransakcije);
    }
    
}
