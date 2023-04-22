package co.istad.demothymeleaf.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private UUID uuid;
    @NotBlank
    private String author;
    @NotBlank
    private String username;
    @NotBlank
    private String title;
    private String thumbnail;
    private String profile;

}
