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
    private static JButton b6;
    private static JLabel dalao;
    public Fenestra() {
        Environment io = new Environment();
    b1 = new JButton("温度"+io.temperature);  
    b2 = new JButton("湿度"+io.humidity);
    b3 = new JButton("地形"+io.terrain);
    b4 = new JButton("氧气"+io.oxygenLevel);
    b5 = new JButton("食物"+io.food);
    b6 = new JButton("退出");
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
    bufo.add(b6);
    b6.setSize(150,50);
    bufo.setBackground(Color.green);
    bufo.setVisible(true);
    bufo.setDefaultCloseOperation(bufo.EXIT_ON_CLOSE);
    b6.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            System.out.print("dlt真大佬");
            bufo.dispose();
        }
    });
    b1.addMouseListener(new MouseAdapter() {
        private JFrame bot1;  
        private JLabel bot11;
        private JTextField text1;
        public void mouseClicked(MouseEvent e) {
            bot1=new JFrame("输入温度");
         bot1.setSize(200,200);
         text1=new JTextField();
    bot1.setLayout(new FlowLayout());
    bot11 = new JLabel(" ");
    bot11.setText("输入温度"); 
    bot1.setBackground(Color.green);
    bot1.setVisible(true);
    bot1.setDefaultCloseOperation(bufo.EXIT_ON_CLOSE);
    bot1.add(text1);
    text1.setPreferredSize(new Dimension(100,20));
    text1.setVisible(true);
    text1.addKeyListener(new KeyListener() {
    public void keyTyped(KeyEvent e) {};

    public void keyPressed(KeyEvent e) {
    if(e.getKeyCode()==KeyEvent.VK_ENTER){String a = text1.getText();
    io.setTemperature(Integer.valueOf(a));
    bot1.dispose();
    b1.setText("温度"+io.temperature);}
        };
    
    public void keyReleased(KeyEvent e) {};
    });
        }
    });
        b2.addMouseListener(new MouseAdapter() {
        private JFrame bot1;  
        private JLabel bot11;
        private JTextField text1;
        public void mouseClicked(MouseEvent e) {
            bot1=new JFrame("输入湿度");
         bot1.setSize(200,200);
         text1=new JTextField();
    bot1.setLayout(new FlowLayout());
    bot11 = new JLabel(" ");
    bot11.setText("输入湿度"); 
    bot1.setBackground(Color.green);
    bot1.setVisible(true);
    bot1.setDefaultCloseOperation(bufo.EXIT_ON_CLOSE);
    bot1.add(text1);
    text1.setPreferredSize(new Dimension(100,20));
    text1.setVisible(true);
    text1.addKeyListener(new KeyListener() {
    public void keyTyped(KeyEvent e) {};

    public void keyPressed(KeyEvent e) {
    if(e.getKeyCode()==KeyEvent.VK_ENTER){String a = text1.getText();
    io.setHumidity(Integer.valueOf(a));
    bot1.dispose();
    b2.setText("湿度"+io.humidity);}
        };
    
    public void keyReleased(KeyEvent e) {};
    });
        }
    });
    b3.addMouseListener(new MouseAdapter() {
        private JFrame bot1;  
        private JLabel bot11;
        private JTextField text1;
        public void mouseClicked(MouseEvent e) {
            bot1=new JFrame("输入地形");
         bot1.setSize(200,200);
         text1=new JTextField();
    bot1.setLayout(new FlowLayout());
    bot11 = new JLabel(" ");
    bot11.setText("输入地形"); 
    bot1.setBackground(Color.green);
    bot1.setVisible(true);
    bot1.setDefaultCloseOperation(bufo.EXIT_ON_CLOSE);
    bot1.add(text1);
    text1.setPreferredSize(new Dimension(100,20));
    text1.setVisible(true);
    text1.addKeyListener(new KeyListener() {
    public void keyTyped(KeyEvent e) {};

    public void keyPressed(KeyEvent e) {
    if(e.getKeyCode()==KeyEvent.VK_ENTER){String a = text1.getText();
    io.setTerrain(Integer.valueOf(a));
    bot1.dispose();
    b3.setText("地形"+io.terrain);}
        };
    
    public void keyReleased(KeyEvent e) {};
    });
        }
    });
        b4.addMouseListener(new MouseAdapter() {
        private JFrame bot1;  
        private JLabel bot11;
        private JTextField text1;
        public void mouseClicked(MouseEvent e) {
            bot1=new JFrame("输入氧气");
         bot1.setSize(200,200);
         text1=new JTextField();
    bot1.setLayout(new FlowLayout());
    bot11 = new JLabel(" ");
    bot11.setText("输入氧气"); 
    bot1.setBackground(Color.green);
    bot1.setVisible(true);
    bot1.setDefaultCloseOperation(bufo.EXIT_ON_CLOSE);
    bot1.add(text1);
    text1.setPreferredSize(new Dimension(100,20));
    text1.setVisible(true);
    text1.addKeyListener(new KeyListener() {
    public void keyTyped(KeyEvent e) {};

    public void keyPressed(KeyEvent e) {
    if(e.getKeyCode()==KeyEvent.VK_ENTER){String a = text1.getText();
    io.setOxygenLevel(Integer.valueOf(a));
    bot1.dispose();
    b4.setText("氧气"+io.oxygenLevel);}
        };
    
    public void keyReleased(KeyEvent e) {};
    });
        }
    });
    b5.addMouseListener(new MouseAdapter() {
        private JFrame bot1;  
        private JLabel bot11;
        private JTextField text1;
        public void mouseClicked(MouseEvent e) {
            bot1=new JFrame("输入食物");
         bot1.setSize(200,200);
         text1=new JTextField();
    bot1.setLayout(new FlowLayout());
    bot11 = new JLabel(" ");
    bot11.setText("输入食物"); 
    bot1.setBackground(Color.green);
    bot1.setVisible(true);
    bot1.setDefaultCloseOperation(bufo.EXIT_ON_CLOSE);
    bot1.add(text1);
    text1.setPreferredSize(new Dimension(100,20));
    text1.setVisible(true);
    text1.addKeyListener(new KeyListener() {
    public void keyTyped(KeyEvent e) {};

    public void keyPressed(KeyEvent e) {
    if(e.getKeyCode()==KeyEvent.VK_ENTER){String a = text1.getText();
    io.setFood(Integer.valueOf(a));
    bot1.dispose();
    b5.setText("食物"+io.food);}
        };
    
    public void keyReleased(KeyEvent e) {};
    });
        }
    });    
    }
    public static void Fenestra(String[] args) {
    
    
    }
    
   
    
}
