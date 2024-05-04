public class ResultadoEscolar {
    /*public static void main(String[] args) {
        int nota = 8;

        if (nota > 7) 
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }

    //Exemplo 2

    public static void main(String[] args) {
        int nota = 4;

        if (nota > 7)
        System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
        System.err.println("Recuperação");
        else 
        System.out.println("Reprovado");
    }

    //Exemplo 3 Condição Ternária

    public static void main(String[] args) {
        int nota = 7;

        String resultado = nota >= 7? "Aprovado" : "Reprovado";

    System.out.println(resultado);
    }*/

    //Exemplo 4

    public static void main(String[] args) {
        int nota = 5;

        String resultado = nota >= 7? "Aprovado" : nota >= 5 && nota < 7? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }

} 


