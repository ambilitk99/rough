/*  5. Develop a program that has a Choice component which contains the names of shapes such as rectangle, triangle, square and circle. Draw the corresponding shapes for given parameters as per user’s choice.*/



import java.awt.*;
import java.awt.event.*;

public class Choiceshape extends Frame
implements ItemListener {
Choice shape;
String msg=" ";
String sp;

public Choiceshape() {

// Use a flow layout.
setLayout(new FlowLayout());
// Create choice lists.
shape = new Choice();


// Add items to os list.
shape.add("Rectangle");
shape.add("Triangle");
shape.add("Square");
shape.add("Circle");



// Add choice lists to window.
add(shape);


// Add item listeners.
shape.addItemListener(this);


addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
}

public void itemStateChanged(ItemEvent ie) {
repaint();
}

// Display current selections.
public void paint(Graphics g) {


msg = "selected shape: ";
msg = shape.getSelectedItem();
g.drawString(msg, 40, 90);
if (msg.equals("Rectangle")){
g.setColor(Color.blue);
g.fillRect(10, 100, 100, 120);
}

msg = shape.getSelectedItem();
if (msg.equals("Triangle")){

int x[] = {30, 180, 340};
int y[] = {200, 130, 200};

Polygon poly=new Polygon(x,y,3);
g.setColor(Color.red);
g.fillPolygon(poly);
}

msg = shape.getSelectedItem();

if (msg.equals("Square")){
g.setColor(Color.pink);
g.fillRect(10, 100, 100, 100);
}


msg = shape.getSelectedItem();
if (msg.equals("Circle")){
g.setColor(Color.green);
g.fillOval(10, 100, 100, 100);
}


}
public static void main(String[] args) {
Choiceshape appwin = new Choiceshape();

appwin.setSize(new Dimension(240, 180));
appwin.setTitle("Choiceshape");
appwin.setVisible(true);
}
}
