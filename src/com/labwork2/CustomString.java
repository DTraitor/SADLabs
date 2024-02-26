package com.labwork2;

import java.util.ArrayList;
import java.util.*;

/**
 * CustomString class
 * <p>
 * This class is used to store a list of Glyphs and draw them.
 */
public class CustomString {
    /**
     * Constructor
     */
    public CustomString() {
        this.glyphs = new ArrayList<>();
    }

    /**
     * Add a glyph to the list
     * @param glyph The glyph to add
     */
    public void add(Glyph glyph) {
        glyphs.add(glyph);
    }

    /**
     * Draw the glyphs
     */
    public void draw() {
        for (Glyph glyph : glyphs) {
            if (glyph != null) {
                System.out.print(glyph.getChar());
            }
        }
        System.out.println();
    }

    /**
     * The list of glyphs
     */
    private final List<Glyph> glyphs;
}
