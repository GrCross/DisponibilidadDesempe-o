package com.arep.webpage.service;


import com.arep.webpage.model.Text;
import java.util.List;
import java.util.Map;

/**
 * La clase SchiNotesService representa los servicios que se pueden ofrecer.
 */
public interface WebPageService {


    public Map<String,Integer> consultarFrecuenciaPalabras(Text text);



}
