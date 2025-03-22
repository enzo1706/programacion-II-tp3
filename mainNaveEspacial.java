public class mainNaveEspacial {
    public static void main(String[] args) {

        naveEspacial apolo = new naveEspacial("Apolo 35", 50);


        apolo.mostrarEstado();
        apolo.avanzar(60);
        apolo.recargarCombustible(40);
        apolo.avanzar(60);
        apolo.mostrarEstado();


    }
}
