package fract.lang;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Menu {
	private static final String BUNDLE_NAME = "fract.lang.menu"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private Menu() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
