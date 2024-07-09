package examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Teste da classe {@link PlataformaEnvio} apresentando cenários de uso do Mockito de retornar Exception em métodos
 * void
 */
@ExtendWith(MockitoExtension.class)
public class PlataformaEnvioTest {
    @Mock
    private PlataformaEnvio plataformaEnvio;

    @Test
    void tentaEnviarEmailEFalha() {
        Mockito.doThrow(IllegalStateException.class)
                .when(plataformaEnvio)
                .enviaEmail(Mockito.any());

        Assertions.assertThrows(IllegalStateException.class, () -> plataformaEnvio.enviaEmail(new Email("teste@teste.org", "Teste", Formato.TEXTO)));
    }
}
