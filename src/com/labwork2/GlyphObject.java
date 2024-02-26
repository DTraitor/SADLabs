package com.labwork2;

public class GlyphObject implements Glyph {
    public GlyphObject(int x, int y, char c) {
        this.x = x;
        this.y = y;
        this.c = c;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getChar() {
        return c;
    }

    int x;
    int y;
    char c;
}
