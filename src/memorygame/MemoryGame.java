package memorygame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MemoryGame {

    public static void main(String[] args) throws IOException {

        JFrame glavniProzor = new JFrame();

        glavniProzor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        glavniProzor.setTitle("Glavni Meni");
        glavniProzor.setSize(500, 500);
        glavniProzor.setLocation(700, 300);
        glavniProzor.setResizable(false);
        glavniProzor.setIconImage(Toolkit.getDefaultToolkit().getImage(MemoryGame.class.getResource("/MemoryGame/images/memgam.png")));

        JPanel panel = new JPanel();
        panel.setBackground(Color.getHSBColor(14, 65, 65));
        glavniProzor.add(panel);

        JLabel label = new JLabel("Izaberite nivo koji zelite da igrate");
        label.setBounds(150, 320, 200, 20);
        panel.add(label);

        JButton laksiNivo = new JButton("Laksi nivo");
        laksiNivo.setBounds(190, 345, 110, 20);
        laksiNivo.addMouseListener(new LaksiNivo());
        panel.add(laksiNivo);

        JButton teziNivo = new JButton("Tezi nivo");
        teziNivo.setBounds(190, 380, 110, 20);
        teziNivo.addMouseListener(new TeziNivo());
        panel.add(teziNivo);
        
        JButton najteziNivo = new JButton("Najtezi nivo");
        najteziNivo.setBounds(190, 415, 110, 20);
        najteziNivo.addMouseListener(new NajteziNivo());
        panel.add(najteziNivo);

        panel.setLayout(null);

       

        Font font = new Font("Courier", Font.BOLD, 50);
        JLabel memgam = new JLabel("Memory Game");
        memgam.setBounds(80, 70, 370, 70);
        memgam.setFont(font);
        panel.add(memgam);

        
        
        String unosImena = JOptionPane.showInputDialog("Unesite Vase ime");
        FileWriter upisUfajl = new FileWriter("ime.txt");
        upisUfajl.write(unosImena);
        upisUfajl.close();

        glavniProzor.setVisible(true);

        JOptionPane.showMessageDialog(null, "Cilj igre je spojiti parove pre isteka vremena", "Pravila", JOptionPane.INFORMATION_MESSAGE);

    }
}
