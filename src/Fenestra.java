import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Fenestra {
    private JFrame bufo;
    private static JButton b1;
    private static JButton b2;
    private static JButton b3;
    private static JButton b4;
    private static JButton b5;
    private static JLabel dalao;
    public Fenestra() {
        Environment io = new Environment();
    b1 = new JButton("温度"+io.temperature);  
    b2 = new JButton("湿度"+io.humidity);
    b3 = new JButton("地形"+io.terrain);
    b4 = new JButton("氧气"+io.oxygenLevel);
    b5 = new JButton("食物"+io.food);
    bufo=new JFrame("Bufonem Emittunt Aeternum");
    bufo.setSize(400,400);
    bufo.setLayout(new FlowLayout());
    dalao = new JLabel(" ");
    dalao.setText("真大佬");
    dalao.setLocation(300, 300);
    dalao.setSize(40, 10);
    bufo.add(b1);        
    bufo.add(b2);
    bufo.add(b3);
    bufo.add(b4);
    bufo.add(b5);
    bufo.setBackground(Color.green);
    bufo.setVisible(true);
    bufo.setDefaultCloseOperation(bufo.EXIT_ON_CLOSE);
    b1.addMouseListener(new MouseAdapter() {
        private JFrame bot1;  
        private JLabel bot11;
        private JTextField text1;
        public void mouseClicked(MouseEvent e) {
            bufo=new JFrame("输入温度");
         bot1.setSize(200,200);
    bot1.setLayout(new FlowLayout());
    bot11 = new JLabel(" ");
    bot11.setText("输入温度"); 
    bufo.setBackground(Color.green);
    bufo.setVisible(true);
    bufo.setDefaultCloseOperation(bufo.EXIT_ON_CLOSE);
    text1.setSize(100,10);
    text1.addKeyListener(new KeyListener() {
    public void keyTyped(KeyEvent e) {};

    public void keyPressed(KeyEvent e) {
    if(e.getKeyCode()==KeyEvent.VK_ENTER){String a = text1.getText();
    io.setTemperature(Integer.valueOf(a));
    bot1.dispose();}
        };
    
    public void keyReleased(KeyEvent e) {};
    });
        }
    });
    }
    public static void Fenestra(String[] args) {
    
    
    }
    
   
    
}
