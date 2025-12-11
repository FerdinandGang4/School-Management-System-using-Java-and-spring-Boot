package com.ferdi.assignment10b.Service;

import com.ferdi.assignment10b.Domain.Transcript;

import java.util.List;
import java.util.Optional;

public interface TranscriptService {
    public Transcript createTranscript(Transcript transcript);
    public List<Transcript> getAllTranscript();
    public Optional<Transcript> getTranscriptById(Long id);
}
