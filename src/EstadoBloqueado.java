public class EstadoBloqueado extends Estado {

    public EstadoBloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        telefono.cambiaEstado(new EstadoDesbloqueado(telefono));
        return "desbloquear(): Movil desbloqueado, procede.";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): La camara esta bloqueada. Desbloquea el movil antes.";
    }

    @Override
    public String hacerFoto() {
        return "hacerFoto(): La camara esta bloqueada. Desbloquea el movil antes.";
    }
}
