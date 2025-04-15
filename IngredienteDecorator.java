abstract class IngredienteDecorator implements Ingrediente {
    protected Ingrediente ingrediente;

    public IngredienteDecorator(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public abstract String descricao();

    @Override
    public abstract float preco();
}
