package me.dio.sacola.services;

import me.dio.sacola.models.Item;
import me.dio.sacola.models.Sacola;
import me.dio.sacola.resources.dtos.ItemDto;

public interface SacolaService {
    Item incluirItemNaSacola(ItemDto itemDto);
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagamento);
}
