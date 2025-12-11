package com.ferdi.assignment10b.Service;

import com.ferdi.assignment10b.Domain.Transcript;
import com.ferdi.assignment10b.Repository.TranscriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TranscriptIm implements TranscriptService{

    @Autowired
    TranscriptRepository transcriptRepository;
    @Override
    public Transcript createTranscript(Transcript transcript) {
       return transcriptRepository.save(transcript);
    }

    @Override
    public List<Transcript> getAllTranscript() {
        return transcriptRepository.findAll();
    }

    @Override
    public Optional<Transcript> getTranscriptById(Long id) {
        return transcriptRepository.findById(id);
    }
}
