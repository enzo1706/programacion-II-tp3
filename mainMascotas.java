public class mainMascotas {
    public static void main(String[] args) {
        RegistroMascotas mascotas = new RegistroMascotas("Toby", "rottwailer", 5);

        mascotas.mostrarInfo();
        System.out.println("-------------------------");
        mascotas.cumplirAnios();
    }
}
