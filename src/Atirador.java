public class Atirador {
    private String modeloArma;

    public void escolherArma() {
        System.out.println("Você escolheu a classe Atirador.");
        modeloArma = "AK47";

    }

    public String getModeloArma() {
        return modeloArma;
    }
}
