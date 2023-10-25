// Kullanıcı GiriŞ Programı

public class Degiskenler {

   
    public static void main(String[] args) {
    
      Scanner scanner= new Scanner(System.in);
      
      int giris_hakki=3;
      
      String sys_kullanici_adi="yagmurbarut";
      String sys_parola="1234";
      
      System.out.println("----------------------");
      System.out.println("\tHOŞGELDİNİZ");
      System.out.println("----------------------");
      
        while(true){
            System.out.println("Kullanıcı Adı: ");
            String kullanici= scanner.nextLine();
            System.out.println("Parola: ");
            String parola= scanner.nextLine();
             
            if(kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("Hoşgeldiniz " +kullanici);
                break;
            }
            else if(kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)){
                giris_hakki-= 1;
                System.out.println("Parolanız yanlış tekrar deneyiniz!\n kalan deneme hakkı:"+giris_hakki);
                
            }
            else if(!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                giris_hakki-= 1;
                System.out.println("Kullanıcı adınız yanlış tekrar deneyiniz!\n kalan deneme hakkı:"+giris_hakki);
                
            }
            else{
                giris_hakki-=1;
                System.out.println("Kullanıcı adınız ve parolanız yanlış tekrar deneyiniz!\n kalan deneme hakkı: "+giris_hakki);
                
            }
            if(giris_hakki==0){
                System.out.println("Giriş deneme hakkınız bitti 24 saat sonra yeniden deneyiniz.");
                break;
            }
        }
      
    }
 }
 
