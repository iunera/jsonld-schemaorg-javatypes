package com.iunera.jsonldjava.schemaorg.example;

import de.escalon.hypermedia.spring.jackson.HydraMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * Configures Spring MVC to support JSON-LD output.
 */
@Configuration
public class RestConfig implements WebMvcConfigurer {

    /**
     * Adds the HydraMessageConverter for JSON-LD support.
     * @param converters The list of HTTP message converters.
     */
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new HydraMessageConverter());
    }
}
