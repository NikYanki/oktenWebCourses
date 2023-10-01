package homework2.task1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;
}
