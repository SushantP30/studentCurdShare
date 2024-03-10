package in.sushit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sushit.entity.studentData;

public interface studentRepo extends JpaRepository<studentData, Integer> {

}
