package com.strategies;

import com.strategies.joined_table.JoinedTableService;
import com.strategies.mapped_superclass.MappedSuperClassService;
import com.strategies.single_table.SingleTableService;
import com.strategies.table_per_class.TablePerClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

    private final SingleTableService singleTableService;
    private final TablePerClassService table_per_classService;
    private final JoinedTableService joinedTableService;
    private final MappedSuperClassService mappedSuperClassService;

    @Autowired
    public App(SingleTableService singleTableService, TablePerClassService table_per_classService,
               JoinedTableService joinedTableService, MappedSuperClassService mappedSuperClassService) {
        this.singleTableService = singleTableService;
        this.table_per_classService = table_per_classService;
        this.joinedTableService = joinedTableService;
        this.mappedSuperClassService = mappedSuperClassService;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        GeneralService generalService  = singleTableService;

        generalService.create();

    }
}




