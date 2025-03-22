public class mainGallinas {
    public static void main(String[] args) {

        gallinas gallina1 = new gallinas(1, 2, 0);
        gallinas gallina2 = new gallinas(2, 3, 2);


        gallina1.ponerHuevos();
        gallina2.ponerHuevos();


        gallina1.envejecer();
        gallina2.envejecer();


        System.out.println("\nEstado actualizado de las gallinas:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
    }
