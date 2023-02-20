package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Professor extends Dev{
	private Set<String> stack = new HashSet<>();
	
	public Professor(String nome, String email) {
		setNome(nome);
		setEmail(email);
	}

	public Set<String> getStack() {
		return stack;
	}

	public void setStack(Set<String> stack) {
		this.stack = stack;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor p = (Professor) o;
        return Objects.equals(getNome(), p.getNome()) 
        		&& Objects.equals(getConteudosInscritos(), p.getConteudosInscritos()) 
        		&& Objects.equals(getConteudosInscritos(), p.getConteudosConcluidos())
        		&& Objects.equals(getStack(), p.getStack());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudosInscritos(), getConteudosInscritos(), getStack());
    }
}
