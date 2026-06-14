public class AuthSecure {
    private String masterPassword;
    private String password;

    AuthSecure(String password){
        this.password=hashPassword(password);

        // Default master password used for login verification
        this.masterPassword=hashPassword("sohaib@1234");
    }

    // Encrypts password before storing it
    public static String encrypt(String pass){

        String result = "";

        for(int i=0; i<pass.length(); i++){
            result += (char)(pass.charAt(i) + 10);
        }

        return result;
    }

    // Converts encrypted password back to original form
    public static String decrypt(String pass){

        String result = "";

        for(int i=0; i<pass.length(); i++){
            result += (char)(pass.charAt(i) - 10);
        }

        return result;
    }

    // Simple hash function used for master password verification
    public static String hashPassword(String pass){
        int hash =0;

        for(int i=0; i<pass.length(); i++){
            hash+=(int) pass.charAt(i)*(i+1);
        }

        return String.valueOf(hash);
    }

    public String getMasterPassword(){return masterPassword;}

    public String getPassword(){return password; }

    // Checks whether entered password matches master password
    public boolean verification(){
        return getPassword().equals(getMasterPassword());
    }
}