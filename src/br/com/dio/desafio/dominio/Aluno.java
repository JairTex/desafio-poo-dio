package br.com.dio.desafio.dominio;

import java.util.*;

public class Aluno extends Dev{
    private boolean isPro = false;
    
    public Aluno(String nome, String email) {
		setNome(nome);
		setEmail(email);
	}

	public boolean isPro() {
		return isPro;
	}

	public void setPro(boolean isPro) {
		this.isPro = isPro;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(getNome(), aluno.getNome()) 
        		&& Objects.equals(getConteudosInscritos(), aluno.getConteudosInscritos()) 
        		&& Objects.equals(getConteudosInscritos(), aluno.getConteudosConcluidos())
        		&& Objects.equals(isPro(), aluno.isPro());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudosInscritos(), getConteudosInscritos(), isPro());
    }
}
