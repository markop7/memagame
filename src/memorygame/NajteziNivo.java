package memorygame;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class NajteziNivo extends MouseAdapter {

    public Dugme matchingButton1;
    public Dugme matchingButton2;
    public Dugme d;
    public int pogodak = 0;
    public int reset = 0;

    public Dugme getMatchingButton1() {
        return matchingButton1;
    }

    public void setMatchingButton1(Dugme d) {
        this.matchingButton1 = d;
    }

    public Dugme getMatchingButton2() {
        return matchingButton2;
    }

    public void setMatchingButton2(Dugme d) {
        this.matchingButton2 = d;
    }

    public Dugme getD() {
        return d;
    }

    public void setD(Dugme d) {
        this.d = d;
    }

    public int getPogodak() {
        return pogodak;
    }

    public void setPogodak(int pogodak) {
        this.pogodak = pogodak;
    }

    public int getReset() {
        return reset;
    }

    public void setReset(int reset) {
        this.reset = reset;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        JFrame teziNivo = new JFrame();
        teziNivo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teziNivo.setTitle("Tezi nivo");
        teziNivo.setLocation(680, 300);
        teziNivo.setSize(600, 600);

        GridLayout grid = new GridLayout(4,5, 4,4);
        teziNivo.getContentPane().setLayout(grid);

        ArrayList dugmad = new ArrayList();

        Dugme dugme1 = new Dugme(1);
        dugme1.setBackground(Color.WHITE);
        dugmad.add(dugme1);

        Dugme dugme2 = new Dugme(1);
        dugme2.setBackground(Color.WHITE);
        dugmad.add(dugme2);

        Dugme dugme3 = new Dugme(2);
        dugme3.setBackground(Color.WHITE);
        dugmad.add(dugme3);

        Dugme dugme4 = new Dugme(2);
        dugme4.setBackground(Color.WHITE);
        dugmad.add(dugme4);

        Dugme dugme5 = new Dugme(3);
        dugme5.setBackground(Color.white);
        dugmad.add(dugme5);

        Dugme dugme6 = new Dugme(3);
        dugme6.setBackground(Color.WHITE);
        dugmad.add(dugme6);

        Dugme dugme7 = new Dugme(4);
        dugme7.setBackground(Color.WHITE);
        dugmad.add(dugme7);

        Dugme dugme8 = new Dugme(4);
        dugme8.setBackground(Color.WHITE);
        dugmad.add(dugme8);

        Dugme dugme9 = new Dugme(5);
        dugme9.setBackground(Color.white);
        dugmad.add(dugme9);

        Dugme dugme10 = new Dugme(5);
        dugme10.setBackground(Color.white);
        dugmad.add(dugme10);

        Dugme dugme11 = new Dugme(6);
        dugme11.setBackground(Color.white);
        dugmad.add(dugme11);

        Dugme dugme12 = new Dugme(6);
        dugme12.setBackground(Color.white);
        dugmad.add(dugme12);

        Dugme dugme13 = new Dugme(7);
        dugme13.setBackground(Color.white);
        dugmad.add(dugme13);

        Dugme dugme14 = new Dugme(7);
        dugme14.setBackground(Color.white);
        dugmad.add(dugme14);

        Dugme dugme15 = new Dugme(8);
        dugme15.setBackground(Color.white);
        dugmad.add(dugme15);

        Dugme dugme16 = new Dugme(8);
        dugme16.setBackground(Color.white);
        dugmad.add(dugme16);
        
        Dugme dugme17 = new Dugme(9);
        dugme17.setBackground(Color.white);
        dugmad.add(dugme17);

        Dugme dugme18 = new Dugme(9);
        dugme18.setBackground(Color.white);
        dugmad.add(dugme18);
        
        Dugme dugme19 = new Dugme(10);
        dugme19.setBackground(Color.white);
        dugmad.add(dugme19);
        
        Dugme dugme20 = new Dugme(10);
        dugme20.setBackground(Color.white);
        dugmad.add(dugme20);
        
        TeziNivo matchingHelper = new TeziNivo();
        
        
        Timer timer = new Timer(400, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int br = 0;
                if (matchingHelper.getMatchingButton1().getId() == matchingHelper.getMatchingButton2().getId()) {
                    matchingHelper.getMatchingButton1().setText("Pogodak!");
                    matchingHelper.getMatchingButton2().setText("Pogodak!");
                    matchingHelper.getMatchingButton1().setEnabled(false);
                    matchingHelper.getMatchingButton2().setEnabled(false);
                    matchingHelper.setPogodak(matchingHelper.getPogodak() + 1);

                    if (matchingHelper.getPogodak() == 10) {
                        JOptionPane.showMessageDialog(null, "Osvojili ste svih 10 poena za manje od 30 sekundi");
                        System.exit(0);

                    }
                } else {
                    matchingHelper.getMatchingButton1().setBackground(Color.WHITE);
                    matchingHelper.getMatchingButton2().setBackground(Color.WHITE);
                }
                matchingHelper.setMatchingButton1(null);
                matchingHelper.setMatchingButton2(null);
            }

        });
        
        int vreme = 30000;
        Timer tr = new Timer(vreme, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Vreme je isteklo!", "KRAJ IGRE", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        });
        tr.setRepeats(false);
        tr.start();
        

        ActionListener actionListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                matchingHelper.setD((Dugme) e.getSource());

                if (matchingHelper.getMatchingButton1() == null && matchingHelper.getMatchingButton2() == null) {
                    matchingHelper.setMatchingButton1(matchingHelper.getD());

                    if (matchingHelper.getMatchingButton1().getId() == 1) {
                        matchingHelper.getMatchingButton1().setBackground(Color.yellow);
                    }
                    if (matchingHelper.getMatchingButton1().getId() == 2) {
                        matchingHelper.getMatchingButton1().setBackground(Color.blue);
                    }
                    if (matchingHelper.getMatchingButton1().getId() == 3) {
                        matchingHelper.getMatchingButton1().setBackground(Color.ORANGE);
                    }
                    if (matchingHelper.getMatchingButton1().getId() == 4) {
                        matchingHelper.getMatchingButton1().setBackground(Color.RED);
                    }
                    if (matchingHelper.getMatchingButton1().getId() == 5) {
                        matchingHelper.getMatchingButton1().setBackground(Color.CYAN);
                    }
                    if (matchingHelper.getMatchingButton1().getId() == 6) {
                        matchingHelper.getMatchingButton1().setBackground(Color.green);
                    }
                    if (matchingHelper.getMatchingButton1().getId() == 7) {
                        matchingHelper.getMatchingButton1().setBackground(Color.MAGENTA);
                    }
                    if (matchingHelper.getMatchingButton1().getId() == 8) {
                        matchingHelper.getMatchingButton1().setBackground(Color.PINK);
                    }
                    if (matchingHelper.getMatchingButton1().getId() == 9) {
                        matchingHelper.getMatchingButton1().setBackground(Color.BLACK);
                    }
                    if (matchingHelper.getMatchingButton1().getId() == 10) {
                        matchingHelper.getMatchingButton1().setBackground(Color.GRAY);
                    }

                }

                if (matchingHelper.getMatchingButton1() != null && matchingHelper.getMatchingButton1() != matchingHelper.getD() && matchingHelper.getMatchingButton2() == null) {
                    matchingHelper.setMatchingButton2(matchingHelper.getD());

                    if (matchingHelper.getMatchingButton2().getId() == 1) {
                        matchingHelper.getMatchingButton2().setBackground(Color.yellow);
                    }
                    if (matchingHelper.getMatchingButton2().getId() == 2) {
                        matchingHelper.getMatchingButton2().setBackground(Color.blue);
                    }
                    if (matchingHelper.getMatchingButton2().getId() == 3) {
                        matchingHelper.getMatchingButton2().setBackground(Color.ORANGE);
                    }
                    if (matchingHelper.getMatchingButton2().getId() == 4) {
                        matchingHelper.getMatchingButton2().setBackground(Color.RED);
                    }
                    if (matchingHelper.getMatchingButton2().getId() == 5) {
                        matchingHelper.getMatchingButton2().setBackground(Color.CYAN);
                    }
                    if (matchingHelper.getMatchingButton2().getId() == 6) {
                        matchingHelper.getMatchingButton2().setBackground(Color.green);
                    }
                    if (matchingHelper.getMatchingButton2().getId() == 7) {
                        matchingHelper.getMatchingButton2().setBackground(Color.MAGENTA);
                    }
                    if (matchingHelper.getMatchingButton2().getId() == 8) {
                        matchingHelper.getMatchingButton2().setBackground(Color.PINK);
                    }
                    if (matchingHelper.getMatchingButton2().getId() == 9) {
                        matchingHelper.getMatchingButton2().setBackground(Color.BLACK);
                    }
                    if (matchingHelper.getMatchingButton2().getId() == 10) {
                        matchingHelper.getMatchingButton2().setBackground(Color.GRAY);
                    }
                    timer.start();
                }
                timer.setRepeats(false);

            }
        };
        dugme1.addActionListener(actionListener);
        dugme2.addActionListener(actionListener);
        dugme3.addActionListener(actionListener);
        dugme4.addActionListener(actionListener);
        dugme5.addActionListener(actionListener);
        dugme6.addActionListener(actionListener);
        dugme7.addActionListener(actionListener);
        dugme8.addActionListener(actionListener);
        dugme9.addActionListener(actionListener);
        dugme10.addActionListener(actionListener);
        dugme11.addActionListener(actionListener);
        dugme12.addActionListener(actionListener);
        dugme13.addActionListener(actionListener);
        dugme14.addActionListener(actionListener);
        dugme15.addActionListener(actionListener);
        dugme16.addActionListener(actionListener);
        dugme17.addActionListener(actionListener);
        dugme18.addActionListener(actionListener);
        dugme19.addActionListener(actionListener);
        dugme20.addActionListener(actionListener);

        Collections.shuffle(dugmad);
        for (int i = 0; i < 20; i++) {
            teziNivo.add((Component) dugmad.get(i));
        }

        teziNivo.setVisible(true);

    }
}
