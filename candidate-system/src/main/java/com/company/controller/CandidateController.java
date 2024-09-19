package com.company.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import com.company.service.CandidateService;
import io.quarkus.qute.TemplateInstance;

@Path("/candidate")
public class CandidateController {

    @Inject
    CandidateService candidateService;

    @GET
    @Path("/linkedin")
    @Produces(MediaType.TEXT_HTML)
    public Response redirectToLinkedIn() {
        return candidateService.getLinkedInRedirect();  // Agora retorna Response
    }

    @GET
    @Path("/email")
    @Produces(MediaType.TEXT_HTML)
    public Response sendCVByEmail() {
        return candidateService.getEmailRedirect();  // Agora retorna Response
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String homePage() {
        return candidateService.getHomePage().render();  // Mantém o uso de render() para a página inicial
    }
}
