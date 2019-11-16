
package latihan03;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Panel;

public class Latihan03 extends Panel{
    Latihan03(){
        setBackground(Color.GRAY);
    }
    public void paint (Graphics g) {
  Font   f = new Font ("Helvetica", Font.BOLD,48);
  FontMetrics fm = getFontMetrics(f);
  g.setFont(f);
  
  String S = "Teks ini tampil di tengah";
  int xpos = (this.size().width - fm.stringWidth(S)) /2;
  int ypos = (this.size().width ) /2;
  g.drawString(S, xpos, ypos);
 
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f = new Frame("Testing graphics Panel");
        Latihan03 gp = new Latihan03 ();
        f.add(gp);
        f.setSize(600, 600);
        f.setVisible(true);
    }
    
}