package br.org.generation.lojadegames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.lojadegames.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	public List<Produto> findAllByPlataformaContainingIgnoreCase(String plataforma);

	// busca valores maiores que o critério de consulta em ordem crescente
	public List<Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);

	// busca valores menores que o critério de consulta em ordem decrescente
	public List<Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);

}
