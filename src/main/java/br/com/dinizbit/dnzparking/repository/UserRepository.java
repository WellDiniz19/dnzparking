package br.com.dinizbit.dnzparking.repository;

import br.com.dinizbit.dnzparking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}