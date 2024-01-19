package br.com.dinizbit.dnzparking.service;

import br.com.dinizbit.dnzparking.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

}
