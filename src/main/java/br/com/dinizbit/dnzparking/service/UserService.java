package br.com.dinizbit.dnzparking.service;

import br.com.dinizbit.dnzparking.entity.User;
import br.com.dinizbit.dnzparking.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public User save(User user) {
        return userRepository.save(user);
    }

    @Transactional(readOnly = true)
    public User searchById(Long user_id) {
      return userRepository.findById(user_id).orElseThrow(
              () -> new RuntimeException("User not found.")
      );
    }
}
