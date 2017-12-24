import java.awt.*;
import javax.swing.*;
public class Fenestra {
    private static JFrame bufo;
    private static JButton b1;
    private static JButton b2;
    private static JLabel dalao;
    
    public static void Fenestra(String[] args) {
    bufo=new JFrame("Bufonem Emittunt Aeternum");
    bufo.setSize(400,400);
    bufo.setLayout(new FlowLayout());
    b1 = new JButton("Initium");  
    b2 = new JButton("Finis"); 
    dalao = new JLabel(" ");
    dalao.setText("真大佬");
    dalao.setLocation(300, 300);
    dalao.setSize(40, 10);
    bufo.add(b1);        
    bufo.add(b2);
    bufo.setBackground(Color.green);
    bufo.setVisible(true);
    bufo.setDefaultCloseOperation(bufo.EXIT_ON_CLOSE);
    
    }
    
   
    
}
