package br.orange.transacoes.Transacao.Repository;

import br.orange.transacoes.Transacao.Models.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransacaoRepository extends JpaRepository <Transacao,String> {
    List<Transacao> findFirst10ByCartaoIdOrderByEfetivadaDesc(String id);
}
