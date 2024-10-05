public class EstadoCamaraAbierta extends Estado {
    public EstadoCamaraAbierta(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquear(): YA ESTABA DESBLOQUEADO EL MOVIL!!!";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): LA CAMARA YA ESTA ABIERTA";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoHacerFoto(telefono));
        return "hacerFoto(): La foto se va a disparar ahora...";
    }
}
