package edu.macalester.comp124.hw3;

import activityStarterCode.TrainDrawer;
import activityStarterCode.graphicsGroupEx.Face;
import comp124graphics.*;
import comp124graphics.Image;
import comp124graphics.Rectangle;
import kluver.section1.inheritance.Flower;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2017/3/1.
 */
public class RectangleFramePicture extends Picture{

    private double x;
    private double y;

    /**
     * constructor of RectangleFramePicture
     * @param x position of graphics object
     * @param y y postiion of graphic object
     * @param width width of graphic object
     * @param height height of graphic object
     */
    public RectangleFramePicture(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    /**
     * draw frame which is a rectangle
     * @param frameWidth width in pixels of the frame
     * @param color      color of the frame
     */

    @Override
    public void drawFrame(float frameWidth, Color color) {
        Rectangle rectangle=new Rectangle(x,y,frameWidth,frameWidth);
        rectangle.setStrokeColor(color);
        this.add(rectangle);
    }

    /**
     * add picture to graphics object
     * @param x x position of picture
     * @param y y position of picture
     * @param filepath where to locate the picture
     */
    @Override
    public void addPicture(int x, int y, String filepath) {
        Image fb=new Image(x,y,filepath);
        this.add(fb);

    }
    /**
     *
     * @param x x position of the face
     * @param y y position of the face
     * @param width width of the face
     * @param height height of the face
     */
    public void addFlower(double x,double y,double width,double height){
        Flower flower=new Flower(x,y,width);
        this.add(flower);


    }
    public void addFace(double x,double y,double width,double height){
        Face face=new Face(x,y,width,height);
        this.add(face);
    }

}
