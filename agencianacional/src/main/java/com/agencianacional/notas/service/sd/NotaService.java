package com.agencianacional.notas.service.sd;

import com.agencianacional.notas.model.dto.NotaDTO;

import java.util.List;

public interface NotaService {

    public NotaDTO save(NotaDTO notaDTO);

    public List<NotaDTO> getAll();

    public NotaDTO update(NotaDTO notaDTO, Long id);
}
