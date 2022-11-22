package me.dio.sacola.resources.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class ItemDto {
    private Long produtoId;
    private Integer quantidade;
    private Long sacolaId;
}
