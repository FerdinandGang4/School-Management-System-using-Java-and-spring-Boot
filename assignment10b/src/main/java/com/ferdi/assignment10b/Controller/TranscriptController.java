package com.ferdi.assignment10b.Controller;

import com.ferdi.assignment10b.Domain.Transcript;
import com.ferdi.assignment10b.Service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transcripts")
public class TranscriptController {
    @Autowired
    TranscriptService transcriptService;

    @PostMapping
    public Transcript createTranscript(@RequestBody Transcript transcript)
    {
        return transcriptService.createTranscript(transcript);
    }

    @GetMapping
    public List<Transcript> getAllTranscript()
    {
        return  transcriptService.getAllTranscript();
    }

    @GetMapping("/{id}")
    public Optional<Transcript> getTranscriptById(@PathVariable Long id)
    {
        return transcriptService.getTranscriptById(id);
    }
}
