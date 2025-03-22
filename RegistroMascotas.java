public class RegistroMascotas {
    private String nombre;
    private String especie;
    private Integer edad;

    public RegistroMascotas(String nombre, String especie, Integer edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void mostrarInfo(){
        System.out.println("Nombre de la mascota: "+ nombre + "\n Especie: " + especie + "\n Edad: " +edad);
    }

    public void cumplirAnios(){
        edad ++;
        System.out.println("La edad de " + nombre + " ahora es: " + edad);
        mostrarInfo();
    }
}
