import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Label extends JFrame {


    JLabel label = new JLabel("Time");
    JPanel panel1 = new JPanel();
    JLabel timeLabel = new JLabel(getTime());

    public Label(){
        super("Watch");
        this.setDefaultCloseOperation(3);
        this.setSize(new Dimension(600,600));
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        this.setLocation(new Point((width-this.getSize().width)/2, (height-this.getSize().height)/2));

        initComponents();
        pack();



    }


    void initComponents(){
        panel1.add(label);
        panel1.add(timeLabel);

        Timer timer = new Timer(1000, new WatchListener()); //co podany czas wywołuje akcję
        timer.start();

        this.getContentPane().add(panel1);


    }



    private class WatchListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            timeLabel.setText(getTime());
        }


        }

        public String getTime(){

            GregorianCalendar calendar = new GregorianCalendar();

            String hour = ""+calendar.get(Calendar.HOUR_OF_DAY);
            String minute = ""+calendar.get(Calendar. MINUTE);
            String second = ""+calendar.get(Calendar.SECOND);

            if(Integer.parseInt(hour)<10){
                hour = "0"+hour;
            }
            if(Integer.parseInt(minute)<10){
                minute = "0"+minute;
            }
            if(Integer.parseInt(second)<10){
                second = "0"+second;
            }
            return hour+":"+minute+":"+second;

        }


    static int i = 1;
    public static void main(String[] args) {
        new Label().setVisible(true);
    }
}
