
package escola.repository;

import escola.model.Sala;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class SalaRepository {

    private final List<Sala> salas = new ArrayList<>();
    private Long proximoId = 1L;

    public List<Sala> listarTodas() {
        return salas;
    }

    public Optional<Sala> buscarPorId(Long id) {
        return salas.stream()
                .filter(sala -> sala.getId().equals(id))
                .findFirst();
    }

    public Sala salvar(Sala sala) {
        if (sala.getId() == null) {
            sala.setId(proximoId++);
            salas.add(sala);
        } else {
            Optional<Sala> salaExistente = buscarPorId(sala.getId());

            if (salaExistente.isPresent()) {
                int indice = salas.indexOf(salaExistente.get());
                salas.set(indice, sala);
            } else {
                salas.add(sala);
            }
        }

        return sala;
    }

    public void excluir(Long id) {
        salas.removeIf(sala -> sala.getId().equals(id));
    }

    public boolean existePorId(Long id) {
        return buscarPorId(id).isPresent();
    }
}
