package org.app.bipiumSearchDevice.models.catalogs;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Map;

@Getter
@ToString// надо проверить, что выдает то же, что и у тебя
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Catalog {
    String name;
    int id;
    Map<String, String> fieldsValues;

/*    public Catalog(String name, int id, Map<String, String> fieldsValues) {
        this.name = name;
        this.id = id;
        this.fieldsValues = fieldsValues;
    }*/

/*    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getFieldsValues() {
        return fieldsValues;
    }*/

/*    @Override
    public String toString() {
        return "Catalog{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", fieldsValues=" + fieldsValues +
                '}';
    }*/
}
