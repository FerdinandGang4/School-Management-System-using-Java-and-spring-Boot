package com.ferdi.assignment10b.Repository;

import com.ferdi.assignment10b.Domain.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranscriptRepository extends JpaRepository<Transcript, Long> {
}
