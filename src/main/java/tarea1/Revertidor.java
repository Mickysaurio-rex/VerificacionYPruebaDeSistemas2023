package tarea1;

public class Revertidor {

    public String invertir(int number){
        boolean esNegativo = false;
        if (number < 0) {
            esNegativo = true;
            number = Math.abs(number);
        }

        String numeroStr = String.valueOf(number);
        StringBuilder numeroInvertido = new StringBuilder(numeroStr).reverse();

        if (esNegativo) {
            numeroInvertido.insert(0, "-");
        }

        return numeroInvertido.toString();
    }
}
