package br.com.fev02.controller;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class ClienteControllerTest extends DemoApplicationTests {

	private MockMvc mockMcv;

	@Autowired
	private ClienteController clienteController;

	@Before
	public void setUp() {
		this.mockMcv = MockMvcBuilders.standaloneSetup(clienteController).build();
	}

	@Test
	void testarClienteController() throws Exception {
		this.mockMcv.perform(MockMvcRequestBuilders.get("/fev02")).andExpect(MockMvcResultMatchers.status().isOk());

	}

}
