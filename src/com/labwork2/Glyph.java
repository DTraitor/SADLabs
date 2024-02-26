package com.labwork2;

/**
 * Glyph interface
 * <p>
 * This interface is used to represent a single character on the screen.
 */
public interface Glyph {
    /**
     * Get the x coordinate of the glyph
     * @return The x coordinate of the glyph
     */
    int getX();

    /**
     * Get the y coordinate of the glyph
     * @return The y coordinate of the glyph
     */
    int getY();

    /**
     * Get the character of the glyph
     * @return The character of the glyph
     */
    char getChar();
}
