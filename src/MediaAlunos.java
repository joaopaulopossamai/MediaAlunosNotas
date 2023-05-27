import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MediaAlunos  extends JFrame{
    private JTextField textPrimeira;
    private JTextField textSegunda;
    private JButton ButtonCalcularMedia;
    private JTextField textMedia;
    private JTextField textSituacao;
    private JPanel Media;
    private JLabel Situacao;
    private JLabel SegundaNota;
    private JLabel PrimeiraNota;
    public JPanel panelMain;
    private JComboBox comboBoxQualSubstituir;
    private JTextField textNotaSub;
    private JButton ButtonRecalcularMedia;
    private JLabel MediaSub;
    private JTextField textNMedia;
    private JTextField textNSituacao;
    private JLabel SituacaoSub;

    public MediaAlunos() {
        ButtonCalcularMedia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double valor1 = Double.valueOf( textPrimeira.getText());
                Double valor2 = Double.valueOf( textSegunda.getText());


                Double resposta = (valor1 + valor2)/2;

                textMedia.setText(resposta.toString());

                if (resposta >= 7) {
                    textSituacao.setText("Reprovado");
                } else {
                    textSituacao.setText("Reprovado");
                }

            }
        });

        ButtonRecalcularMedia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Double valor1 = Double.valueOf( textPrimeira.getText());
                Double valor2 = Double.valueOf( textSegunda.getText());
                Double valorSub = Double.valueOf( textNotaSub.getText());

                if (comboBoxQualSubstituir.getSelectedIndex() == 0){

                    Double resposta = (valorSub + valor2)/2;

                    textNMedia.setText(resposta.toString());
                } else{
                    Double resposta = (valorSub + valor1)/2;


                    textNMedia.setText(resposta.toString());
                }

            }
        });
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
