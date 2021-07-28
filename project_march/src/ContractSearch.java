public class ContractSearch {
    public static void main(String[] args) {
        String[] A = {"sander", "amy", "ann", "michael"};
        String[] B = {"123456789", "234567890", "789123456", "123123123"};

        String p = "1";

        for (int i = 0 ;i < B.length;i++){
            if (B[i].contains(p)){
                System.out.println(A[i]);
                System.out.println(B[i]);
            }
        }
    }
}
