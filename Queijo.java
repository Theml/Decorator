public class Queijo extends IngredienteDecorator{
    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public String descricao() {
        return ingrediente.descricao() + ", queijo";
    }

    public float preco() {
        return ingrediente.preco() + 2.0f;
    }
}
