import java.awt.*;
import java.applet.*;

public class Main extends Applet {
    public void init() {
        setBackground(Color.RED);
        setForeground(Color.YELLOW);
    };

    public void paint(Graphics g) {
        g.drawString("Hello World", 10, 20);
        Color color = new Color(70,65,70);
        setBackground(color);
        g.drawOval(10, 10, 50, 50);
        g.fillOval(10,70,50,50);
        g.drawLine(10,140,50,50);
        g.drawArc(45, 72, 400, 200, 40, 360);
        Font font =  new Font("Times new Roman");
        setFont(font);
    };
    
}
