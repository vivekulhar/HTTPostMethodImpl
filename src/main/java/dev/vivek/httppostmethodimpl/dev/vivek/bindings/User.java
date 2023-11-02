package dev.vivek.httppostmethodimpl.dev.vivek.bindings;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement
public class User {

    private Integer uid;
    private String uname;
    private String lname;
    private String email;

}
