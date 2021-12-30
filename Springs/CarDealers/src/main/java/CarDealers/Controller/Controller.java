package CarDealers.Controller;


import CarDealers.Dealers;
import CarDealers.Services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private Services ser;

    @PostMapping("/add-dealer")
    public void add(@RequestBody Dealers dealer){
        ser.addDealer(dealer);

    }

    @GetMapping("/getAll")
    public List<Dealers> getAll(){
        return ser.getAll();
    }

    @GetMapping("/getDealer/")
    public List<Dealers> getDealer(@RequestParam String name){
        return ser.getDealer(name);
    }

}
