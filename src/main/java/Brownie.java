public abstract class Brownie implements Comparable <Brownie> {
    String nome;
    Double preco;

    public int compareTo(Brownie brownie) {
        return -1*Double.compare(this.preco, brownie.preco);
    }
}
