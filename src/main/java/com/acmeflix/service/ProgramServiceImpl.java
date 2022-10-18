package com.acmeflix.service;

import com.acmeflix.domain.Program;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProgramServiceImpl implements ProgramService {

    @Override
    public void addRecommendation(final Program program, final Program programRecommendation) {
        program.getProgramRecommendations().add(programRecommendation);
    }


}
