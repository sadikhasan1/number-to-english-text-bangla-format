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
        double numericValue = 12345.67;

        String bengaliDecimalText = NumberToBanglaWords.numberToBanglaText(numericValue, NumberToBanglaWords.FORMAT.BANGLA);

        System.out.println("Bengali Decimal Text: " + bengaliDecimalText);
    }
}
```

Output:
```
Bengali Decimal Text: বারো হাজার তিনশত পঁয়তাল্লিশ দশমিক সাতোষ্ঠি
```

### Example 2: Converting to English Currency Text

```java
public class Main {
    public static void main(String[] args) {
        double numericValue = 12345.67;

        String englishCurrencyText = NumberToBanglaWords.numberToBanglaText(numericValue, NumberToBanglaWords.FORMAT.ENGLISH, NumberToBanglaWords.NUMBER_DISPLAY.CURRENCY);

        System.out.println("English Currency Text: " + englishCurrencyText);
    }
}
```

Output:
```
English Currency Text: Twelve Thousand Three Hundred Forty-Five Taka Sixty-Seven Paisa
```

### Example 3: Converting with Default Format and Display

```java
public class Main {
    public static void main(String[] args) {
        double numericValue = 98765.43;

        String defaultText = NumberToBanglaWords.numberToBanglaText(numericValue);

        System.out.println("Default Text: " + defaultText);
    }
}
```

Output:
```
Default Text: নয়সয় হাজার সাতশত পঁয়ত্রিশ দশমিক চুরানব্বই
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
