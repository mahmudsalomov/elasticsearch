package uz.java.maniac.elasticsearch.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.format.annotation.*;
import org.springframework.web.bind.annotation.*;
import uz.java.maniac.elasticsearch.document.Vehicle;
import uz.java.maniac.elasticsearch.search.SearchRequestDTO;
import uz.java.maniac.elasticsearch.service.VehicleService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {
    private final VehicleService service;

    @Autowired
    public VehicleController(VehicleService service) {
        this.service = service;
    }

    @PostMapping
    public void index(@RequestBody final Vehicle vehicle){
        service.index(vehicle);
    }

    @GetMapping("/{id}")
    public Vehicle getById(@PathVariable final String id){
        return service.getById(id);
    }

    @PostMapping("/search")
    public List<Vehicle> search(@RequestBody final SearchRequestDTO dto){
        return service.search(dto);
    }

    @GetMapping("/search/{date}")
    public List<Vehicle> getAllVehiclesCreatedSince(@PathVariable
                                                    @DateTimeFormat(pattern = "yyyy-MM-dd")
                                                    final Date date){
        return service.getAllVehiclesCreatedSince(date);
    }
}
