package org.nerfoscar.arikeysredux.util;

import org.nerfoscar.arikeysredux.AriKey;

import java.util.Comparator;

public class KeyModifierComparator implements Comparator<AriKey> {
	/* Compare Keybinds based on their modifier count */
	public int compare(AriKey key1, AriKey key2) {
		return Integer.compare(key1.getBoundModifiers().size(), key2.getBoundModifiers().size());
	}
}
