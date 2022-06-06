import java.awt.*;
import java.awt.event.*;

public class ColorDemo extends Frame {

public ColorDemo() {
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
}

// Draw in different colors.
public void paint(Graphics g)
 {




g.setColor(Color.yellow);
g.fillRect(60, 200, 200, 120);



g.setColor(Color.blue);
g.fillRect(140, 270, 50, 50);



}

public static void main(String[] args) {
ColorDemo appwin = new ColorDemo();

appwin.setSize(new Dimension(340, 260));
appwin.setTitle("ColorDemo");
appwin.setVisible(true);
}
}













/*2. Using 2D graphics commands in an Applet, construct a house.
On mouse click event, change the color of the door from blue to
red.*/
import java.awt.event.*;
import java.awt.*;

public class Home extends Frame 
implements MouseListener, MouseMotionListener{



public Home() {
addMouseListener(this);
addMouseMotionListener(this);
addWindowListener(new MyWindowAdapter());
}


public Color wind =Color.blue;

public void mouseClicked(MouseEvent me) {
    if(wind ==Color.blue){

        wind =Color.RED;

    }
    else if(wind ==Color.RED){
        wind =Color.blue;

    }

repaint();
}

public void mouseEntered(MouseEvent me) {
    //wind =Color.green;
    //repaint();
}
public void mouseExited(MouseEvent me) {
    //wind =Color.yellow;
    //repaint();
}
public void mousePressed(MouseEvent me) {

}
public void mouseReleased(MouseEvent me) {
}
public void mouseDragged(MouseEvent me) {
}

public void mouseMoved(MouseEvent me){
}

public void paint(Graphics g) {



// Draw a polygon
int xpoints[] = {150, 300, 450};
int ypoints[] = {250, 180, 250};
int num = 3;
g.setColor(Color.black);
g.fillPolygon(xpoints, ypoints, num);
g.setColor(Color.cyan);
g.fillRect(160,250, 280, 150);
g.setColor(wind);
g.fillRect(270,300, 60, 100);
g.setColor(Color.orange);
//g.drawLine(300, 180, 700, 180);
//g.drawLine(700, 180, 750, 250);
//g.drawLine(450, 250,750, 250);
g.fillRect(440,250,285,150);
//g.drawLine(725, 250, 725, 400);
//g.drawLine(725, 400, 440, 400);
g.setColor(Color.gray);
int x1points[]= {450, 300, 700, 750};
int y1points[]= {250, 180, 180, 250};
int num1=4;
g.fillPolygon(x1points, y1points, num1);

g.setColor(Color.gray);
g.fillRect(511,287,143,80);
g.setColor(Color.black);

g.drawLine(511, 325,654, 325);
g.drawLine(582, 287,582,367 );

}

public static void main(String[] args) {
Home appwin = new Home();

appwin.setSize(new Dimension(800, 700));
appwin.setTitle("A K Graphics");
appwin.setVisible(true);
}
}



class MyWindowAdapter extends WindowAdapter {
public void windowClosing(WindowEvent we) {
System.exit(0);
} }
