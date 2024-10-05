public class Telefono {
    public Estado estado;

    public Telefono(){
        estado = new EstadoBloqueado(this);
    }
    public void cambiaEstado(Estado estado) {
        System.out.println("El estado inicial es: " + this.estado.getClass().getName());
        this.estado = estado;
        System.out.println("El estado final es: " + this.estado.getClass().getName());
    }
    public Estado getEstado() {
        return estado;
    }
}
