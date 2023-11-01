package homework6.database;

import homework6.infrastructure.persistance.Database;

import java.util.Collection;

public class NotesDatabase implements Database {

    private NotesTable notesTable = new NotesTable();


    public NotesTable getNotesTable() {
        return notesTable;
    }

    @Override
    public void save() {
        notesTable.saveRecord();
    }

}
