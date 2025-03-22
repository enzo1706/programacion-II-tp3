public class gallinas {
    private Integer IdGallina;
    private Integer edad;
    private Integer huevosPuestos;

    public gallinas(Integer idGallina, Integer edad, Integer huevosPuestos) {
        this.IdGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public void envejecer(){
        edad ++;
        System.out.println("La gallina " + IdGallina + "ha envejecido. Nueva edad: " + edad);
    }

    public void ponerHuevos(){
        huevosPuestos ++;
        System.out.println("La gallina " + IdGallina + " ha puesto un huevo");
    }

    public void mostrarEstado(){
        System.out.println("Id de la gallina: " + IdGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
    }



}
