package com.labwork2;

public class Main {
    public static void main(String[] args) {
        CustomString customString = new CustomString();
        customString.add(GlyphFactory.getGlyph(0, 0, 'H'));
        customString.add(GlyphFactory.getGlyph(1, 0, 'e'));
        customString.add(GlyphFactory.getGlyph(2, 1, 'l'));
        customString.add(GlyphFactory.getGlyph(2, 1, 'l'));
        customString.add(GlyphFactory.getGlyph(3, 4, 'o'));
        customString.add(GlyphFactory.getGlyph(5, 0, ','));
        customString.add(GlyphFactory.getGlyph(6, 0, ' '));
        customString.add(GlyphFactory.getGlyph(7, 0, 'w'));
        customString.add(GlyphFactory.getGlyph(3, 4, 'o'));
        customString.add(GlyphFactory.getGlyph(9, 0, 'r'));
        customString.add(GlyphFactory.getGlyph(2, 1, 'l'));
        customString.add(GlyphFactory.getGlyph(11, 0, 'd'));
        customString.draw();
    }
}