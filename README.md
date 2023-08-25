# NumberToBanglaWords

`NumberToBanglaWords` is a Java class that provides methods to convert numeric values into their equivalent textual representation in Bengali and English languages. It supports both traditional and legacy formats for representing numbers.

## Usage

You can use the provided methods to convert numeric values into text. The class offers the following conversion options:

1. Convert a numeric value to its Bengali or English representation in decimal form.
2. Convert a numeric value to its Bengali or English representation in currency format (Taka and Paisa).

### Import

```java
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.stream.Collectors;
```

### Convert Numeric Values

```java
// Convert a numeric value to its Bengali representation in decimal form
String bengaliDecimalText = NumberToBanglaWords.numberToBanglaText(numericValue, NumberToBanglaWords.FORMAT.BANGLA);

// Convert a numeric value to its English representation in currency format
String englishCurrencyText = NumberToBanglaWords.numberToBanglaText(numericValue, NumberToBanglaWords.FORMAT.ENGLISH, NumberToBanglaWords.NUMBER_DISPLAY.CURRENCY);
```

## Supported Formats

The class supports the following formats:

- `FORMAT.BANGLA`: Traditional Bengali numeric representation.
- `FORMAT.BANGLA_LEGACY`: Legacy Bengali numeric representation.
- `FORMAT.ENGLISH`: Traditional English numeric representation.
- `FORMAT.ENGLISH_LEGACY`: Legacy English numeric representation.

## Supported Number Displays

The class supports the following number displays:

- `NUMBER_DISPLAY.DECIMAL`: Decimal representation.
- `NUMBER_DISPLAY.CURRENCY`: Currency representation.

## Notes

- The class uses various arrays to map numeric values to their textual representations in both Bengali and English.
- Conversion to currency format includes Taka and Paisa.

## Example


### Example 1: Converting to Bengali Decimal Text

```java
public class Main {
    public static void main(String[] args) {
        BigDecimal numericBigDecimal = new BigDecimal("-62.67345");
        String bengaliDecimalText = NumberToBanglaWords.numberToBanglaText(numericBigDecimal,
                NumberToBanglaWords.FORMAT.BANGLA);
        System.out.println("Bengali Decimal Text: " + bengaliDecimalText);
    }
}
```

Output:
```
Bengali Decimal Text: ঋণাত্মক বাষট্টি দশমিক ছয় সাত তিন চার পাঁচ
```

### Example 2: Converting to English Currency Text

```java
public class Main {
    public static void main(String[] args) {
        String numericString = "12345.07675";
        String englishCurrencyText = NumberToBanglaWords.numberToBanglaText(numericString,
                NumberToBanglaWords.FORMAT.ENGLISH, NumberToBanglaWords.NUMBER_DISPLAY.CURRENCY);
        System.out.println("English Currency Text: " + englishCurrencyText);
    }
}
```

Output:
```
English Currency Text: Twelve Thousand Three Hundred Forty Five Taka Eight Paisa
```

### Example 3: Converting with Default Format and Display

```java
public class Main {
    public static void main(String[] args) {
        double numericDouble = 0.43234;
        String defaultText = NumberToBanglaWords.numberToBanglaText(numericDouble);
        System.out.println("Default Text: " + defaultText);
    }
}
```

Output:
```
Default Text: Zero Point Four Three Two Three Four
```

### Example 4: Buckle up! Let's get crazy. This code can handle pretty much any number. Let's try it out!

```java
public class Main {
    public static void main(String[] args) {
        String input = "123456789987654321123456789987654321123456789987654321123456789987654321123456789987654321123456789987654321123456789987654321123456789987654321123456789987654321123456789987654321123456789987654321123456789987654321";
        String englishWords = NumberToBanglaWords.numberToBanglaText(input, FORMAT.ENGLISH);
        System.out.println("English: " + englishWords);
}
```

Output:
```
English: One Lakh Twenty Three Thousand Four Hundred Fifty Six Crore Seventy Eight Lakh Ninety Nine Thousand Eight Hundred Seventy Six Crore Fifty Four Lakh Thirty Two Thousand One Hundred Twelve Crore Thirty Four Lakh Fifty Six Thousand Seven Hundred Eighty Nine Crore Ninety Eight Lakh Seventy Six Thousand Five Hundred Forty Three Crore Twenty One Lakh Twelve Thousand Three Hundred Forty Five Crore Sixty Seven Lakh Eighty Nine Thousand Nine Hundred Eighty Seven Crore Sixty Five Lakh Forty Three Thousand Two Hundred Eleven Crore Twenty Three Lakh Forty Five Thousand Six Hundred Seventy Eight Crore Ninety Nine Lakh Eighty Seven Thousand Six Hundred Fifty Four Crore Thirty Two Lakh Eleven Thousand Two Hundred Thirty Four Crore Fifty Six Lakh Seventy Eight Thousand Nine Hundred Ninety Eight Crore Seventy Six Lakh Fifty Four Thousand Three Hundred Twenty One Crore Twelve Lakh Thirty Four Thousand Five Hundred Sixty Seven Crore Eighty Nine Lakh Ninety Eight Thousand Seven Hundred Sixty Five Crore Forty Three Lakh Twenty One Thousand One Hundred Twenty Three Crore Forty Five Lakh Sixty Seven Thousand Eight Hundred Ninety Nine Crore Eighty Seven Lakh Sixty Five Thousand Four Hundred Thirty Two Crore Eleven Lakh Twenty Three Thousand Four Hundred Fifty Six Crore Seventy Eight Lakh Ninety Nine Thousand Eight Hundred Seventy Six Crore Fifty Four Lakh Thirty Two Thousand One Hundred Twelve Crore Thirty Four Lakh Fifty Six Thousand Seven Hundred Eighty Nine Crore Ninety Eight Lakh Seventy Six Thousand Five Hundred Forty Three Crore Twenty One Lakh Twelve Thousand Three Hundred Forty Five Crore Sixty Seven Lakh Eighty Nine Thousand Nine Hundred Eighty Seven Crore Sixty Five Lakh Forty Three Thousand Two Hundred Eleven Crore Twenty Three Lakh Forty Five Thousand Six Hundred Seventy Eight Crore Ninety Nine Lakh Eighty Seven Thousand Six Hundred Fifty Four Crore Thirty Two Lakh Eleven Thousand Two Hundred Thirty Four Crore Fifty Six Lakh Seventy Eight Thousand Nine Hundred Ninety Eight Crore Seventy Six Lakh Fifty Four Thousand Three Hundred Twenty One
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
