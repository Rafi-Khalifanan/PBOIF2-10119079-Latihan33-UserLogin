package pboif2.pkg10119079.latihan33.userlogin;
import java.util.Scanner;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan Azanan
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class PBOIF210119079Latihan33UserLogin {
    private static String usName,passWord;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User user = new User();
        
        System.out.print("Masukan Username: ");
        usName = input.nextLine();
        
        System.out.print("Masukan Password: ");
        passWord = input.next();
        
        user.pengecekanLogin(usName, passWord);
         
    }
    
}
