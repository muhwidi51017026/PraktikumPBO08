package latihan01;
import java.awt.*;
public class Latihan01 extends Panel {
    Latihan01(){
        setBackground(Color.GRAY);
    }
    public void paint(Graphics g) {
        
        g.fillRect(0,250,290,50);
        
        g.drawLine(125, 250, 125, 160);
        g.drawLine(175, 250, 175, 160);
        g.drawArc(85, 157,130,50,-65,312);
        g.drawArc(85, 87, 130, 50, 62, 58);
        
        g.fillArc(78, 120, 40, 40, 63, -174);
        g.fillOval(120, 96, 30, 40);
        g.fillArc(173, 100, 40, 40, 110, 180);
    }
    public static void main(String[] args) {
        Frame f = new Frame("Testing Graphics Panel");
        Latihan01 gp = new Latihan01();
        f.add(gp);
        f.setSize(300, 340);
        f.setVisible(true);
}
}