import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton jtn = new JButton("Run");
    private JButton jtn2 = new JButton("Exit");
    private JLabel jlb =  new JLabel();
    private JTextField jtx = new JTextField();
    private Container cp;
    public MainFrame(){
        init();
        }
        private void init(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(120,30,500,500);
        cp = getContentPane();
        cp.setLayout(new GridLayout(1,4,1,1));
        cp.add(jtx);
        cp.add(jtn);
        cp.add(jlb);
        cp.add(jtn2);
        jtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        jtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double v1 = Double.parseDouble(jtx.getText());
                    Double v2 = v1 * 0.6214;
                    jlb.setText(Double.toString(v2));
                    int [] data = new int[5];
                    for(int i=0 ; i<5 ; i++){
                        data[i] = (int)Math.round(Math.random()*100);
                    }
                }
                catch (NumberFormatException e1){
                    JOptionPane.showMessageDialog(MainFrame.this,"Error");
                }
                catch (IndexOutOfBoundsException e2){
                    JOptionPane.showMessageDialog(MainFrame.this,"777");
                }
                catch (Exception e3){
                    JOptionPane.showMessageDialog(MainFrame.this,"666");
                }
             }
        });
        }
}
