import javax.swing.*;
import java.awt.*;


public class FrameExc extends JFrame {
    
    
    
    FrameExc() {
        this.setDefaultCloseOperation(3);
        this.setSize(400, 400);
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        System.out.println(height + "\t" + width);
        
        this.setLocation((width - this.getWidth()) / 2, (height - this.getHeight()) / 2);
        initComponents();
        
     
    }
    
    
   public void initComponents (){
   
        Container kontener1 = this.getContentPane();
   
        button1.setPreferredSize(button1.getPreferredSize());
       button2.setPreferredSize(button2.getPreferredSize());
       /* kontener1.add(button1, BorderLayout.PAGE_END);
        kontener1.add(button2, BorderLayout.PAGE_START);*/
        kontener1.add(panel1, BorderLayout.SOUTH);
        
        panel1.add(button1);
        panel1.add(button2);
        
   }
    
    
    
    
    JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JButton button1 = new JButton("Przycisk 1");
    JButton button2 = new JButton("Przycisk 2");
    
    
    public static void main(String[] args) {
        
        new FrameExc().setVisible(true);
    }
}
