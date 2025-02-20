package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

import model.Circle;
import model.Rect;

public class AppCanvas extends JPanel {

    
    public static int WIDTH = 500;
    public static int HEIGHT = 500;

    Color circleColor = Color.red;
    Color rectColor = Color.blue;
    public AppCanvas(){
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
    }
    
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

    }

    private void drawCircle(Graphics2D g2, Circle c, boolean isFill){
        double r = c.radius;
        Ellipse2D.Double s = new Ellipse2D.Double(c.x - r, c.y - r,r*2,r*2);
        g2.setColor(circleColor);
        if(isFill) g2.fill(s);
        else g2.draw(s);
    }

    private void drawRect(Graphics2D g2, Rect r, boolean isFill){
        Rectangle2D.Double s = new Rectangle2D.Double(r.x-r.width/2,r.y-r.height/2,r.width, r.height);
        g2.setColor(rectColor);
        if(isFill) g2.fill(s);
        else g2.draw(s);
    }

}
