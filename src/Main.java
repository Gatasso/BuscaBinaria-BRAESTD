import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Object vetor[] = new Object[100];
        int indexInicio = 0, num = 0, contador = 0;
        int indexFim = vetor.length - 1;
        int meio = (indexFim / 2);
        boolean teste = false;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual índice você está buscando?"));

        while (meio <= indexFim) {
            if (num < indexInicio || num > indexFim)
                break;
            if (num == meio) {
                teste = true;
                break;
            } else if (num > meio) {
                indexInicio = (meio + 1);
                System.out.println("Índex > " + meio + " Iteração nº: " + (contador + 1));
            } else {
                indexFim = (meio - 1);
                System.out.println("Índex < " + meio + " Iteração nº: " + (contador + 1));
            }
            contador++;
            meio = ((indexInicio + indexFim) / 2);
        }
        if (teste)
            JOptionPane.showMessageDialog(null, "Índex encontrado: " + meio + " em " + contador + " iterações");
        else
            JOptionPane.showMessageDialog(null, "Índex não encontrado");
    }
}