
/*  2. Using 2D graphics commands in an Applet, construct a house. On mouse click event, change the color of the door from blue to red.*/


import java.awt.*;
import java.awt.event.*;

public class ColorDemo extends Frame
implements MouseListener, MouseMotionListener{

public ColorDemo() {
addMouseListener(this);
addMouseMotionListener(this);
addWindowListener(new MyWindowAdapter());
}



public Color sky =Color.blue;

public void mouseClicked(MouseEvent me) {
    if(sky ==Color.blue){

        sky =Color.RED;

    }
    else if(sky ==Color.RED){
        sky =Color.blue;

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


// Draw in different colors.
public void paint(Graphics g)
 {




g.setColor(Color.yellow);
g.fillRect(60, 100, 200, 120);



g.setColor(sky);
g.fillRect(140, 170, 50, 50);

// Draw a polygon
g.setColor(Color.orange);

int x[] = {50, 160, 270};
int y[] = {100, 50, 100};
Polygon poly=new Polygon(x,y,3);
g.fillPolygon(poly);


}

public static void main(String[] args) {
ColorDemo appwin = new ColorDemo();

appwin.setSize(new Dimension(340, 260));
appwin.setTitle("ColorDemo");
appwin.setVisible(true);
}
}
class MyWindowAdapter extends WindowAdapter {
public void windowClosing(WindowEvent we) {
System.exit(0);
} }

