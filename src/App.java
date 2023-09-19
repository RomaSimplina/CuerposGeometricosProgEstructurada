import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int respuesta = 0;
        int contador = 0;
        double a, apiramide;
        double al, at,v, radio;
        double pbase, abase, apotema;
        double longitudlados, altura;
        double abaseM, pbaseM,r,rm;
        do {
            System.out.println("Indique con que figura geometrica desea trabajar");
            System.out.println("1. prisma");
            System.out.println("2.Cilindro");
            System.out.println("3.Piramide");
            System.out.println("4.Cono");
            System.out.println("5.Esfera");
            System.out.println("6.Zona esferica");
            System.out.println("7.Casquete esferico");
            System.out.println("8.Huso esferico y cuña esferica");
            System.out.println("9.Ortoedro");
            System.out.println("10.Tetraedro");
            System.out.println("11.Hexaedro");
            System.out.println("12.Octaedro");
            System.out.println("13.Dodecaedro");
            System.out.println("14.Icosaedro");
            System.out.println("15.Tronco de cono");
            System.out.println("16.Tronco de piramide");
            respuesta = entrada.nextInt();
            contador++;
        } while (respuesta > 12 || respuesta < 0 && contador < 3);

        switch (respuesta) {

            case 1 -> {
                System.out.println("PRISMA");
                int clados;

                System.out.println("Ingrese la cantidad de lados: ");
                clados = entrada.nextInt();

                System.out.println("Ingrese la longitud de los lados");
                longitudlados = entrada.nextDouble();

                System.out.println("Ingrese la altura");
                altura = entrada.nextDouble();

                pbase = clados * longitudlados;
                al = pbase * altura;

                System.out.println("Area lateral: " + al);

                double alfa = (Math.PI / 180) * (380 / clados);
                apotema = longitudlados / (2 * Math.tan((alfa) / 2));
                abase = (pbase * apotema) / 2;
                at = al + abase;

                System.out.println("Area total: " + at);

                v = abase + altura;

                System.out.println("Volumen: " + v);

            }

            case 2 -> {
                System.out.println("CILINDRO");

                double p, h;

                // Area lateral del cilindro

                System.out.println("Ingrese el radio del cilindro: ");
                r = entrada.nextDouble();

                System.out.println("Ingrese la altura del cilindro: ");
                h = entrada.nextDouble();

                p = 2 * Math.PI * r;
                al = p * h;

                System.out.println("Area lateral : " + al);

                // Area total del cilindro
                at = p * (h + r);
                System.out.println("Area total : " + at);

                // Volumen del cilindro
                abase = Math.PI * Math.pow(r, 2);
                v = abase * h;
                System.out.println("Volumen : " + v);

            }

            case 3 -> {
                System.out.println("PIRAMIDE");

                double anchl;

                System.out.println("Ingrese la altura: ");
                altura = entrada.nextDouble();

                System.out.println("Ingrese la longitud de los lados");
                longitudlados = entrada.nextDouble();

                System.out.println("Ingrese la anchura de los lados");
                anchl = entrada.nextDouble();

                pbase = 2 * longitudlados + 2 * anchl;
                apotema = longitudlados / 2;
                apiramide = Math.sqrt(Math.pow(altura, 2)) + Math.pow(apotema, 2);
                al = (pbase * apiramide) / 2;

                System.out.println("Area lateral: " + al);

                at = al + pbase;

                System.out.println("Area total" + at);

                abase = longitudlados / 2;
                v = (abase * altura) / 3;

                System.out.println("Volumen: " + v);

            }

            case 4 -> {
                System.out.println("CONO");

                double g, h;

                System.out.println("Ingrese el radio del cono : ");
                r = entrada.nextDouble();

                System.out.println("Ingrese la generatriz del cono: ");
                g = entrada.nextDouble();

                System.out.println("Ingrese la altura del cono: ");
                h = entrada.nextDouble();

                // Area lateral del cono
                al = Math.PI * r * g;
                System.out.println("Area lateral del cono: " + al);
                // Area total del cono
                abase = Math.PI * Math.pow(r, 2);
                at = al + abase;
                System.out.println("Area total del cono: " + at);

                // Volumen
                v = (abase * h) / 3;
                System.out.println("Volumen del cono: " + v);

            }

            case 5 -> {
                System.out.println("ESFERA");

                System.out.println("Ingrese el radio");
                radio = entrada.nextDouble();
                a = 4 * Math.PI * Math.pow(radio, 2);
                System.out.println("Area de la esfera: " + a);
                v = (4 / 3) * Math.PI * Math.pow(a, 3);
                System.out.println("Volumen de la esfera: " + v);

            }

            case 6 -> {
                System.out.println("ZONA ESFERICA");

                System.out.println("Ingrese la altura");
                altura = entrada.nextDouble();

                System.out.println("Ingrese el radio");
                r = entrada.nextDouble();

                System.out.println("Ingrese el radio mayor");
                rm = entrada.nextDouble();

                a = 2 * Math.PI * rm * altura;

                System.out.println("Area: " + a);

                v = (Math.PI * altura * (Math.pow(altura, 2) + 3 * Math.pow(r, 2) + 3 * Math.pow(rm, 2))) / 6;
                System.out.println("Volumen: " + v);

            }

            case 7 -> {
                System.out.println("CASQUETE ESFERICO");

                System.out.println("Ingrese el radio mayor de la esfera: ");
                rm = entrada.nextDouble();

                System.out.println("Ingrese la altura de la esfera: ");
                altura = entrada.nextDouble();

                // Area
                a = 2 * Math.PI * rm * altura;
                System.out.println("Area: " + a);
                // Volumen
                v = (Math.PI * Math.pow(altura, 2) * (3 * rm - altura)) / 3;
                System.out.println("Volumen: " + v);

            }

            case 8 -> {
                System.out.println("HUSO ESFERICO Y CUÑA ESFERICA");

                double  nGrados;

                System.out.println("Ingrese el radio: ");
                r = entrada.nextDouble();

                System.out.println("Ingrese el numero de grados: ");
                nGrados = entrada.nextDouble();

                // Area
                a = (4 * Math.PI * Math.pow(r, 2) * nGrados) / 360;
                System.out.println("Area: " + a);

                // Volumen
                v = (4 / 3) * ((Math.PI * Math.pow(r, 3)) / 360);
                System.out.println("Volumen: " + v);

            }

            case 9 -> {
                System.out.println("ORTOEDRO");
                double aristas, base, diagonal;

                System.out.println("Ingrese la altura");
                altura = entrada.nextDouble();

                System.out.println("Ingrese la base:");
                base = entrada.nextDouble();

                System.out.println("Ingrese la arista:");
                aristas = entrada.nextDouble();

                a = 2 * (aristas * base + aristas * altura + base * altura);
                System.out.println("Area: " + a);

                diagonal = Math.sqrt(Math.pow(aristas, 2) + Math.pow(base, 2) + Math.pow(altura, 2));
                System.out.println("Diagonal: " + diagonal);

                v = aristas * base * altura;
                System.out.println("Volumen: " + v);

            }

            case 10 -> {
                System.out.println("TETRAEDRO");

                double ar;

                System.out.println("aristas: ");
                ar = entrada.nextDouble();

                // Area(pendiente)
                a = ar * Math.sqrt(3);
                System.out.println("Area: " + a);
                // Volumen(pendiente)
                v = (Math.sqrt(2 / 12)) * Math.pow(ar, 3);
                System.out.println("Volumen: " + v);

            }

            case 11 -> {
                System.out.println("HEXAEDRO");

                double ar;

                System.out.println("Aristas: ");
                ar = entrada.nextDouble();

                // Area
                a = 6 * Math.pow(ar, 2);
                System.out.println("Area: " + a);

                // Volumen
                v = Math.pow(ar, 3);
                System.out.println("Volumen: " + v);

            }

            case 12 -> {
                System.out.println("OCTAEDRO");
                double ar;

                System.out.println("Aristas: ");
                ar = entrada.nextDouble();

                // Area
                a = 2 * Math.pow(ar, 2) * (Math.sqrt(3));
                System.out.println("Area: " + a);

                // Volumen
                v = Math.pow(ar, 3) * (Math.sqrt(2 / 3));
                System.out.println("Volumen: " + v);

            }

            case 13 -> {
                System.out.println("DODECAEDRO");

                double ar;

                System.out.println("Aristas: ");
                ar = entrada.nextDouble();

                // Area
                a = 3 * Math.pow(ar, 3) * (Math.sqrt(25 + 10) * Math.sqrt(5));
                System.out.println("Area: " + a);

                // Volumen
                v = (1 / 4) * (15 + 7 * Math.sqrt(5)) * Math.pow(ar, 3);
                System.out.println("Volumen: " + v);

            }

            case 14 -> {
                System.out.println("ICOSAEDRO");
                double ar;

                System.out.println("Aristas: ");
                ar = entrada.nextDouble();

                // Area(pendiente)
                a = 5 * Math.pow(ar, 2) * Math.sqrt(3);
                System.out.println("Area: " + a);

                // Volumen(pendiente)
                v = (5 / 12) * (3 + Math.sqrt(5)) * Math.pow(ar, 3);
                System.out.println("Volumen : " + v);

            }

            case 15 -> {
                System.out.println("TRONCO DE CONO");

                double g, h;

                System.out.println("Ingrese la altura: ");
                h = entrada.nextDouble();

                System.out.println("ingrese el radio mayor: ");
                rm = entrada.nextDouble();

                System.out.println("Ingrese el radio menor");
                r = entrada.nextDouble();

                System.out.println("Ingrese la generatriz: ");
                g = entrada.nextDouble();

                System.out.println("Area de la base mayor: ");
                abaseM = entrada.nextDouble();

                System.out.println("Area de la base menor");
                abase = entrada.nextDouble();

                // Area lateral
                al = Math.PI * g * (rm + r);
                System.out.println("Area lateral: " + al);

                // Area total(pendiente)
                at = al + abase + abaseM;
                System.out.println("Area total : " + at);

                // Volumen
                v = (1 / 3) * Math.PI * h * (Math.pow(rm, 2) + Math.pow(r, 2) + rm * r);
                System.out.println("Volumen : " + v);

            }

            case 16 -> {
                System.out.println("TRONCO DE PIRAMIDE");

                double longitudMayor, longitudMenor, longitudMayorMitad;

                System.out.println("Ingrese la longitud del lado mayor");
                longitudMayor = entrada.nextDouble();

                System.out.println("Ingrese la longitud del lado menor");
                longitudMenor = entrada.nextDouble();

                System.out.println("Ingrese la altura");
                altura = entrada.nextDouble();

                longitudMayorMitad = longitudMayor / 2;
                apiramide = Math.sqrt(Math.pow(altura, 2) + Math.pow(longitudMayorMitad, 2));
                abaseM = Math.pow(longitudMayor, 2);
                abase = Math.pow(longitudMenor, 2);
                pbaseM = longitudMayor * 4;
                pbase = longitudMenor * 4;
                al = ((pbaseM + pbase) / 2) * apiramide;
                System.out.println("Area lateral: " + al);

                at = al + abase + abaseM;
                System.out.println("Area total: " + at);

                v = ((1 / 3) * altura * (abaseM + abase + Math.sqrt(abase * abaseM)));
                System.out.println("Volumen: " + v);

            }
        }

        entrada.close();
    }
}
