public class ProjetoArray {
    public static void main(String[] args) {
        // Passo 1: 
        int[] lista = new int[5];
        lista[0] = 1;
        lista[1] = 2;
        lista[2] = 3;
        lista[3] = 4;
        lista[4] = 5;

        // Passo 2: 
        int[] pilha = new int[5];
        for (int i = 0; i < lista.length; i++) {
            pilha[i] = lista[lista.length - 1 - i];
        }

        // Passo 3: 
        int[] fila = new int[10];
        for (int i = 0; i < pilha.length; i++) {
            fila[i] = pilha[pilha.length - 1 - i];
        }

        // Passo 4: 
        lista[0] = 6;
        lista[1] = 7;
        lista[2] = 8;
        lista[3] = 9;
        lista[4] = 10;

        // Passo 5: 
        for (int i = 0; i < lista.length; i++) {
            fila[i + 5] = lista[i];
        }

        // Passo 6:
        for (int i = 0; i < fila.length; i++) {
            System.out.println(fila[i]);
        }
    }
}
