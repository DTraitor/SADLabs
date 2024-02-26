package com.labwork2;

/**
 * GlyphObject class
 * <p>
 * This class is used to represent a single character on the screen.
 */
public class GlyphObject implements Glyph {
    /**
     * Constructor
     * @param x The x coordinate of the glyph
     * @param y The y coordinate of the glyph
     * @param c The character of the glyph
     */
    public GlyphObject(int x, int y, char c) {
        this.x = x;
        this.y = y;
        this.c = c;
    }

    /**
     * Get the x coordinate of the glyph
     * @return The x coordinate of the glyph
     */
    public int getX() {
        return x;
    }

    /**
     * Get the y coordinate of the glyph
     * @return The y coordinate of the glyph
     */
    public int getY() {
        return y;
    }

    /**
     * Get the character of the glyph
     * @return The character of the glyph
     */
    public char getChar() {
        return c;
    }

    /**
     * The x coordinate of the glyph
     */
    int x;
    /**
     * The y coordinate of the glyph
     */
    int y;
    /**
     * The character of the glyph
     */
    char c;
}
