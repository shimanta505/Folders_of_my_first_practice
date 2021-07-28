import javax.imageio.spi.IIORegistry;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class PhoneCall {
    public static void main(String[] args) {

        String[] phone = {"sander", "amy", "ann", "michael"};
        String[] number = {"123456789", "234567890", "789123456", "123123123"};

        Scanner yesOrNo = new Scanner(System.in);
        System.out.println("enter your name");
        String first = yesOrNo.nextLine();

        for (char c = 'a'; c <= 'z'; c++) {

            for (int i = 0; i < number.length; i++) {

                char result = phone[i].charAt(0);

                if (number[i].contains(first)) {
                    // char result = phone[i].charAt(0);
                    if (result == c) {
                        System.out.println(phone[i]);
                        System.out.println(number[i]);
                    }
                }   else if (phone[i].contains(first)) {
                             if (result == c) {
                        System.out.println(phone[i]);
                        System.out.println(number[i]); }
                }
            }
        }
    }
}











