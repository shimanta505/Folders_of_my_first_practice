public class Addmulti {
    public static void main(String[] args) {

        int[] number = {1, 2, 3, 44, 33, 23, 22, 444, 54, 66, 57};

        int add = 0;

        for (int i = 0; i < number.length; i++) {

            int addNumber = number[i];


            int math = addNumber % 2;

            if (math == 0) {

                add = add + number[i];
                System.out.println(add);



            }


        }
    }
}