package pboif2.pkg10119079.latihan33.userlogin;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan Azanan
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class User {
    private static final String username = "RizkiAdam";
    private static final String password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun (String parUserName, String parPassword) {
        if ((parUserName.equals(username)) && (parPassword.equals(password))) { 
            return statusAkun = true;
        } else {
            return statusAkun = false;
        }
    }
    
    private void hasilLogin (boolean status, String parUserName) {
        if (statusAkun) {
            System.out.println("******HALO RIZKIADAM******");
            System.out.println("Selamat Datang di Aplikasi ini");
        } else {
            System.out.println("Ooops, Username atau Password anda salah");
        }
    }
    
    public void pengecekanLogin(String parUserName, String parPassword) {
        cekAkun(parUserName,parPassword);
        System.out.println();
        hasilLogin(statusAkun,parUserName);
    }
    
}