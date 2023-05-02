package com.mycompany.mavenproject2;

import java.time.LocalDate;


public class Asistencia {
    private boolean presente;
    private boolean ausente;
    private boolean retiro_anticipado;
    private boolean ausencia_justificada;
    private LocalDate fecha = null; // AAMMDD

    public Asistencia(boolean presente, boolean ausente, boolean retiro_anticipado, boolean ausencia_justificada, LocalDate fecha) {
        this.presente = presente;
        this.ausente = ausente;
        this.retiro_anticipado = retiro_anticipado;
        this.ausencia_justificada = ausencia_justificada;
        this.fecha = fecha;
    }


    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public boolean isAusente() {
        return ausente;
    }

    public void setAusente(boolean ausente) {
        this.ausente = ausente;
    }

    public boolean isRetiro_anticipado() {
        return retiro_anticipado;
    }

    public void setRetiro_anticipado(boolean retiro_anticipado) {
        this.retiro_anticipado = retiro_anticipado;
    }

    public boolean isAusencia_justificada() {
        return ausencia_justificada;
    }

    public void setAusencia_justificada(boolean ausencia_justificada) {
        this.ausencia_justificada = ausencia_justificada;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
    public boolean modificarAsistencia(Alumno alumno,LocalDate fecha,String op){
        Asistencia asist[] = alumno.getAsistencias();
        for (int i = 0; i < asist.length; i++){
            if (asist[i] == null)
                break;
            if (fecha.equals(asist[i].getFecha())){
                if (op.equals("Presente")){
                    asist[i].setPresente(true);
                    asist[i].setAusente(false);
                    asist[i].setAusencia_justificada(false);
                }
                if (op.equals("Ausente")){
                    asist[i].setPresente(false);
                    asist[i].setAusente(true);
                    asist[i].setRetiro_anticipado(false);
                }
                if (op.equals("Retiro Anticipado")){
                    asist[i].setRetiro_anticipado(true);
                    asist[i].setPresente(false);
                    asist[i].setAusente(false);
                    asist[i].setAusencia_justificada(false);
                }
                if (op.equals("Ausencia Justificada")){
                    asist[i].setAusencia_justificada(true);
                    asist[i].setAusente(false);
                    asist[i].setPresente(false);
                    asist[i].setRetiro_anticipado(false);
                }
                return true;
            }
        }
        return false;
    }

}

