package main.controller;

import java.util.ArrayList;

import main.model.Conta;

public class GerenciaContas {
	public ArrayList<Conta> contas;
	
	public GerenciaContas() {
		contas = new ArrayList<>();
	}
	
	public boolean adicionarConta(Conta c) {
		boolean resultado = contas.add(c);
		return resultado;
	}
	
	public String buscarConta(int numero) {
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getNumero() == numero) {
				return contas.get(i).toString();
			}
		}
		return "Conta não encontrada";
	}
	
	private int posicao(int numero) {
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getNumero() == numero) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean depositar(int numero, double deposito) {
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getNumero() == numero) {
				boolean resultado = contas.get(i).depositar(deposito);
				return resultado;
			}
		}
		return false;
	}
	
	public boolean sacar(int numero, double sac) {
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getNumero() == numero) {
				boolean resultado = contas.get(i).sacar(sac);
				return resultado;
			}
		}
		return false;
	}
	public boolean removerConta(int numero) {
		int posicao = posicao(numero);
		if (posicao >= 0) {
			if (contas.remove(posicao) != null) {
				return true;
			}
		}
		return false;
	}
}
