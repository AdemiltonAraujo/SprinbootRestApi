package curso.api.rest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
//passando para o sprig boot o pacote que esta as classes modelos para criara as tabelas automatica

@EntityScan(basePackages = {"curso.api.rest.model"})

//anotaçao para o spring controlar todos nossos objetos, configura todo nosso projeto
@ComponentScan(basePackages = {"Curso.*"})

//PARTE DE PERCISTENCIA DO JPA para interagir com o banco dedados
@EnableJpaRepositories(basePackages = {"curso.api.rest.repositoy"})

//abilitar a gerencia de trasação do banco de dados

@EnableTransactionManagement

//abilitar a parte de mvc

@EnableWebMvc

//ABILITANDO OS REST CONTROLLER PARA TRABALHAMOS COM APIS REST

@RestController

//PARA ATIVAR TODAS AS CONFIGURAÇÕES

@EnableAutoConfiguration

//TODOS ESSES PASSOS ACIMA E NECESSARIO PARA O BROJETO SPRING RODAR EM QUALQUER ARQUITETURA
//TESTE

public class CursospringresapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursospringresapiApplication.class, args);
	}

}
