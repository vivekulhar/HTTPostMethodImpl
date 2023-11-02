package dev.vivek.httppostmethodimpl.dev.vivek.bindings;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement
public class TicketResponse {
    private String name;
    private String dob;
    private String gender;
    private String doj;
    private String from;
    private String to;
    private String train;
    private String status;
    private String price;
}
