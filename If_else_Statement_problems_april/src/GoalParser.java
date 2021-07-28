public class GoalParser {
    public static void main(String[] args) {
        String s ="G()()(al)";

        for(int i = 0;i < s.length();i++){

            if (s.charAt(i) == 'G'){
                System.out.print("G");
            }
            else if(s.charAt(i) == '(' && s.charAt(i+1) == ')'){
                System.out.print("o");
                i+=1;
            }
            else if (s.charAt(i) == '(' && s.charAt(i+1) == 'a'){
                System.out.print("al");
                i+=3;
            }
        }
    }
}
