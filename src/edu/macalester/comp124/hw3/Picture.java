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

        /**
     * Creates this GraphicsGroup, setting its x, y location (upper left)
     * and its width and height.
     *
     * @param x
     * @param y
     * @param width
     * @param height
     */
    public Picture(double x, double y, double width, double height) {
        super(x,y);
        this.width = width;
        this.height = height;
    }
    /**
     *  This draws a frame on the outer edge of the picture.
     *
     * @param frameWidth width in pixels of the frame
     * @param color      color of the frame
     */
    public abstract void drawFrame(float frameWidth, Color color);

    public abstract void addPicture(int x,int y,String string);



}
