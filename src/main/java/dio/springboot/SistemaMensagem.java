package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {

    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente financeiro;

    public void enviarConfirmacaoCadastro(){
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado");
    }
    public void enviarMensagemBoasVindas(){
        financeiro.setEmail("teste@teste.com");
        System.out.println(financeiro);
        System.out.println("Bem-vindo a Tech");
    }
}
