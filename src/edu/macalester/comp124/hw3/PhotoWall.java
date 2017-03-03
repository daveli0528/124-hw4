package edu.macalester.comp124.hw3;

import comp124graphics.CanvasWindow;

import java.awt.*;

/**
 * Created by Administrator on 2017/3/2.
 */
public class PhotoWall extends CanvasWindow {
    private RectangleFramePicture rectangleFramePicture;


    /**
     * constructor of photowall
     * @param title title pf the photowall
     * @param windowWidth width of the photowall window
     * @param windowHeight height of the photowall window
     */
    public PhotoWall(String title, int windowWidth, int windowHeight) {
        super(title, windowWidth, windowHeight);
        addRectangleFrame(0,0,100,50,200,Color.black,50,25,
                "C:\\Users\\Administrator\\IdeaProjects\\124-hw3\\src\\edu\\macalester\\comp124\\hw3\\Logo.png",0,0,100,100);
        addOvalFrame(500,500,100,20,200,Color.green,30,30,
                "C:\\Users\\Administrator\\IdeaProjects\\124-hw3\\src\\edu\\macalester\\comp124\\hw3\\head.png",20,20,100,100);

        addRectangleFrame(500,0,100,50,200,Color.blue,50,25,
                "C:\\Users\\Administrator\\IdeaProjects\\124-hw3\\src\\edu\\macalester\\comp124\\hw3\\io.png",60,40,100,100 );

        addOvalFrame(0,500,100,20,200,Color.red,30,30,
                "C:\\Users\\Administrator\\IdeaProjects\\124-hw3\\src\\edu\\macalester\\comp124\\hw3\\Mario.png",20,20,100,100);

    }

    /**
     * add rectangleframe to photowall
     * @param x x position of the frame
     * @param y y position of the frame
     * @param width width of of the rectangle
     * @param height height of the rectangle
     * @param frameWidth width of the frame
     * @param color color of the frame
     * @param xpo x position of the picture
     * @param ypo y position of the picture
     * @param filepath where to locate the picture
     * @param faceX x position of the face object
     * @param faceY y position of the face object
     * @param faceW width of the face object
     * @param faceH height of the object
     */
    private void addRectangleFrame(double x, double y, double width, double height,float frameWidth, Color color,int xpo, int ypo, String filepath,
                                   double faceX,double faceY,double faceW,double faceH){
        RectangleFramePicture framePicture=new RectangleFramePicture(x,y,width,height);
        framePicture.drawFrame(frameWidth,color);
        this.add(framePicture);
        framePicture.addPicture(xpo,ypo,filepath);
        framePicture.addFace(faceX,faceY,faceW,faceH);
    }

    /**
     * add ovalframe to photowall
     * @param x x position of the frame
     * @param y y position of the frame
     * @param width width of of the oval
     * @param height height of the oval
     * @param frameWidth width of the frame
     * @param color color of the frame
     * @param xpo x position of the picture
     * @param ypo y position of the picture
     * @param filepath where to locate the picture
     * @param faceX x position of the face object
     * @param faceY y position of the face object
     * @param faceW width of the face object
     * @param faceH height of the object
     */
    private void addOvalFrame(double x, double y, double width, double height,float frameWidth, Color color,int xpo, int ypo, String filepath,
                              double faceX,double faceY,double faceW,double faceH){
        OvalFramePicture framePicture=new OvalFramePicture(x,y,width,height);
        framePicture.drawFrame(frameWidth,color);
        this.add(framePicture);
        framePicture.addPicture(xpo,ypo,filepath);
        framePicture.addFace(faceX,faceY,faceW,faceH);
    }





}
