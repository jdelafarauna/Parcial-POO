import java.time.LocalDate;

public class Historial{

    private static int MAX_V = 100;
    private Visualizacion[] historial;
    private int ultimo;

    public Historial() {
        this.historial = new Visualizacion[MAX_V]; // Inicializar el array con el tamaño máximo
        this.ultimo = 0; // Inicializar el contador en 0
    }

    public void anadeVisualizacion(Visualizacion v){
        historial[ultimo] = v;
        ultimo++;
    }

    public void borraVisualizacion(Visualizacion v){
        for (int i = 0; i<ultimo; i++){
            if (v.equals(historial[i])){
                for(int k = i; k < ultimo - 1 ; k++){
                    historial[k] = historial[k+1];
                }
            }
        }
        historial[ultimo] = null;
        this.ultimo--;
    }

    public void borraVisualizacion(LocalDate fecha){
        for(int i = 0; i<ultimo; i++){
            if (historial[i].getFecha().equals(fecha)){
                this.borraVisualizacion(historial[i]);
            }
        }
    }

    public void borraHistorial(){
        for(int i = 0; i<ultimo; i++){
            borraVisualizacion(historial[i]);
        }
    }
    public void mostrarHistorico(){

        for(int i = 0; i<ultimo; i++){
            System.out.println(historial[i].toString());
        }

    }
}
