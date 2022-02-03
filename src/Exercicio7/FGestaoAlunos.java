    package Exercicio7;
    
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class FGestaoAlunos {
    private JTabbedPane tabbedPaneAluno;
    private JPanel JTPaneNovo;
    private JPanel JTPaneAlterar;
    private JPanel JTPaneConsultar;
    private JPanel JTPaneEliminar;
    private JTextArea textAreaNotas;
    private JTextField textFieldIdentificacao;
    private JTextField textFieldNota;
    private JButton gerarDisciplinasButton;
    private JButton guardarButton;
    private JButton adicionarNotaButton;
    private JLabel GestaoAlunos;
    private JPanel PanelGestaoAlunos;
    private JTextField textFieldNNeg;
    private JTextField textFieldMedia;
    private JButton novoAlunoButton;
    private JTextField textFieldAlunoPesquisar;
    private JButton pesquisarButton;
    private JTextField textFieldAlNome;
    private JTextField textFieldAlMedia;
    private JTextField textFieldAlNNegativas;
    private JTextArea textAreaAlNotas;
    private JTextArea textAreaDadosAlunos;
    private JButton alterarButton1;

    int nDscp=10;
    int [] notas=new int[nDscp];
    short ap=0;

    ArrayList<Aluno> turma=new ArrayList<Aluno>();
    public static Aluno al, alu;

    public FGestaoAlunos() {
        gerarDisciplinasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rnd=new Random();
                short nNeg=0;

                textAreaNotas.setText("");
                for(int i=0; i<=nDscp; i++)
                {
                    notas[i]=rnd.nextInt(21);
                    textAreaNotas.append(notas[i]+"\n");
                }

                          }
        });

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((textFieldIdentificacao.getText() !="") && (textAreaNotas.getText() != "")) {

                    alu = new Aluno();
                    alu.setNome(textFieldIdentificacao.getText());
                    alu.setNotas(notas);

                    textFieldMedia.setText(String.valueOf(alu.Media()));
                    textFieldNNeg.setText(String.valueOf(alu.NNegativas()));
                    turma.add(alu);
                    JOptionPane.showMessageDialog(null, "Aluno guardado com sucesso: " + alu.Nome);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,
                            "Dados incompletos! Introduza o nome e as notas. ");
                }
            }
        });
        novoAlunoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldIdentificacao.setText("");
                textAreaNotas.setText("");
                textFieldMedia.setText("");
                textFieldNota.setText("");
                textFieldNNeg.setText("");
            }
        });
    }

    public void setVisible(boolean b){
        JFrame frame=new JFrame("gestão de alunos");
        frame.setContentPane(new FGestaoAlunos().PanelGestaoAlunos);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null); //centrar
        frame.setVisible(true);
    }
}
