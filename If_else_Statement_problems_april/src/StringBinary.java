public class StringBinary {
    public static void main(String[] args) {
               //000111000010001;  0001000000; 10010001110001;
        String s = "0001000000";

        int count =0;
        int countNext =0;

        for (int i = 0;i < s.length()-1;i++){

            if (s.charAt(i)=='1' && s.charAt(i+1)=='0'){


                for(int j =i+1;j<s.length();j++){

                    if(s.charAt(j)=='1'){
                        count =(j-i)-1;
                        j =s.length()+1;
                    }
                }


            }
            if (count > countNext){
                countNext= count;
                count=0;
            }

        }
        System.out.println(countNext);












    }

}

