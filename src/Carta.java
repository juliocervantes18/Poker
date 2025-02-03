class Carta {
    private String palo;
    private String color;
    private String valor;

    public Carta(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    public String toString() {
        return palo + "," + color + "," + valor;
    }
}