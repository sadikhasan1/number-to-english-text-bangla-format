

public class NumberToBanglaWords {

    private static final String[] BANGLA_ONES = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
            "Nine" };

    private static final String[] BANGLA_TEENS = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

    private static final String[] BANGLA_TENS = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
            "Eighty", "Ninety" };

    private static final String[] BANGLA_THOUSANDS = { "", "Thousand", "Lakh", "Crore", "Arab", "Kharab", "Neel",
            "Padma", "Shankh", "Maha Shankh" };



    private static String convertLessThanThousand(int num) {
        if (num == 0) {
            return "";
        } else if (num < 10) {
            return BANGLA_ONES[num] + " ";
        } else if (num < 20) {
            return BANGLA_TEENS[num - 10] + " ";
        } else if (num < 100) {
            return BANGLA_TENS[num / 10] + " " + BANGLA_ONES[num % 10] + " ";
        } else {
            return BANGLA_ONES[num / 100] + " Hundred " + convertLessThanThousand(num % 100);
        }
    }

    public static void main(String[] args) {
        String inputString = "111111111122222222233333";

        String hundredCroreWord = hundredCroreLoop(inputString);
        System.out.println(hundredCroreWord);

        String mahaSankh = mahaSankhLoop(inputString);
        System.out.println(mahaSankh);

    }

    public static String convertToString(Object numericValue) {
        return String.valueOf(numericValue);
    }

    private static String hundredCroreLoop(String inputString) {
        String words = "";
        int[] pattern = { 2, 2, 3 };

        int currentIndex = inputString.length();

        boolean isCroreEnabled = false;
        while (currentIndex > 0) {
            int index = 0;
            for (int i = pattern.length - 1; i >= 0; i--) {
                int length = pattern[i];
                if (currentIndex - length >= 0) {
                    String substring = inputString.substring(currentIndex - length, currentIndex);
                    int number = Integer.parseInt(substring);
                    if (isCroreEnabled && i == pattern.length - 1) {
                        words = convertLessThanThousand(number) + BANGLA_THOUSANDS[index] + BANGLA_THOUSANDS[3] + " "
                                + words;

                    } else {
                        words = convertLessThanThousand(number) + BANGLA_THOUSANDS[index] + " " + words;

                    }

                    currentIndex -= length;
                    index++;

                } else {
                    break;
                }
            }

            isCroreEnabled = true;

        }
        return words;
    }

    private static String mahaSankhLoop(String inputString) {
        String words = "";
        int[] pattern = { 2, 2, 2, 2, 2, 2, 2, 2, 3 }; // Define the pattern

        int currentIndex = inputString.length();

        boolean isMahaSankhEnabled = false;
        while (currentIndex > 0) {
            int index = 0;
            for (int i = pattern.length - 1; i >= 0; i--) {
                int length = pattern[i];
                if (currentIndex - length >= 0) {
                    String substring = inputString.substring(currentIndex - length, currentIndex);
                    int number = Integer.parseInt(substring);

                    if (isMahaSankhEnabled && i == pattern.length - 1) {
                        words = convertLessThanThousand(number) + BANGLA_THOUSANDS[index] + BANGLA_THOUSANDS[9] + " "
                                + words;

                    } else {
                        words = convertLessThanThousand(number) + BANGLA_THOUSANDS[index] + " " + words;

                    }

                    currentIndex -= length;
                    index++;

                } else {
                    break;
                }
            }

            isMahaSankhEnabled = true;

        }
        return words;
    }
}
