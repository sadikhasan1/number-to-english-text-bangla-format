# Number to Words Converter (English and Bangla)

## Overview

This Java utility provides a flexible and efficient solution for converting numerical values into their corresponding word representations, supporting both English and Bangla languages. The code employs modular and well-organized methods, enabling seamless handling of different numeric inputs and language preferences. The utility also offers various formats for presenting the converted words.

## Features

- Conversion of numeric values into words in English and Bangla languages.
- Support for traditional and legacy Bengali numeric formats.
- Flexibility to choose between English and Bangla language outputs.
- Modular design for easy integration into other projects.

## Usage

To use this utility, follow these steps:

1. Clone or download the project repository.
2. Open your Java development environment.
3. Import the `NumberToBanglaWords.java` class into your project.

## API Reference

### `numberToBanglaText(Object numericValue, FORMAT format)`

Converts a numeric value into its word representation based on the specified format.

- `numericValue`: The numeric value to convert.
- `format`: The desired format (`FORMAT.BANGLA`, `FORMAT.BANGLA_LEGACY`, `FORMAT.ENGLISH`, `FORMAT.ENGLISH_LEGACY`).

### `numberToBanglaText(Object numericValue)`

Converts a numeric value into its word representation in traditional Bengali format (English language).

## Supported Formats

- `FORMAT.BANGLA`: Converts to modern Bengali numeric format.
- `FORMAT.BANGLA_LEGACY`: Converts to legacy Bengali numeric format.
- `FORMAT.ENGLISH`: Converts to English numeric format.
- `FORMAT.ENGLISH_LEGACY`: Converts to legacy English numeric format.

## Examples

```java
String input = "123456789";
String englishWords = NumberToBanglaWords.numberToBanglaText(input, FORMAT.ENGLISH);
System.out.println("English: " + englishWords);

String bengaliWords = NumberToBanglaWords.numberToBanglaText(input, FORMAT.BANGLA);
System.out.println("Bengali: " + bengaliWords);
```

## Contribution

Contributions, bug reports, and suggestions are welcome. Feel free to submit issues or pull requests on GitHub.

## License

This project is licensed under the [MIT License](LICENSE).

---

*Refer to the inline comments in the code for more detailed explanations and insights.*
