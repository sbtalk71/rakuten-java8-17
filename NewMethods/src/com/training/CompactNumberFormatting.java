package com.training;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatting {

	public static void main(String[] args) {
		NumberFormat shortFormatNumber = NumberFormat.getCompactNumberInstance(new Locale("en", "US"),
				NumberFormat.Style.SHORT);

		shortFormatNumber.setMaximumFractionDigits(3);

		System.out.println(shortFormatNumber.format(23567));

		NumberFormat longFormatNumber = NumberFormat.getCompactNumberInstance(new Locale("en", "US"),
				NumberFormat.Style.LONG);

		longFormatNumber.setMaximumFractionDigits(3);

		System.out.println(longFormatNumber.format(23567));

	}

}
