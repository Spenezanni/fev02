package br.com.fev02.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.fev02.model.User;


@AutoConfigureTestDatabase
@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {
	
	@Autowired
	private UserRepository userRepository;

	@Test
	public void buscarUmUsuarioNoBancoDeDados() {
		String nomeUser = "bob";
		Optional<User> user = userRepository.findByNome(nomeUser);
		assertNotNull(user);
		//assertNull(user);
		assertEquals(nomeUser, user.get().getNome());
			
	}
}
