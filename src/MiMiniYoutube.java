import java.time.LocalDate;

/**
 *
 * @author estefania.martin
 */
public class MiMiniYoutube {
    public static void main(String[] args) {
        Usuario u1 = new Usuario ("email1@gmail.com", 123456789);
        Usuario u2 = new Usuario ("email2@gmail.com", 666666666);
        Usuario u3 = new Usuario ("email3@gmail.com", 666666666);
        Usuario u4 = new Usuario ("email4@gmail.com", 1666666666);
        Usuario u5 = new Usuario ("email5@gmail.com", -3);

        Video v1 = new Video ("https://youtu.be/oWt4_mA86cU", "Cleo y Cuquín");
        Video v2 = new Video ("https://www.youtube.com/live/OIvmbxzLR1o", "Booba");
        Video v3 = new Video ("https://youtu.be/0iwM5uRPVaM", "Bing");
        Video v4 = new Video ("https://youtu.be/2XAvHA4e1zU", "Micky");
        Video v5 = new Video (null, "Peppa Pig");
        Video v6 = new Video ("https://youtu.be/Cuycz7_IPVo", null);
        Video v7 = new Video ("https://youtu.be/h0i92Oc73M4", "Masha");
        Video v8 = new Video ("https://youtu.be/k_9v_WW0D0s", "Steve and Maggie");

        Visualizacion vi1 = new Visualizacion(u1,v1);
        Visualizacion vi2 = new Visualizacion(u2,v1);
        Visualizacion vi3 = new Visualizacion(u3,v2);
        Visualizacion vi4 = new Visualizacion(u4,v2);
        Visualizacion vi5 = new Visualizacion(u5,v3);
        Visualizacion vi6 = new Visualizacion(u1,v3);
        Visualizacion vi7 = new Visualizacion(u1,v4);
        Visualizacion vi8 = new Visualizacion(u1,v5);
        Visualizacion vi9 = new Visualizacion(u1,v6);
        Visualizacion vi10 = new Visualizacion(u2,v7);
        Visualizacion vi11 = new Visualizacion(u2,v8);

        Historial h = new Historial();
        h.anadeVisualizacion(vi1);
        h.anadeVisualizacion(vi2);
        h.anadeVisualizacion(vi3);
        h.anadeVisualizacion(vi4);
        h.anadeVisualizacion(vi5);
        h.anadeVisualizacion(vi6);
        h.anadeVisualizacion(vi7);
        h.anadeVisualizacion(vi8);
        h.anadeVisualizacion(vi9);
        h.anadeVisualizacion(vi10);
        h.anadeVisualizacion(vi11);
        h.anadeVisualizacion(vi1);

        System.out.println("*********************************");
        System.out.println("Datos cargados");
        System.out.println("*********************************");
        h.mostrarHistorico();

        h.borraVisualizacion(vi10);

        System.out.println("*********************************");
        System.out.println("Despues de borrar la primera visualizacion");
        System.out.println("*********************************");
        h.mostrarHistorico();

        h.borraVisualizacion(LocalDate.now());

        System.out.println("*********************************");
        System.out.println("Despues de borrar todos los de hoy");
        System.out.println("*********************************");
        h.mostrarHistorico();

        h.anadeVisualizacion(vi1);
        h.anadeVisualizacion(vi2);
        h.anadeVisualizacion(vi3);
        h.anadeVisualizacion(vi4);
        h.anadeVisualizacion(vi5);
        h.anadeVisualizacion(vi6);
        h.anadeVisualizacion(vi7);
        h.anadeVisualizacion(vi8);
        h.anadeVisualizacion(vi9);
        h.anadeVisualizacion(vi10);
        h.anadeVisualizacion(vi11);
        h.anadeVisualizacion(vi1);

        h.borraHistorial();
        System.out.println("*********************************");
        System.out.println("Despues de borrar todo el histórico");
        System.out.println("*********************************");
        h.mostrarHistorico();

    }

}