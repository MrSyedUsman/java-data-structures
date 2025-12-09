public class GenericPalindrome {
    public static boolean isPalindrome(String input) {
        // Remove everything except letters and numbers, convert to lowercase
        String cleaned = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        int start = 0;
        int end = cleaned.length() - 1;

        while (start < end) {
            if (cleaned.charAt(start) != cleaned.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String text1 = "A man, a plan, a canal: Panama";
        String text2 = "Java";
        String text3 = "1221";

        System.out.println(text1 + " → " + isPalindrome(text1));
        System.out.println(text2 + " → " + isPalindrome(text2));
        System.out.println(text3 + " → " + isPalindrome(text3));
    }
}
