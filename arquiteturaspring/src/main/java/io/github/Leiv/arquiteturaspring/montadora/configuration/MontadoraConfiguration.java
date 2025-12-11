package io.github.Leiv.arquiteturaspring.montadora.configuration;

import io.github.Leiv.arquiteturaspring.montadora.Motor;
import io.github.Leiv.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    @Primary
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("jeep-Compass");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(150);
        motor.setCilindros(8);
        motor.setModelo("CAMARO");
        motor.setLitragem(2.8);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name="motorTurbo")
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindros(3);
        motor.setModelo("CORVETE");
        motor.setLitragem(1.5);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }


}
