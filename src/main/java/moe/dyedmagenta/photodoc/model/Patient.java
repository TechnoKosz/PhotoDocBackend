package moe.dyedmagenta.photodoc.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "patient")
public class Patient {

    @Id
    private Long id;

    // PersonalData
    private String firstName;

    private String lastName;
}
