public class EstadoHacerFoto extends Estado{
    public EstadoHacerFoto(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {return "Movil ya desbloqueado";}

    @Override
    public String abrirCamara() {return "La camara ya la habias abierto";
    }
    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoBloqueado(telefono));
        return "La foto se ha tomado con exito!";
    }
}
