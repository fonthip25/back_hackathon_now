package ac.th.fearfreeanimals.repository;

import ac.th.fearfreeanimals.entity.GameProgress;
import ac.th.fearfreeanimals.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GameProgressRepository extends JpaRepository<GameProgress, Long> {
    Optional<GameProgress> findByUserId(Long userId);

    Optional<GameProgress> findByUserIdAndAnimalType(Long userId, String animalType);

    List<GameProgress> findByUser(User user); 
}
