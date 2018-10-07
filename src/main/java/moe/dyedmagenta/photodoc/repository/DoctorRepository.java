package moe.dyedmagenta.photodoc.repository;

import moe.dyedmagenta.photodoc.model.Doctor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DoctorRepository extends ReactiveMongoRepository<Doctor, String> {
}
