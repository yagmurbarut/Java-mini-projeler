public class Degiskenler {

    public static void main(String[] args) {
 
    Scanner scanner= new Scanner(System.in);
    
        System.out.println("--------------------------------");
    String islemler= "1. toplama işlemi\n"+
                     "2. çıkarma işlemi\n"+
                     "3. çarpma işlemi\n"+
                     "4. bölme işlemi";
        System.out.println(islemler);
        System.out.println("--------------------------------");
        System.out.println("islem seçiniz: ");
        String islem= scanner.nextLine();
        switch(islem){
            case "1":
                System.out.println("birinci sayı: ");
                int a= scanner.nextInt();
                System.out.println("ikinci sayı: ");
                int b= scanner.nextInt();
                System.out.println("toplam: "+(a+b));
                
            break;
            
            case "2":
                System.out.println("birinci sayı: ");
                int c= scanner.nextInt();
                System.out.println("ikinci sayı: ");
                int d= scanner.nextInt();
                System.out.println("fark: "+(c-d));
                
            break;
            
            case "3": 
            System.out.println("birinci sayı: ");
                int e= scanner.nextInt();
                System.out.println("ikinci sayı: ");
                int f= scanner.nextInt();
                System.out.println("çarpım: "+(e*f));
                
            break;    
            
             case "4": 
            System.out.println("birinci sayı: ");
                int g= scanner.nextInt();
                System.out.println("ikinci sayı: ");
                int k= scanner.nextInt();
                System.out.println("bölüm: "+ ((double)g/k));
                
            break;    
            
            default:
                System.out.println("lütfen geçerli bir işlem giriniz!");
            break;
        }
}
}
