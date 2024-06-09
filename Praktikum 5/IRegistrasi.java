//Nama  :Bisma Wira Adi Wicaksono
//Nim   :24060122140120


public interface IRegistrasi {

    boolean registrasiAkun(String username, String name, String phoneNumber, String email, String password);
  
    boolean registrasiGoogle(String email);
  
    boolean registrasiFacebook(String email);
  
    boolean registrasiApple(String email);
  }