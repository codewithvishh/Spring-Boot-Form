package in.vishal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import in.vishal.binding.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}

