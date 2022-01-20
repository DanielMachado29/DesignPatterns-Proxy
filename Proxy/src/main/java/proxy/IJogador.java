package proxy;

import java.util.List;

public interface IJogador {
    List<String> obterDadosPessoais();
    List<String> obterItens(Administrador administrador);
}
