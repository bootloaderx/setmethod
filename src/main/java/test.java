import java.util.*;

//Set() Metodu kod örneği
public class test {
   public static void main(String[] args) {
      
    ArrayList<String> renkler = new ArrayList<String>(5);

    // Listeye eleman eklemek için add metotunu kullandım
    renkler.add("Beyaz");
    renkler.add("Siyah");
    renkler.add("Kırmızı");
    renkler.add("Yeşil");
	  renkler.add("Sarı");
	    
	// Kırmızı rengi Mürdüm rengiyle değiştireceğim 
    renkler.set(2, new String("Mürdüm"));		
	
	// Şimdi de renkleri yazdırıyorum
    for (int i = 0; i < 5; i++)
      {
         System.out.println(renkler.get(i).toString());
      }
  }
}