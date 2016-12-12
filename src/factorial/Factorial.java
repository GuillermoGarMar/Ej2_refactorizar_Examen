package factorial;

public class Factorial {

    public static void main(String[] args) {
        //hago un format al principio de todo para ordenar el codigo asi entenrderlo mejor
        //Cambio los nombres de las variables usando el rename; j=num1, f=num2 e i se queda igual
        int num1;
        int num2;

        num1 = 8;

        int i;
        if (num1 == 0) {
            num2 = 1;
        } else {
            num2 = 1;
            for (i = num1; i >= 1; i--) {
                num2 = num2 * i;
            }
        }

        System.out.println(num2);

    }

}
