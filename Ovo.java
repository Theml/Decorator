public class Ovo extends IngredienteDecorator{
    public Ovo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public String descricao() {
        return ingrediente.descricao() + ", ovo";
    }

    public float preco() {
        return ingrediente.preco() + 1.5f;
    }
}
