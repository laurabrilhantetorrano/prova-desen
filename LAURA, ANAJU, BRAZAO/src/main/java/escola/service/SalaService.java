
package escola.service;

import escola.model.Sala;
import escola.repository.SalaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {

    private final SalaRepository salaRepository;

    public SalaService(SalaRepository salaRepository) {
        this.salaRepository = salaRepository;
    }

    public List<Sala> listarTodas() {
        return salaRepository.listarTodas();
    }

    public Sala buscarPorId(Long id) {
        return salaRepository.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Sala não encontrada"));
    }

    public Sala cadastrar(Sala sala) {
        if (sala.getNome() == null || sala.getNome().isBlank()) {
            throw new IllegalArgumentException("O nome da sala é obrigatório");
        }

        if (sala.getCapacidade() == null || sala.getCapacidade() <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser maior que zero");
        }

        return salaRepository.salvar(sala);
    }

    public Sala atualizar(Long id, Sala sala) {
        Sala salaExistente = buscarPorId(id);

        if (sala.getNome() == null || sala.getNome().isBlank()) {
            throw new IllegalArgumentException("O nome da sala é obrigatório");
        }

        if (sala.getCapacidade() == null || sala.getCapacidade() <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser maior que zero");
        }

        salaExistente.setNome(sala.getNome());
        salaExistente.setCapacidade(sala.getCapacidade());

        return salaRepository.salvar(salaExistente);
    }

    public void excluir(Long id) {
        buscarPorId(id);
        salaRepository.excluir(id);
    }
}
