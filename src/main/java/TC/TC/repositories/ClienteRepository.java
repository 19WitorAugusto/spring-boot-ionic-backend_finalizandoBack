package TC.TC.repositories;

import TC.TC.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	@Transactional(readOnly = true)// não precisa ser envolvida em uma transação de BD
	Cliente findByEmail(String email);
}
