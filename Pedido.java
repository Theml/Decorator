public class Pedido {
    private Ingrediente ingrediente;

    public Pedido(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String descricao() {
        return "Pedido: " + ingrediente.descricao();
    }

    public float preco() {
        return ingrediente.preco();
    }
}
