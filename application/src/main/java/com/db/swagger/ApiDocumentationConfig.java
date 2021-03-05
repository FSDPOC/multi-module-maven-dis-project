package com.db.swagger;

import io.swagger.annotations.*;

@SwaggerDefinition(
    info =
        @Info(
            description = "New Resources",
            version = "V12.0.12",
            title = "New Resource API",
            contact =
                @Contact(
                    name = "Raghu ",
                    email = "tmraghu@gmail.com",
                    url = "http://www.gmail.com"),
            license =
                @License(name = "Apache 2.0", url = "http://www.apache.org/licenses/LICENSE-2.0")),
    consumes = {"application/json", "application/xml"},
    produces = {"application/json", "application/xml"},
    schemes = {SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS},
    externalDocs = @ExternalDocs(value = "Read This For Sure", url = "http://gmail.com"))
public interface ApiDocumentationConfig {}
