public class Main {
    public static void main(String[] args) {
        Hash hash = new Hash();

        hash.inserir(12);
        hash.inserir(25);
        hash.inserir(37);
        hash.inserir(41);
        hash.inserir(53);
        hash.inserir(64);
        hash.inserir(78);
        hash.inserir(89);

        hash.remover(90);
        hash.remover(89);
    }
}