package com.company.service;

import jakarta.enterprise.context.ApplicationScoped;
import io.quarkus.qute.Template;
import jakarta.inject.Inject;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.core.Response;
import java.net.URI;

@ApplicationScoped
public class CandidateService {

    @Inject
    Template index;  // Injetando o template index.html

    public TemplateInstance getHomePage() {
        // Certifique-se de que está retornando a instância do template corretamente
        return index.instance();
    }

    public Response getLinkedInRedirect() {
        // Retornar um redirecionamento HTTP para o LinkedIn
        return Response.status(Response.Status.FOUND)
                .location(URI.create("https://www.linkedin.com"))
                .build();
    }

    public Response getEmailRedirect() {
        // Retornar um redirecionamento HTTP para o e-mail
        return Response.status(Response.Status.FOUND)
                .location(URI.create("mailto:example@example.com"))
                .build();
    }
}
