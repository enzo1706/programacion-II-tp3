import java.time.Year;

public class encapsulamiento {
    private String titulo;
    private String autor;
    private Integer anioPublicacion;

    public encapsulamiento(String titulo, String autor, Integer anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setaniopublicacion(anioPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }


    public String getAutor() {
        return autor;
    }


    public Integer getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setaniopublicacion(int nuevoAnio) {
        int anioActual = Year.now().getValue();
        if (nuevoAnio >= 1900 && nuevoAnio <= anioActual) {
            this.anioPublicacion = nuevoAnio;
        } else {
            System.out.println("Error, el año de publicacion debe estar entre 1900 y " + anioActual);
        }
    }
}
