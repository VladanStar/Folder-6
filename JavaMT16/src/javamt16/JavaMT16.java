
package javamt16;

public class JavaMT16 {

   
    public static void main(String[] args) {
        
        /*int sirinaZaNaziv = 20;
        String format1 = "%%%dd%%12.2f";
        String format2 = String.format(format1,sirinaZaNaziv);
        System.out.println(format2);
        System.out.println("");*/
        
        
      Racun r = new Racun("Prodavnica","Nepoznata 33","Beograd","2019-12-01"," 10:30","Vladan Cupric");
      
      
      r.dodajStavku(new Stavka("Stavka 1", 100.59));
      r.dodajStavku(new Stavka("Stavka 2", 80.59));
      r.dodajStavku(new Stavka("Kokice -slane", 16.25));
      r.dodajStavku(new Stavka("Stavka sa dugackim imenom koje ce morati da bude skraceno", 356.154));
      
      r.stampajRacun(40);
       
      
      
    }
    
}
