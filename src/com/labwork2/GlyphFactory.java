package com.labwork2;

import java.util.HashMap;
import java.util.*;

/**
 * GlyphFactory class
 * <p>
 * This class is used to create and store Glyphs.
 */
public class GlyphFactory {
    /**
     * Get a glyph
     * @param x The x coordinate of the glyph
     * @param y The y coordinate of the glyph
     * @param c The character of the glyph
     * @return The glyph
     */
    static Glyph getGlyph(int x, int y, char c) {
        String key = x + "|" + y + "|" + c;
        if (glyphs.containsKey(key)) {
            return glyphs.get(key);
        } else {
            Glyph glyph = new GlyphObject(x, y, c);
            glyphs.put(key, glyph);
            return glyph;
        }
    }

    /**
     * The map of glyphs
     */
    static Map<String, Glyph> glyphs = new HashMap<>();
}
