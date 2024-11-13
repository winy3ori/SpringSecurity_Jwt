package example.springjwt.service;

import example.springjwt.dto.JoinDTO;
import org.springframework.stereotype.Service;

@Service
public interface JoinService {
    void joinProcess(JoinDTO joinDTO);
}
