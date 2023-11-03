import javax.swing.JOptionPane;

public class Interface {
    public static void main(String[] args) {
        String nomeUsuario = " ", aux;
        int qtdContatinhos = 0;
        
        JOptionPane.showMessageDialog(null, "Olá, seja bem-vindo!");
        nomeUsuario = JOptionPane.showInputDialog("<html>Por favor, digite seu <b>nome<b/>: </html>");
        aux = JOptionPane.showInputDialog(nomeUsuario + ", digite a quantidade de contatinhos que você tem: ");

        qtdContatinhos = Integer.parseInt(aux);

        String numeroContatinhos[] = new String[qtdContatinhos];
        String nomeContatinhos[] = new String[qtdContatinhos];

        for (int i = 0; i < qtdContatinhos; i++) {
            nomeContatinhos[i] = JOptionPane
                    .showInputDialog("<html>Digite o <b>nome</b> do " + (i + 1) + "º contatinho: </html>");

            if (nomeContatinhos[i].length() <= 2) {
                JOptionPane.showMessageDialog(null, "Nome inválido!");
                i--;
            }
        }
        for (int j = 0; j < qtdContatinhos; j++) {
            numeroContatinhos[j] = JOptionPane
                    .showInputDialog(
                            "<html>Digite o <b>número</b> do contatinho" + "(" + nomeContatinhos[j] + ")</html>");

            if (numeroContatinhos[j].length() <= 3) {
                JOptionPane.showMessageDialog(null, "Número inválido!");
                j--;
            }
        }
        for (int i = 0; i < qtdContatinhos; i++) {
            JOptionPane.showMessageDialog(null,
                    "Nome:" + nomeContatinhos[i] + " | " + " Número: " + numeroContatinhos[i], "Lista de contatos!",
                    qtdContatinhos);
        }

    }
}
