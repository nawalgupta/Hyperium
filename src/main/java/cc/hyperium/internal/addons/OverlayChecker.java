package cc.hyperium.internal.addons;

import cc.hyperium.gui.main.HyperiumOverlay;
import cc.hyperium.internal.addons.misc.AddonLoadException;

public class OverlayChecker {
    /*
    in java because im bad at kotlin
     */
    public static void checkOverlayField(String value) throws AddonLoadException {
        try {
            Class<?> originClass = Class.forName(value);
            if (!originClass.isAssignableFrom(HyperiumOverlay.class)) {
                throw new AddonLoadException("overlay has to be an instance of HyperiumOverlay");
            }
        } catch (ClassNotFoundException e) {
            throw new AddonLoadException("Class " + value + " not found.");
        }
    }
}