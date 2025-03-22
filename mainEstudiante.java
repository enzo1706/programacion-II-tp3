public class mainEstudiante {
    public class Main {
        public static void main(String[] args) {

            Estudiante estudiante1 = new Estudiante("Enzo", "Dengra", "Programacion", 8.50);

            estudiante1.mostrarInfo();

            estudiante1.subirCalificacion(5.0);
            System.out.println("Calificacion: "+estudiante1.getCalificacion());

            estudiante1.bajarCalificacion(4.5);
            System.out.println("Calificacion: "+estudiante1.getCalificacion());

        }
    }
}
