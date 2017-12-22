import java.awt.*;
import javax.swing.*;
public class Fenestra {
    private static JFrame bufo;
    private static Button b1;
    private static Button b2;
    
    public static void Fenestra(String[] args) {
    bufo=new JFrame("Bufonem Emittunt Aeternum");
    bufo.setSize(400,400);
    bufo.setLayout(new FlowLayout());
    b1 = new Button("Initium");  
    b2 = new Button("Finis");            
    bufo.add(b1);        
    bufo.add(b2);
    bufo.setBackground(Color.green);
    bufo.setVisible(true);
    bufo.setDefaultCloseOperation(bufo.EXIT_ON_CLOSE);
    
    }
    
   
    
}
