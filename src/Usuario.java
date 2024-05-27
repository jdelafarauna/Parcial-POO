public class Usuario {

    private static int MIN = 100000000;

    private static int MAX = 999999999;
    private static int NODEFINIDO = -1;


    private String correo;
    private int telefono;

    public Usuario(String correo, int telefono){
        this.correo = correo;
        this.telefono = (telefono < MAX && telefono > MIN) ? telefono : NODEFINIDO;
    }

    public Usuario(String correo){
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "correo='" + correo + '\'' +
                ", telefono=" + telefono +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        if (telefono != usuario.telefono) return false;
        return correo.equals(usuario.correo);
    }

}
