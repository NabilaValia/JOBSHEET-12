import java.util.Scanner;  

public class ModifPercobaan2 {  
    static String hitungPangkat(int x, int y) {  
        if (y == 0) {  
            return "1"; 
        } else {  
            String previousCalculation = hitungPangkat(x, y - 1);  
            return x + "x" + previousCalculation; 
        }  
    }  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        int bilangan, pangkat;  

        System.out.print("Bilangan yang dihitung: ");  
        bilangan = sc.nextInt();  
        System.out.print("Pangkat: ");  
        pangkat = sc.nextInt();   
        String calculationString = hitungPangkat(bilangan, pangkat);  
        int result = calculatePower(bilangan, pangkat);  
        System.out.println(calculationString + " = " + result);  
    }  
    static int calculatePower(int x, int y) {  
        if (y == 0) {  
            return 1;  
        } else {  
            return x * calculatePower(x, y - 1);  
        }  
    }  
}