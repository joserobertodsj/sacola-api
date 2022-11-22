package me.dio.sacola.resources;

import lombok.RequiredArgsConstructor;
import me.dio.sacola.models.Item;
import me.dio.sacola.models.Sacola;
import me.dio.sacola.resources.dtos.ItemDto;
import me.dio.sacola.services.SacolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sacolas")
@RequiredArgsConstructor
public class SacolaResource {


    private final SacolaService sacolaService;



    @PostMapping
    public Item incluirItemNaSacola(@RequestBody ItemDto itemDto){
        return sacolaService.incluirItemNaSacola(itemDto);
    }


    @GetMapping("/{id}")
    public Sacola verSacola(@PathVariable(value = "id") Long id){
        return sacolaService.verSacola(id);
    }


    @PatchMapping("/fecharSacola/{sacolaId}")
    public Sacola fecharSacola(@PathVariable(value = "sacolaId") Long sacolaId,
                               @RequestParam(value = "formaPagamento") int numeroFormaPagamento){
        return sacolaService.fecharSacola(sacolaId, numeroFormaPagamento);
    }
}
