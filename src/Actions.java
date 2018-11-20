import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actions extends JFrame implements ActionListener {


    JPanel panel1 = new JPanel();
    JButton button1 = new JButton("Red");
    JButton button2 = new JButton("Black");
    JButton button3 = new JButton("Green");
    Color defaultPanel1Color = panel1.getBackground();


    Actions(){
        super("Zdarzenia - Test");
        this.setDefaultCloseOperation(3);
        this.setSize(new Dimension(600,600));
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        this.setLocation(new Point((width-this.getSize().width)/2, (height-this.getSize().height)/2));

        initComponents();


    }


   public void initComponents(){
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);

        button1.addActionListener(new ColorListener(Color.RED));
        button1.setPreferredSize(new Dimension(100,50));
        button2.setPreferredSize(new Dimension(100,50));
        button3.setPreferredSize(new Dimension(100,50));

        this.getContentPane().add(panel1);

        buttonBuilder("Blue",Color.blue);
        button3.addActionListener(this);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setBackground(Color.black);
            }
        });

        buttonBuilder("Default",defaultPanel1Color);




    }
    //Metoda do budowania przycisków
    public void buttonBuilder(String name, final Color color){
        JButton button = new JButton(name);
        button.setPreferredSize(new Dimension(100,50));
        panel1.add(button);

        //korzystanie z klasy anonimowej
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setBackground(color);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button3){
            panel1.setBackground(Color.green);
        }
    }


    //Klasa słuchacz kolorów
    class ColorListener implements ActionListener {


        Color defaultPanel1Color = panel1.getBackground();
        Color color;
        public ColorListener(Color c){
            this.color = c;

        }

        int countOfClick=0;
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getActionCommand());
            panel1.setBackground(color);
            countOfClick++;
            if (countOfClick%2==0){
                panel1.setBackground(defaultPanel1Color);
            }
        }



    }




    public static void main(String[] args) {

        new Actions().setVisible(true);
    }
}
