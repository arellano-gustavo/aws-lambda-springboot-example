package my.service.service;

import org.springframework.stereotype.Service;
import my.service.model.Ejemplo;

@Service
public class EjemploServiceImpl implements EjemploService {

    @Override
    public Ejemplo getEjemplo(int id) {
        Ejemplo ejemplo = new Ejemplo(id, "pong Hello, World!", false, 123.45);
        return ejemplo;
    }

}
