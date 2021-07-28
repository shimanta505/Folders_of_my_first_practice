public class UniqueCharacter {
    public static void main(String[] args) {

        String s ="aaaabbbbccccdddeeefffgghhh";



        for (char c ='a';c <= 'h';c++){

            for (int i = 0;i <s.length();i++){

                if (c == s.charAt(i)){
                    System.out.println(c);c++;
                }
            }
        }
    }
}
