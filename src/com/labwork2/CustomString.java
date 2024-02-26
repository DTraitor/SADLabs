package com.labwork2;

import java.util.ArrayList;
import java.util.List;

public class CustomString {
    public CustomString() {
        this.glyphs = new ArrayList<>();
    }

    public void add(Glyph glyph) {
        glyphs.add(glyph);
    }

    public void draw() {
        for (Glyph glyph : glyphs) {
            if (glyph != null) {
                System.out.print(glyph.getChar());
            }
        }
        System.out.println();
    }

    private final List<Glyph> glyphs;
}
