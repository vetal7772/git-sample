package ua.javarush.task.jdk13.task20.task2007;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.util.Date;

/* 
Серіалізація в JSON
*/
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class Solution {
    public static void main(String[] args) throws IOException {
        Cat cat = new Cat();
        cat.name = "Murka";
        cat.age = 5;
        cat.weight = 3;
        cat.birthDate = new Date();

        System.out.println(convertToJSON(cat));
    }

    public static String convertToJSON(Object object) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        return mapper.writeValueAsString(object);
    }
    @JsonPropertyOrder({"wildAnimal","weight", "birthDate"})
    public static class Cat {

        @JsonProperty("wildAnimal")
        public String name;
        @JsonIgnore
        public int age;
        @JsonProperty("over")
        public int weight;
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss, | dd/MM/YYYY")

        public Date birthDate;

        Cat() {
        }
    }
}
