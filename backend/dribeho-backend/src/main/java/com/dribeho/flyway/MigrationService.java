package com.dribeho.flyway;

import org.flywaydb.core.Flyway;

import javax.inject.Inject;

public class MigrationService {
    @Inject
    Flyway flyway;

    public void checkMigration() {
        System.out.println(flyway.info().current().getVersion().toString());
    }
}
