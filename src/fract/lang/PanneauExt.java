package fract.lang;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class PanneauExt {
	private static final String BUNDLE_NAME = "fract.lang.panneauExt"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private PanneauExt() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
