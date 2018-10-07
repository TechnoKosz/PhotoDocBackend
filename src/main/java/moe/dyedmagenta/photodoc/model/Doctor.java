package moe.dyedmagenta.photodoc.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "doctor")
public class Doctor {

    @Id
    private Long id;

    private List<Examination> examinations;

    //PersonalData
    private String firstName;

    private String lastName;
}
