import com.aluracursos.screenmatch.modelos.pelicula;
import com.aluracursos.screenmatch.modelos.serie;

public class Principal {
    
    public static void main(String[] args) {
        pelicula miPelicula = new pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionDeMinutos(140);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.nuestraFichaTecnica();
        miPelicula.evalua(8);
        miPelicula.evalua(10);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());



 serie casaDragon = new serie();
 casaDragon.setNombre("La casa del dragon");
 casaDragon.setFechaDeLanzamiento(2022);
 casaDragon.setTemporadas(1);
 casaDragon.setMinutosPorEpisodio(50);
 casaDragon.setEpisodiosPorTemporada(10);
        System.out.println(casaDragon.getDuracionDeMinutos());





//        com.aluracursos.screenmatch.modelos.pelicula otraPelicula = new com.aluracursos.screenmatch.modelos.pelicula();
//        otraPelicula.nombre = "La barbie";
//        otraPelicula.fechaDeLanzamiento = 2023;
//        otraPelicula.duracionDeMinutos = 120;

        //otraPelicula.nuestraFichaTecnica();
    }
}
