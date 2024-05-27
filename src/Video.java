public class Video {
    private static int nextId = 100000;
    private String url;
    private String titulo;
    private int id;

    public Video(String url, String titulo){
        this.url = url;
        this.titulo = titulo;
        this.id = nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Video.nextId = nextId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Video{" +
                "url='" + url + '\'' +
                ", titulo='" + titulo + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Video video = (Video) o;

        return (id != video.id) ;

    }

}
