import java.time.LocalDate;

public class Visualizacion {

    private Usuario usuario;
    private Video video;

    private LocalDate fecha;

    public Visualizacion(Usuario usuario,Video video){
        this.usuario = usuario;
        this.video = video;
        this.fecha = LocalDate.now();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Visualizacion{" +
                "usuario=" + usuario +
                ", video=" + video +
                ", fecha=" + fecha +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Visualizacion that = (Visualizacion) o;

        if (!usuario.equals(that.usuario)) return false;
        return video.equals(that.video);
    }
}
