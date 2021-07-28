public class Palindrome_8 {
    public static void main(String[] args) {

        String name ="shimanta";
       // String name ="meem";
        String newName ="";


        for (int i = name.length()-1;i >=0;i--){
            newName+=name.charAt(i);
        }
       // System.out.println(newName);

        if (name.equals(newName)){
            System.out.println("this is a palindrome ");
        }else{
            System.out.println("this is not a palindrome ");
        }
    }
}
