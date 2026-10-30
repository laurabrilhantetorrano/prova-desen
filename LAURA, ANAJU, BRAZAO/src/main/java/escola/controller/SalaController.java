
package escola.controller;

import escola.model.Sala;
import escola.service.SalaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salas")
public class SalaController {

    private final SalaService salaService;

    public SalaController(SalaService salaService) {
        this.salaService = salaService;
    }

    @GetMapping
    public ResponseEntity<List<Sala>> listarTodas() {
        return ResponseEntity.ok(salaService.listarTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sala> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(salaService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Sala> cadastrar(@RequestBody Sala sala) {
        Sala novaSala = salaService.cadastrar(sala);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaSala);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sala> atualizar(
            @PathVariable Long id,
            @RequestBody Sala sala) {
        return ResponseEntity.ok(salaService.atualizar(id, sala));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        salaService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
