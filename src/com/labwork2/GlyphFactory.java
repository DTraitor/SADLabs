package com.labwork2;

import java.util.HashMap;
import java.util.Map;

public class GlyphFactory {
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

    static Map<String, Glyph> glyphs = new HashMap<>();
}
