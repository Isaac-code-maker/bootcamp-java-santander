
public class LoopForArray {

    public static void main(String[] args) {
        // array do tipo String
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // Itera sobre o array imprindo cada indice
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }
}
