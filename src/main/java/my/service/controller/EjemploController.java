package my.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import my.service.model.Ejemplo;
import my.service.service.EjemploService;

@RestController
@EnableWebMvc
public class EjemploController {
    @Autowired
    private EjemploService ejemploService;

    @GetMapping(path = "/prueba", produces = "application/json; charset=utf-8")
    public Ejemplo ping(@RequestParam int id) {
        Ejemplo ej = ejemploService.getEjemplo(id);
        return ej;
    }

}

/*

  https://aws.amazon.com/es/blogs/opensource/java-apis-aws-lambda/
  
  

mvn clean package
aws cloudformation package --template-file sam.yaml --output-template-file output-sam.yaml --s3-bucket ultra-media
aws cloudformation deploy  --template-file output-sam.yaml --stack-name ServerlessSpringbootApi --capabilities CAPABILITY_IAM
aws cloudformation describe-stacks --stack-name ServerlessSpringbootApi --query 'Stacks[0].Outputs[*].{Service:OutputKey,Endpoint:OutputValue}'
curl -s https://s7539ax3bd.execute-api.us-east-1.amazonaws.com/Prod/prueba?id=97

*/
