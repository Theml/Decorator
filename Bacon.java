public class Bacon extends IngredienteDecorator{
    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public String descricao() {
        return ingrediente.descricao() + ", bacon";
    }

    public float preco() {
        return ingrediente.preco() + 3.0f;
    }
}
