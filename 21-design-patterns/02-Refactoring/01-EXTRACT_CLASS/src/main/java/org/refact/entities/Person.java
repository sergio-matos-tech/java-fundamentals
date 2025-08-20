package org.refact.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person {
    private Long id;
    private String name;
    private TelephoneNumber officeTelephone = new TelephoneNumber();

    public Person() {}

    @Builder
    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getTelephoneNumber() {
        return officeTelephone.getTelephoneNumber();
    }

}
