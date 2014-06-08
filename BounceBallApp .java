import java.awt.*;
import javax.swing.*;

public class BounceBallApp  {
 

  public static void main(String[] args) {
    
    //Use Jframe instead of JApplet 
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new BallControl());
    frame.setTitle("BounceBallApp");
    frame.setSize(400, 320);
    frame.setVisible(true);
  }
}
