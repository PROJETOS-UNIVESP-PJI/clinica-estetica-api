package br.com.univesp.clinicaesteticaapi.infrastructure.cors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://127.0.0.1:4200", "http://localhost:4200", "https://projetos-univesp-pji.github.io",
                        "http://projetos-univesp-pji.github.io")
                .allowedMethods("GET", "POST", "DELETE", "PUT");
    }
}
