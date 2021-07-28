public class Keyboard_String {
    public static void main(String[] args) {

        String keyboard ="abcdefghijklmnopqrstuvwxyz";
        String search ="cba";
        int result =0;


        for (int i = 0;i <search.length();i++){

            for (int j =0;j <keyboard.length();j++){
                if (search.charAt(i)==keyboard.charAt(j)){
                    result+=j;
                    j=keyboard.length();
                }
            }


        }
        System.out.println(result);
    }
}
