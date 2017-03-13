package edu.macalester.comp124.hw3;

import comp124graphics.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

/**
 * Created by Administrator on 2017/3/2.
 */
public class PhotoWall extends CanvasWindow implements MouseListener,MouseMotionListener{
    private RectangleFramePicture rectangleFramePicture;
    private GraphicsObject dragging;
    private Point lastMouseLocation;


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

        addMouseListener(this);  // see mousePressed below (others do nothing)
        addMouseMotionListener(this);

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
        framePicture.addFlower(faceX,faceY,faceW,faceH);
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

    private void addRandomRectangleFrame(double x,double y){
        RectangleFramePicture frame=new RectangleFramePicture(x,y,300,200);
        frame.drawFrame(200,Color.green);
        this.add(frame);
        Random read=new Random();
        int check=read.nextInt(2);
        if (check==1){
            frame.addFlower(20,20,50,50);
        }else if(check==0){
            frame.addFace(20,20,50,50);
        }



    }

    private void addRandomOvalFrame(double x,double y){
        OvalFramePicture frame=new OvalFramePicture(x,y,300,200);
        frame.drawFrame(200,Color.red);
        this.add(frame);
        Random read=new Random();
        int check=read.nextInt(2);
        if (check==1){
            frame.addFlower(50,30,50,50);
        }else if(check==0){
            frame.addFace(20,20,50,50);
        }



    }


    @Override
    public void mouseClicked(MouseEvent e) {
        Point location=e.getPoint();
        double x = location.getX();
        double y = location.getY();
        GraphicsObject clicked = this.getElementAt(x, y);
        if (clicked==null){
           Random read=new Random();
           int check=read.nextInt(2);
           if (check==1){
               addRandomRectangleFrame(x,y);
           }else if(check==0){
               addRandomOvalFrame(x,y);

           }

        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
        lastMouseLocation = e.getPoint();
        dragging = getElementAt(lastMouseLocation.getX(), lastMouseLocation.getY());

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        lastMouseLocation = null;
        dragging = null;

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (dragging != null) {
            Point currentPosition = e.getPoint();
            double dx = currentPosition.getX() - lastMouseLocation.getX();
            double dy = currentPosition.getY() - lastMouseLocation.getY();
            dragging.move(dx, dy);
        }
        lastMouseLocation = e.getPoint();

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
