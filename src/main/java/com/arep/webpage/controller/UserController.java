package com.arep.webpage.controller;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import com.arep.webpage.exceptions.NotFoundException;
import com.arep.webpage.model.Text;
import com.arep.webpage.service.WebPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/webPage")
public class UserController {

    @Autowired
    WebPageService webPageService;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/text", method = RequestMethod.POST)
    public ResponseEntity<Map<String,Integer>> recursoConsultarUsuarioPorCorreo(@RequestBody Text text)
            throws NotFoundException {
        try {
            Map<String,Integer> count= webPageService.consultarFrecuenciaPalabras(text);
            System.out.println(text.getText());
            System.out.println(count.size());
            return new ResponseEntity<>(count, HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new NotFoundException(ex.getMessage());
        }
    }
}
