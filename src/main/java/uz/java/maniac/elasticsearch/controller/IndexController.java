package uz.java.maniac.elasticsearch.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.java.maniac.elasticsearch.service.IndexService;

@RestController
@RequestMapping("/api/index")
public class IndexController {
    private final IndexService service;

    public IndexController(IndexService service) {
        this.service = service;
    }

    @PostMapping("/recreate")
    public void recreateAllIndices(){
        service.recreateIndices(true);
    }
}
