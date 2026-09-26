package uniquindio.edu.co.Collections.Punto9;

import java.util.Stack;

//Navegacion web usando un Stack (LIFO) para recordar las paginas visitadas.
public class NavegacionWeb {
    private Stack<String> historial = new Stack<>();

    //Cada vez que el usuario visita una nueva pagina, se agrega a la pila
    public void visitarPagina(String pagina) {
        historial.push(pagina);
        System.out.println("Visitando: " + pagina);
    }

    //Retrocede a la pagina anterior eliminando la ultima visitada
    public String retroceder() {
        if (historial.isEmpty()) {
            return null;
        }
        return historial.pop();
    }

    public String paginaActual() {
        return historial.isEmpty() ? null : historial.peek();
    }

    public static void main(String[] args) {
        NavegacionWeb navegador = new NavegacionWeb();
        navegador.visitarPagina("google.com");
        navegador.visitarPagina("github.com");
        navegador.visitarPagina("repocitorio");
        System.out.println("Pagina actual: " + navegador.paginaActual());

        System.out.println("Retroceder -> " + navegador.retroceder());
        System.out.println("Retroceder -> " + navegador.retroceder());
        System.out.println("Pagina actual: " + navegador.paginaActual());
    }
}