package latihan02;

import java.awt.*;
public class Latihan02 extends Panel {
    Font f;
    String text = "HELLO KHARISMA";
    Latihan02(){
        setBackground(Color.GRAY);
    }
    public void paint (Graphics g) {
        f = new Font ("Helvetica", Font.BOLD,48);
        
        g.setColor(Color.GREEN);
        g.fillRect(8, 8, 480, 100);
        
         g.setColor(Color.BLACK);
         g.drawRect(8, 8, 480, 100);
         g.setColor(Color.PINK);
         g.fillOval(10, 10, 480, 100);
         
         g.setColor(Color.RED);
         g.drawOval(10, 10, 480, 100);
         g.drawOval(9, 9, 480, 102);
         g.drawOval(8, 8, 480, 104);
         
         g.setColor(Color.BLACK); 
         g.setFont(f);
         g.drawString(text, 40, 75);
    }
    public static void main(String[] args) {
        Frame f = new Frame("Testing graphics Panel");
        Latihan02 gp = new Latihan02();
        f.add(gp);
        f.setSize(510, 160);
        f.setVisible(true);
    }
    
}
