import java.util.Scanner;

public class APP_banco {
    public static void main(String[] args) {

        String logo ="\n" +
                "                    _ _ _    \n" +
                "                   (_) | | | |   \n" +
                " ___ ___ _ __ __ _ _ ___ | |__ __ _ _ __ |__ __ _ _ __ | | __\n" +
                "/ __|/ _ \\ '__/ _` | |/ _ \\ | '_ \\ / _` | '_\\| |/ /\n" +
                "\\__ \\ __/ | | (_| | | (_) | | |_) | (_| | | | | <\n" +
                "|___/\\___|_| \\__, |_|\\___/ |_.__/ \\__,_|_| |_|_|\\_\\\n" +
                "               __/ |                                 \n" +
                "              |___/                                  \n";
        System.out.println(logo);


        //Datos del cliente
        String nombre = "Cristiano Ronaldo";
        String tipoDeCuenta = "Libretón Basico";
        double saldo = 9923.99;
        int opcion = 0; //Opcion que seleccionara el usuario
        String divisa = "$";
        System.out.println("***********************\n");
//        System.out.println(nombre);
//        System.out.println(tipoDeCuenta);
//        System.out.println(saldo);
        System.out.printf("""
                Nombre del cliente: %s
                Tipo de cuenta : %s
                Saldo en la cuenta: %s%f
                """, nombre, tipoDeCuenta,divisa,saldo);
        System.out.println("***********************\n");

//    Menu de opciones

        String menu = """
                *** Escribe el número de la opción deseada ***
                1 - Consultar Saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner lectura = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = lectura.nextInt();

            switch (opcion){
                case  1:
                System.out.println("El saldo actualizado es: " + saldo + divisa);
                break;

                case 2:
                    System.out.println("Ingresa el monto a retirar: ");
                    int montoRetirado = lectura.nextInt(); //Valida que el monto a retirar no sea mayor al saldo actual
                    if (saldo < montoRetirado){
                        System.out.println("Saldo insuficinte");
                    }else{
                        saldo = saldo - montoRetirado;
                        System.out.println("El saldo actualizado es de: " + saldo);
                        break;
                    }
                case 3:{
                    System.out.println("Escribe el monto a depositar: ");
                    double montoDepositado = lectura.nextDouble();
                    saldo = saldo + montoDepositado;
                    System.out.println("El saldo actualizado es de: " + saldo);
                    break;
                }
                case 9:{
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;
                }
                default: //Esto funciona como un else pero en un switch
                    System.out.println("Opcion no válida");
            }
        }
    }
}