package com.arep.webpage.service.impl;

import com.arep.webpage.model.Text;
import com.arep.webpage.service.WebPageService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class WebPageServiceImpl implements WebPageService {


    @Override
    public Map<String, Integer> consultarFrecuenciaPalabras(Text text) {
        Map<String,Integer> count = text.calcNumberOfstrings();
        return count;
    }


}
