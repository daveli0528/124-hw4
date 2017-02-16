package edu.macalester.comp124.hw3;

import comp124graphics.GraphicsGroup;

import java.awt.*;

/**
 * This is the parent class for objects that are like pictures with frames
 * that would be placed on a virtual wall of photos.
 *
 * Created by shoop on 2/14/17.
 */
public abstract class Picture extends GraphicsGroup {
    protected double width;
    protected double height;
    protected double frameWidth;

    // may not need this since a GG can be added to this GG
    // if use this, perhaps override add in this class to first set this variable
    private GraphicsGroup scene; // The set of graphics that will be in this picture

    public Picture(double x, double y, double width, double height) {
        super(x,y);
        this.width = width;
        this.height = height;
    }

    public abstract void drawFrame(float frameWidth, Color color);

}
