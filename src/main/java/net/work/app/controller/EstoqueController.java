package net.work.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.work.app.model.EstoqueItem;
import net.work.app.repository.EstoqueItemRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api/estoque")
public class EstoqueController {

  @Autowired
  EstoqueItemRepository tutorialRepository;

  @ExceptionHandler
  @ResponseBody
  public ResponseEntity<String> handleException(Exception ex) {
    // TODO: implement global expection handler here
    return ResponseEntity.badRequest().body(ex.getMessage());
  }

  @GetMapping("/all")
  public List<EstoqueItem> getAll() {
    return tutorialRepository.findAll();
  }

  @GetMapping()
  public ResponseEntity<EstoqueItem> getByName(@RequestParam(defaultValue = "nome") String nome) throws Exception {
    System.out.println("Nome: " + nome);
    EstoqueItem item = tutorialRepository.findByNome(nome).orElseThrow(() -> new Exception("not found"));

    return ResponseEntity.ok(item);
  }

  // TODO: implement other endpoints here

}
