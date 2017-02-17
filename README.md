Comp 124 - Homework #3 : A Picture Wall
===

# Overview

Your goal is to create a CanvasWindow that simulates a wall of 
framed pictures. Each picture will be its own GraphicsGroup
that you will place on the canvas in any way that you wish.

## Requirements

1. You are given one abstract class called Picture, which extends GraphicsGroup. 
You should use it.
2. You must make a minimum of 2 subclasses of Picture:
    a. OvalFramePicture, whose shape is an oval with an oval frame.
    b. RectangleFramePicture, whose shape is a Rectangle
3. You should make a class called PhotoWall the extends CanvasWindow. 
4. Your PhotoWall CanvasWindow wall must contain a minimum of 4 pictures of varying sizes-
at least 2 OvalFramePicture objects and 2 RectanglePicture objects.
5. Each of your pictures must contain at least one object of type GraphicsGroup, such as the
Face from the class activity, or the Train, or other simple drawings of some kind, such as flags-
this is your chance to be creative.
6. Your main application class, called PictureApplication, should create a new
PhotoWall in its main() method.

### Suggestions for completing the assignment.

Since you have a Picture class that must have subclasses, a good place to start is to
make one of its subclasses, such as RectangleFramePicture. Notice that you must create
a method called drawFrame that is abstract in Picture. You do not need to put anything in 
the RectangleFramePicture except the Frame- since it is a GraphicsGroup, you can add
the instance of a Face or something else later.

Once you have one of the subclasses of Picture, now work on PhotoWall, which should extend
CanvasWindow. Make a method that is called from the constructor and does the following:
- Create an instance of RectanglePictureFrame and add it to the PhotoWall;
- add graphical elements to that instance of RectanglePictureFrame.

Make your PictureApplication class with a very simple main() that creates an instance of your
PhotoWall.

Make sure that you can change the size of your picture and properly display it on the
PhotoWall.

If this seems to work, you can then move on to creating other different kinds of Picture
class instances with different GraphicsGroup objects in them, using the same process as 
described above.

### Submit your asssignment.
1. Commit your changes: Select the 124-hw3 module, right click, and select Git -> Commit Directory.
2. You should see all the source files you changed with a checkmark in the popup.
3. Change the "commit" button to "commit and push" in the lower righthand corner.
4. Write an appropriate message in the comment box.
5. IMPORTANT: Select *"commit and push"* (not just commit) in the lower right.
6. Select "push" to send your changes to GitHub.
7. IntelliJ should say "push successful"
8. Visit your github site in your web browser to make sure the changes you made were pushed correctly.
