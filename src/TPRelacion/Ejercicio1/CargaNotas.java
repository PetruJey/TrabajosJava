package TPRelacion.Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.print("Nombre completo del alumno: ");
            String nombreCompleto = scanner.nextLine();
            System.out.print("Legajo del alumno: ");
            long legajo = scanner.nextLong();
            scanner.nextLine();

            Alumno alumno = new Alumno(nombreCompleto, legajo);

            System.out.print("Cantidad de notas: ");
            int cantidadNotas = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < cantidadNotas; j++) {
                System.out.print("Cátedra: ");
                String catedra = scanner.nextLine();
                System.out.print("Nota: ");
                double notaExamen = scanner.nextDouble();
                scanner.nextLine();
                alumno.agregarNota(new Nota(catedra, notaExamen));
            }

            alumnos.add(alumno);
        }
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
        scanner.close();
    }
}
