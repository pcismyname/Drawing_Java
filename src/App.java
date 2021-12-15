import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class App extends JFrame {
    public App()
    {
        setSize(1000, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        this.getContentPane().setBackground(Color.white);

    }
  
    public void paint (Graphics g){
        super.paint(g);

        //hands
        g.setColor(Color.black);
        g.drawOval(330,300, 30, 30);
        g.drawOval(580,300, 30, 30);

        //arms
        g.setColor(Color.blue);
        g.fillRect(350, 300, 80, 30);
        g.fillRect(510, 300, 80, 30); 

        //body
        g.setColor(Color.blue);
        g.fillOval(395,270, 150, 140);
        g.setColor(Color.white);
        g.fillOval(430,315, 80, 70);
        g.setColor(Color.black);
        g.drawLine(440,340,500,340);
        g.drawArc(440,310,60,60,180,180);

        //head
        g.setColor(Color.blue);
        g.fillOval(400,150, 150, 170);
        g.setColor(Color.white);
        g.fillOval(420,190, 110, 130);
        g.setColor(Color.black);
        g.drawOval(420,190, 110, 130);
        g.setColor(Color.red);
        g.fillOval(430,315, 80, 10);
        g.setColor(Color.yellow);
        g.fillOval(470,315, 10, 10);
    
        //left eye
        g.setColor(Color.white);
        g.fillOval(440,180, 35, 45);
        g.setColor(Color.black);
        g.drawOval(440,180, 35, 45);
        g.fillOval(450,195, 20, 20);
        g.setColor(Color.white);
        g.fillOval(460,200, 5, 5);

        //right eye
        g.setColor(Color.white);
        g.fillOval(480,180, 35, 45);
        g.setColor(Color.black);
        g.drawOval(480,180, 35, 45);
        g.fillOval(480,195, 20, 20);
        g.setColor(Color.white);
        g.fillOval(485,200, 5, 5);

        //nose
        g.setColor(Color.black);
        g.drawLine(477, 210, 477, 270);
        g.setColor(Color.red);
        g.fillOval(467,210, 20, 20);

        //mouth and whiskers
        g.setColor(Color.black);
        g.drawArc(440,250,70,50,180,180);
        g.drawLine(400, 210, 450, 240);
        g.drawLine(400, 230, 450, 260);
        g.drawLine(550, 210, 500, 240);
        g.drawLine(550, 230, 500, 260);

        //leg
        g.setColor(Color.blue);
        g.fillRect(410, 380, 40, 50);
        g.fillRect(490, 380, 40, 50);

        //feet
        g.setColor(Color.white);
        g.fillOval(400,425,65,40);
        g.setColor(Color.black);
        g.drawOval(400,425,65,40);
        g.setColor(Color.white);
        g.fillOval(480,425,65,40);
        g.setColor(Color.black);
        g.drawOval(480,425,65,40);

    }
    public static void main(String[] args)
    {
        new App();

    }

}