//Nama  :Bisma Wira Adi Wicaksono
//Nim   :24060122140120

public class UserUseCase extends UserRepository {
    public void loginUser(String username, String password){
        if(username == "Pandowo" && password =="PBO"){
            System.out.print("SELAMAT DATANG PANDOWO !!");
        } else {
            System.out.print("USERNAME ATAU PASSWORD SALAH !!");
        }
    }

    public void logoutUser(){
        System.out.print("TERIMAKASIH");
    }
}