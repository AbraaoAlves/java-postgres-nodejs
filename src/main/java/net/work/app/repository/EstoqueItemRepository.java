package net.work.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.work.app.model.EstoqueItem;

@Repository
public interface EstoqueItemRepository extends JpaRepository<EstoqueItem, Long>{
  
  public Optional<EstoqueItem> findByNome(String nome); 
}
