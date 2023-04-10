module com.example.vulnerableapp_gradle {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires spring.context;
    requires spring.core;
    requires spring.web;
    requires org.apache.commons.io;
    requires org.apache.commons.text;
    requires org.apache.logging.log4j;
    requires java.xml;
    requires java.xml.bind;
    requires javax.servlet.api;
    requires java.persistence;
    requires spring.data.commons;
    requires spring.beans;
    requires spring.jdbc;
    requires java.sql;
    requires com.nimbusds.jose.jwt;
    requires org.json;
    requires facade.schema;
    requires org.apache.commons.lang3;


    opens com.example.vulnerableapp_gradle to javafx.fxml;
    exports com.example.vulnerableapp_gradle;
}