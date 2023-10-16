// kullanıcıdan alınan 3 sayının en büyüğünü bulan program: 

public class Degiskenler {

    public static void main(String[] args) {
 
    Scanner scanner= new Scanner(System.in);
    
        System.out.println("birinci sayı: ");
        int a= scanner.nextInt();
        
        System.out.println("ikinci sayı: ");
        int b= scanner.nextInt();
        
        System.out.println("üçüncü sayı: ");
        int c= scanner.nextInt();
        
        int max=1;
        
        if(a>=b && a>=c){
            max=a;   
        }
        else if(b>=a && b>=c){
          max=b;
        }
        else{
            max=c;
        }
        System.out.println("maksimum sayı: "+max);
    
}
}
