package org.example.model;

import java.util.Date;

public interface ISchedulable {
    void schedule(Date date, String time);

    default void printByDefault(){
        System.out.println("SCHEDULABLE BY DEFAULT");
        System.out.println("Only available from monday to friday");
    }

}
