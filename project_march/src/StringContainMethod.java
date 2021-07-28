public class StringContainMethod {
    public static void main(String[] args) {
        String[] phone = {"sander", "amy", "ann", "michael"};
        String[] number = {"123456789", "234567890", "789123456", "123123123"};
        String p = "1";
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < number.length; i++) {
                if (number[i].contains(p)) {
                    char result = phone[i].charAt(0);
                    if (result == c) {
                        System.out.println(phone[i]);
                        System.out.println(number[i]);
                    }
                }
            }
        }
    }
}
