import java.util.Scanner;

public class Password {

   static char digets[] = {'1','2','3','4','5','6','7','8','9','0'};
   static char characters[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','!','@','#','$','%','^','&','*','(',')','{','}',':','[',']','.',',','"','|','<','>','?','/','\\','~','-','_','=','+'};

   public static void main (String [ ] args) {
        Scanner by = new Scanner (System.in);

        System.out.print("please enter the password :");
        String password = by.nextLine();       
        boolean passwordStrength[] = cheackPassword(password);
        if(passwordStrength[0] && passwordStrength[1]){
                System.out.println("Your password is strong");
        }
        else if(passwordStrength[0] && !passwordStrength[1]){
                System.out.println("Your password is weak");
        }
        else if(!passwordStrength[0] && passwordStrength[1]){
                System.out.println("Your password is weak");
        }
        else {
                System.out.println("Your password is very weak");
        }
        by.close();
   }

 

    private static boolean[] cheackPassword(String password) {
            boolean strength[] = {false,false};//{digets,characters}
            if(password.length() < 4){
                    return strength;
            }

            for(char letter: password.toCharArray()){
                if(strength[0] && strength[1]){
                        return strength;
                }
                if(isDiget(letter)){
                        strength[0] = true;
                }
                if(isChar(letter)){
                        strength[1] = true;
                }
            }
            return strength;
    }



private static boolean isDiget(char letter) {
        for(int i = 0; i < digets.length; i++){
                if(letter == digets[i]){
                        return true;
                }
        }
        return false;
}   
private static boolean isChar(char letter) {
        for(int i = 0; i < characters.length; i++){
                if(letter == characters[i]){
                        return true;
                }
        }
        return false;
}                 
        
}