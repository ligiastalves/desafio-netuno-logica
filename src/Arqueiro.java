public class Arqueiro {
    private String modeloArma;

    public void escolherArma() {
        System.out.println("Você escolheu a classe Arqueiro.");
        modeloArma = "Arco";

    }

    public String getModeloArma() {
        return modeloArma;
    }
}
