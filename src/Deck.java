import java.util.*;

class Deck {
    private final List<Carta> cartas;
    private static final String[] PALOS = {"Tréboles", "Corazones", "Picas", "Diamantes"};
    private static final String[] VALORES = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

    public Deck() {
        cartas = new ArrayList<>();
        for (String palo : PALOS) {
            String color = (palo.equals("Corazones") || palo.equals("Diamantes")) ? "Rojo" : "Negro";
            for (String valor : VALORES) {
                cartas.add(new Carta(palo, color, valor));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cartas);
        System.out.println("Se mezcló el Deck.");
    }

    public void head() {
        if (!cartas.isEmpty()) {
            System.out.println(cartas.remove(0).toString());
            System.out.println("Quedan " + cartas.size() + " cartas en el deck.");
        } else {
            System.out.println("No quedan cartas en el deck.");
        }
    }

    public void pick() {
        if (!cartas.isEmpty()) {
            int index = new Random().nextInt(cartas.size());
            System.out.println("Carta aleatoria retirada: " + cartas.remove(index).toString());
            System.out.println("Quedan " + cartas.size() + " cartas en el deck.");
        } else {
            System.out.println("No quedan cartas en el deck.");
        }
    }

    public void hand() {
        if (cartas.size() >= 5) {
            System.out.println("Mano de 5 cartas:");
            for (int i = 0; i < 5; i++) {
                System.out.println(cartas.remove(0).toString());
            }
            System.out.println("Quedan " + cartas.size() + " cartas en el deck.");
        } else {
            System.out.println("No hay suficientes cartas en el deck.");
        }
    }
}


