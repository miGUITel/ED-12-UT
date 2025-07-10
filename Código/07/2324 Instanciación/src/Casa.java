public class Casa {
    private Lavadora lavadoraTerraza = new Lavadora();


    // Método para realizar el ciclo de lavado
    public void realizarCicloDeLavado() {
        lavadoraTerraza.encender();
        lavadoraTerraza.lavar();
        lavadoraTerraza.apagar();
    }
}
