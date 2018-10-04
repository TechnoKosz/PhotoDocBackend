package moe.dyedmagenta.photodoc.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "examination")
public class Examination {

    @Id
    private Long id;

    private String name;

    //    TODO: Find out text object for mongo
    private String description;

    //    TODO: Status

    private Patient patient;

}
