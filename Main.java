public class Main {
    public static void main(String[] args) {
        String s = "abaccdeeee";
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {

            int index = s.charAt(i) - 'a';
            freq[index]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.println((char) (i + 'a') + " " + freq[i]);
            }
        }
    }
}

// space complexity O(1);
// time complexity o(n)