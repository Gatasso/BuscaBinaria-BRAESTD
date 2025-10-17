import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Object vetor[] = new Object[100];
        int indexInicio = 0, num = 0, contador = 0;
        int indexFim = vetor.length - 1;
        int meio = (indexFim / 2);

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual índice você está buscando?"));

        while (meio < indexFim){
            if (num == meio){
                JOptionPane.showMessageDialog(null,"Índex encontrado: " + meio + " em " + contador + " iterações");
                break;
            } 
            else if (num > meio){
                indexInicio = (meio + 1);
                System.out.println("Índex > " + meio + " Iteração nº: " + (contador + 1));
            } else {
                indexFim = (meio - 1);
                System.out.println("Índex < " + meio + " Iteração nº: " + (contador + 1));
            }
            contador++;
            meio = ((indexInicio + indexFim) / 2);
        }
    }
}