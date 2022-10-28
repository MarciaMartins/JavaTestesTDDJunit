package br.com.caelum.leilao.service;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;

public class Avaliador {
	
	private double maiorDeTodos = Double.NEGATIVE_INFINITY;
    private double menorDeTodos = Double.POSITIVE_INFINITY;
	private double mediaLances;

    public void avalia(Leilao leilao) {
    	double somaTodosLances = 0;
        for(Lance lance : leilao.getLances()) {
            if(lance.getValor() > maiorDeTodos) maiorDeTodos = lance.getValor();
            if(lance.getValor() < menorDeTodos) menorDeTodos = lance.getValor();
            
            somaTodosLances = lance.getValor();
        }
        if(somaTodosLances>0) {
        	mediaLances = somaTodosLances/leilao.getLances().size();
        }
    }

    public double getMaiorLance() { return maiorDeTodos; }
    public double getMenorLance() { return menorDeTodos; }
    public double getMediaLances() { return mediaLances; }
}

