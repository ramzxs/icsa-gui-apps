import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;

public class JavaAWTCounter2 extends Frame {
    int n = 0;
    TextField txtCounter = new TextField("0");
    Button btnCountPrev = new Button("< Prev");
    Button btnCountNext = new Button("Next >");
   

    public static void main(String[] args) {
        new JavaAWTCounter2();
    }

    public JavaAWTCounter2() {
        // FRAME
        this.setTitle("Java AWT GUI Counter 2");
        this.setSize(800, 600);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        // LAYOUT        
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.25;
        gbc.weighty = 1.0;
        

        Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 50);
        Font font2 = new Font(Font.MONOSPACED, Font.PLAIN, 50);

        // PREV
        btnCountPrev.setFont(font2);
        btnCountPrev.setForeground(Color.GRAY);
        btnCountPrev.setBackground(Color.DARK_GRAY);
        btnCountPrev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (n >= 1) {
                    txtCounter.setText("" + --n);
                }
            }
        });
        gbc.gridy = 0;
        gbc.gridx = 0;
        this.add(btnCountPrev, gbc);

        // TEXT FIELD
        txtCounter.setEditable(false);
        txtCounter.setFont(font1);
        txtCounter.setForeground(Color.WHITE);
        txtCounter.setBackground(Color.BLACK);
        gbc.gridy = 0;
        gbc.gridx = 1;
        gbc.weightx = 0.5;
        this.add(txtCounter, gbc);
        
        // NEXT
        btnCountNext.setFont(font2);
        btnCountNext.setForeground(Color.GRAY);
        btnCountNext.setBackground(Color.DARK_GRAY);
        btnCountNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtCounter.setText("" + ++n);
            }
        });
        gbc.gridy = 0;
        gbc.gridx = 2;
        gbc.weightx = 0.25;
        this.add(btnCountNext, gbc);

        this.setVisible(true);
    }    
}