public class NumberToBanglaWords {
    private static final String[] BANGLA_ONES = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
            "Nine" };

    private static final String[] TEENS = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen" };

    private static final String[] TENS = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
            "Ninety" };

    private static final String[] ENGLISH_NUMBER_UNITS = { "", "Thousand", "Lakh", "Crore", "Arab", "Kharab", "Neel",
            "Padma", "Shankh", "Padra", "Kharab", "Shankh", "Kuti", "Kharab", "Shankh", "Mahashankh" };

    private static final String[] BENGALI_ZERO_TO_HUNDRED = { "শূন্য", "এক", "দুই", "তিন", "চার", "পাঁচ", "ছয়", "সাত",
            "আট", "নয়", "দশ", "এগারো", "বারো", "তেরো", "চৌদ্দ", "পনেরো", "ষোল", "সতেরো", "আঠারো", "ঊনিশ", "বিশ",
            "একুশ", "বাইশ", "তেইশ", "চব্বিশ", "পঁচিশ", "ছাব্বিশ", "সাতাশ", "আটাশ", "ঊনত্রিশ", "ত্রিশ", "একত্রিশ",
            "বত্রিশ", "তেত্রিশ", "চৌত্রিশ", "পঁয়ত্রিশ", "ছত্রিশ", "সাঁইত্রিশ", "আটত্রিশ", "ঊনচল্লিশ", "চল্লিশ",
            "একচল্লিশ", "বিয়াল্লিশ", "তেতাল্লিশ", "চুয়াল্লিশ", "পঁয়তাল্লিশ", "ছেচল্লিশ", "সাতচল্লিশ", "আটচল্লিশ",
            "ঊনপঞ্চাশ", "পঞ্চাশ", "একান্ন", "বায়ান্ন", "তিপ্পান্ন", "চুয়ান্ন", "পঞ্চান্ন", "ছাপ্পান্ন", "সাতান্ন",
            "আটান্ন", "ঊনষাট", "ষাট", "একষট্টি", "বাষট্টি", "তেষট্টি", "চৌষট্টি", "পঁয়ষট্টি", "ছেষট্টি", "সাতষট্টি",
            "আটষট্টি", "ঊনসত্তর", "সত্তর", "একাত্তর", "বাহাত্তর", "তিয়াত্তর", "চুয়াত্তর", "পঁচাত্তর", "ছিয়াত্তর",
            "সাতাত্তর", "আটাত্তর", "ঊননব্বই", "নব্বই", "একানব্বই", "বিরানব্বই", "তিরানব্বই", "চুরানব্বই", "পঁচানব্বই",
            "ছিয়ানব্বই", "সাতানব্বই", "আটানব্বই", "ঊননব্বই", "নব্বই", "একানব্বই", "বিরানব্বই", "তিরানব্বই", "চুরানব্বই", "পঁচানব্বই", "ছিয়ানব্বই", "সাতানব্বই", "আটানব্বই", "নিরানব্বই" };

    private static final String[] BENGALI_NUMBER_UNITS = { "", "হাজার", "লক্ষ", "কোটি", "অবলম্ব", "পদ্ম", "নিয়োগ",
            "কয়লা", "পড়া", "কোটি", "অবকড়া", "শঙ্খ", "খরব", "অবখরব", "নিকুল", "পদ্মিনী", "শঙ্খ", "মহাশঙ্খ" };

    private static String convertLessThanThousandToWords(int num, String[] units) {
        if (units == BENGALI_NUMBER_UNITS) {
            return convertLessThanThousandToBangla(num);
        } else {
            return convertLessThanThousand(num);
        }
    }

    private static String convertLessThanThousandToBangla(int num) {
        if (num == 0) {
            return "";
        } else if (num < 100) {
            return BENGALI_ZERO_TO_HUNDRED[num] + " ";
        } else {
            return BENGALI_ZERO_TO_HUNDRED[num / 100] + " শত " + convertLessThanThousandToBangla(num % 100);
        }
    }

    private static String convertLessThanThousand(int num) {
        if (num == 0) {
            return "";
        } else if (num < 10) {
            return BANGLA_ONES[num] + " ";
        } else if (num < 20) {
            return TEENS[num - 10] + " ";
        } else if (num < 100) {
            return TENS[num / 10] + " " + BANGLA_ONES[num % 10] + " ";
        } else {
            return BANGLA_ONES[num / 100] + " Hundred " + convertLessThanThousand(num % 100);
        }
    }

    public static void main(String[] args) {
        String inputString = "111111111122222222223333333333444444444444445555555555566666666666677777777778888888889999999999";

        String hundredCroreWord = hundredCroreLoop(inputString);
        System.out.println(hundredCroreWord);

        String mahaSankh = mahaSankhLoop(inputString);
        System.out.println(mahaSankh);

        String hundredCroreWordBangla = hundredCroreLoopBangla(inputString);
        System.out.println(hundredCroreWordBangla);

        String mahaSankhBangla = mahaSankhLoopBangla(inputString);
        System.out.println(mahaSankhBangla);
    }

    public static String convertToString(Object numericValue) {
        return String.valueOf(numericValue);
    }

    private static String convertNumberToWords(int[] pattern, String[] units, String inputString) {
        String words = "";
        int currentIndex = inputString.length();
        boolean isUnitEnabled = false;

        while (currentIndex > 0) {
            int index = 0;
            for (int i = pattern.length - 1; i >= 0; i--) {
                int length = pattern[i];
                if (currentIndex - length >= 0) {
                    String substring = inputString.substring(currentIndex - length, currentIndex);
                    int number = Integer.parseInt(substring);

                    if (isUnitEnabled && i == pattern.length - 1) {
                        words = convertLessThanThousandToWords(number, units) + units[index] + units[pattern.length]
                                + " " + words;
                    } else {
                        words = convertLessThanThousandToWords(number, units) + units[index] + " " + words;
                    }

                    currentIndex -= length;
                    index++;
                } else {
                    break;
                }
            }
            isUnitEnabled = true;
        }
        return words;
    }

    private static String hundredCroreLoop(String inputString) {
        int[] pattern = { 2, 2, 3 };
        return convertNumberToWords(pattern, ENGLISH_NUMBER_UNITS, inputString);
    }

    private static String mahaSankhLoop(String inputString) {
        int[] pattern = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        return convertNumberToWords(pattern, ENGLISH_NUMBER_UNITS, inputString);
    }

    private static String hundredCroreLoopBangla(String inputString) {
        int[] pattern = { 2, 2, 3 };
        return convertNumberToWords(pattern, BENGALI_NUMBER_UNITS, inputString);
    }

    private static String mahaSankhLoopBangla(String inputString) {
        int[] pattern = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        return convertNumberToWords(pattern, BENGALI_NUMBER_UNITS, inputString);
    }

}
