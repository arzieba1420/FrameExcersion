import javax.swing.*;
import java.awt.*;

public class GroupLayoutEx extends JFrame {
    
    
    GroupLayoutEx() {
        this.setDefaultCloseOperation(3);
        this.setSize(400, 400);
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
      
        initComponents();
        
    }
    
    
    public void initComponents() {
        
        GroupLayout layout = new GroupLayout(getContentPane());
        this.getContentPane().setLayout(layout);
        
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addComponent(button1)
                        .addGroup(layout.createParallelGroup().addComponent(button2).addComponent(button4))
                        .addComponent(button3    )
                        .addContainerGap(10,Short.MAX_VALUE)
                        .addComponent(anuluj)
        );
        
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup().addComponent(button1).addComponent(button2).addComponent(button3))
                .addComponent(button4)
                        .addContainerGap(10,Short.MAX_VALUE)
                        .addComponent(anuluj)
                
        );
        
        pack();
    }
    
    
    
    JButton button1 = new JButton("Przycisk1");
    JButton button2 = new JButton("Przycisk2");
    JButton button3 = new JButton("Przycisk3");
    JButton button4 = new JButton("Przycisk4");
    JButton anuluj = new JButton("Anuluj");
    
    
    
    public static void main(String[] args) {
        
        new GroupLayoutEx().setVisible(true);
    }
}
