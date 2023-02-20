package br.com.dio.desafio.dominio;

import java.time.LocalDateTime;

public class Mentoria extends Conteudo{

    private LocalDateTime horario;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }
    
    public Mentoria(String titulo, String descricao, LocalDateTime horario) {
    	this.setTitulo(titulo);
    	this.setDescricao(descricao);
    	this.horario = horario;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setData(LocalDateTime horario) {
        this.horario = horario;
    }
    
    @Override
	public String getCertificado() {
		return "Certificado de participação da mentoria: " + getTitulo();
	}
    
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", horario=" + horario +
                '}';
    }
}
