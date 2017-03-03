package edu.macalester.comp124.hw3;

import activityStarterCode.graphicsGroupEx.Face;
import comp124graphics.*;

import java.awt.*;
import java.awt.Image;

/**
 * Created by Administrator on 2017/3/2.
 */
public class OvalFramePicture extends Picture {
    private double x;
    private double y;

    /**
     * Constructor for ovalframepicture
     * @param x x position of graphics object
     * @param y y postiion of graphic object
     * @param width width of graphic object
     * @param height height of graphic object
     */
    public OvalFramePicture(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    /**
     * draw frame which is a oval
     * @param frameWidth width in pixels of the frame
     * @param color      color of the frame
     */
    @Override
    public void drawFrame(float frameWidth, Color color) {
        Ellipse oval=new Ellipse(x,y,150,frameWidth);
        oval.setStrokeColor(color);
        this.add(oval);

    }

    /**
     * add picture to graphics object
     * @param x x position of picture
     * @param y y position of picture
     * @param filepath where to locate the picture
     */
    @Override
    public void addPicture(int x, int y, String filepath) {
        comp124graphics.Image fb=new comp124graphics.Image(x,y,filepath);
        this.add(fb);

    }

    /**
     *
     * @param x x position of the face
     * @param y y position of the face
     * @param width width of the face
     * @param height height of the face
     */
    public void addFace(double x,double y,double width,double height){
        Face face=new Face(x,y,width,height);
        this.add(face);
    }
}
