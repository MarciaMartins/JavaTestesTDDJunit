package br.com.caelum.leilao.servico;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.service.Avaliador;

public class AvaliadorTest {
	
	@Test
	public void deveValidarMaiorValorDeLance() {
	
		Usuario joao = new Usuario("Joao");
        Usuario jose = new Usuario("José");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("Playstation 3 Novo");

        leilao.propoe(new Lance(maria,250.0));
        leilao.propoe(new Lance(joao,300.0));
        leilao.propoe(new Lance(jose,400.0));
        
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);
        
        double maiorEsperado = 400;
      
        Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.0001);
	}
	
	
	@Test
	public void deveValidarMenorValorDeLance() {
	
		Usuario joao = new Usuario("Joao");
        Usuario jose = new Usuario("José");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("Playstation 3 Novo");

        leilao.propoe(new Lance(maria,250.0));
        leilao.propoe(new Lance(joao,300.0));
        leilao.propoe(new Lance(jose,400.0));
        
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        double menorEsperado = 250;
        
        Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.0001);
	}
	
	
	@Test
	public void deveValidarMediaValorDeLance() {
	
		Usuario joao = new Usuario("Joao");
        Usuario jose = new Usuario("José");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("Playstation 3 Novo");

        leilao.propoe(new Lance(maria,250.0));
        leilao.propoe(new Lance(joao,300.0));
        leilao.propoe(new Lance(jose,400.0));
        
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        double mediaEsperado = 133.34;
        
        Assert.assertEquals(mediaEsperado, leiloeiro.getMediaLances(), 0.01);
	}

}
