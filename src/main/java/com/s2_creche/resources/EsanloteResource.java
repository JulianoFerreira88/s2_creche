package com.s2_creche.resources;

import com.s2_creche.model.entities.Esanlote;
import com.s2_creche.model.repository.EsanloteDao;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/lotes")
public class EsanloteResource {

    @Autowired
    private EsanloteDao dao;

    @GetMapping()
    public List<Esanlote> findAll() {
        Esanlote lote = new Esanlote();
        lote.setFlsituacao("4");
        return dao.findAll(Example.of(lote));
    }

    @GetMapping("/engorda")
    public List<Esanlote> findAllEngorda() {
        Esanlote lote = new Esanlote();
        lote.setFlsituacao("6");
        return dao.findAll(Example.of(lote));
    }

    @GetMapping("/{id}")
    public Esanlote get(@PathVariable String id) {
        return dao.findById(Integer.parseInt(id)).get();
    }

}
