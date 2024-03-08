package dio.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
	}
//	@Bean
//	public CommandLineRunner run(ConversorJson conversorJson) throws Exception{
//		return args -> {
//			String json = "{\"cep\": \"00000-000\", \"logradouro\": \"Praça\",\"localidade\": \"recife\"}";
//			ViaCepResponse response = conversorJson.converter(json);
//			System.out.println("Dados do CEP: " + response); PARTE DA EXPLICAÇÃO SOBRE BEANS E COMPONENTES
//	};

	@Bean
	public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
		return args ->{
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
		};
	}
}
