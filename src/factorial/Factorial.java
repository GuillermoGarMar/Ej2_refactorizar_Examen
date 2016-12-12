package factorial;

public class Factorial {

    public static void Condicion(int auxn1, int auxn2, int i2) {
        if (auxn1 == 0) {
            auxn2 = 1;
        } else {
            auxn2 = 1;
            for (i2 = auxn1; i2 >= 1; i2--) {
                auxn2 = auxn2 * i2;
            }
        }
        Mostrar(auxn2);

    }

    public static void Mostrar(int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        //hago un format al principio de todo para ordenar el codigo asi entenrderlo mejor
        //Cambio los nombres de las variables usando el rename; j=num1, f=num2 e i se queda igual
        int num1 = 8;
        int num2 = 0;

        int i = 0;
        //creo una clase donde muevo el if
        Condicion(num1, num2, i);

    }

}
