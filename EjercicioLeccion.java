public class EjercicioLeccion {
    private String id;
    private String enunciado;
    private String respuestaCorrecta;
    private int puntosXP;

    public EjercicioLeccion(String id, String enunciado, String respuestaCorrecta, int puntosXP) {
        this.id = id;
        this.enunciado = enunciado;
        this.respuestaCorrecta = respuestaCorrecta;
        this.puntosXP = puntosXP;
    }

    public boolean validarRespuesta(String respuestaUsuario) {
        return this.respuestaCorrecta.equalsIgnoreCase(respuestaUsuario);
    }

    public int getPuntosXP() {
        return puntosXP;
    }
}