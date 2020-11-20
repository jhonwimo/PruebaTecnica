package com.agencianacional.notas.service;

import com.agencianacional.notas.exception.NotaNoEncontradaException;
import com.agencianacional.notas.model.dto.NotaDTO;
import com.agencianacional.notas.model.entity.Nota;
import com.agencianacional.notas.repository.NotaRepository;
import com.agencianacional.notas.service.sd.NotaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NotaServiceImpl implements NotaService {

    @Autowired
    private NotaRepository notaRepository;

    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public NotaDTO save(NotaDTO notaDTO) {
        return modelMapper.map(notaRepository.save(modelMapper.map(notaDTO, Nota.class)), NotaDTO.class);
    }

    @Override
    public List<NotaDTO> getAll() {
        return notaRepository.findAll().stream().map(nota -> modelMapper.map(nota, NotaDTO.class)).collect(Collectors.toList());
    }

    @Override
    public NotaDTO update(NotaDTO notaDTO, Long id) {
        notaRepository.findById(id).orElseThrow(() -> new NotaNoEncontradaException("La nota no se encontro"));
        notaDTO.setId(id);
        return modelMapper.map(notaRepository.save(modelMapper.map(notaDTO, Nota.class)), NotaDTO.class);
    }
}
