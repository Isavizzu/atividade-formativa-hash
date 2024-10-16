public class Hash {

    private int[] lista = new int[10];

    public int calcularHash(int number){
        String num = String.valueOf(number);
        char n = num.charAt(0);
        return Character.getNumericValue(n);
    }

    public void inserir(int number){
        int valor = calcularHash(number);
        lista[valor] = number;
        System.out.println("A chave: " + number + " foi inserido no valor: " + valor);
    }

    public void remover(int number){
        if(buscar(number)) {
            int valor = calcularHash(number);
            lista[valor] = 0;
            System.out.println("A chave: " + number + " foi removido no valor: " + valor);
            return;
        }
        System.out.println("Não há chave " + number + " na tabela hash");
    }

    public boolean buscar(int number){
        int valor = calcularHash(number);
        return lista[valor] != 0;
    }
}
