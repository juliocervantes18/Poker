class Carta {
    private String palo;
    private String color;
    private String valor;

    public Carta(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }
    @Override
    public String toString() {
        return palo + "," + color + "," + valor;
    }
}