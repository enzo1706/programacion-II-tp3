public class mainEncapsulamiento {
    public static void main(String[] args) {
        encapsulamiento encap = new encapsulamiento("El Principito", "Antoine de Saint-Exupéry", 1934);
        System.out.println("Título: " + encap.getTitulo());
        System.out.println("Autor: " + encap.getAutor());
        System.out.println("Año de publicación: " + encap.getAnioPublicacion());
        encap.setaniopublicacion(1800);
        encap.setaniopublicacion(1980);
        System.out.println("Año de publicación actualizado: " + encap.getAnioPublicacion());

    }
}
