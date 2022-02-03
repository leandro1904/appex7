package Exercicio7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FPrincipal {
    private JPanel PanelPrincipal;
    private JButton gestãoDeAlunosButton;
    private JButton gestãoDeTurmasButton;

    public FPrincipal() {
        gestãoDeAlunosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            new FGestaoAlunos().setVisible(true);
            }
        });
        gestãoDeTurmasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("gestão de alunos e turmas");
        frame.setContentPane(new FPrincipal().PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
