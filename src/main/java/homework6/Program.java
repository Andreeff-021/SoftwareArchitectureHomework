package homework6;

import homework6.application.ConcreteNoteEditor;
import homework6.application.interfaces.NoteEditor;
import homework6.application.interfaces.NotesDatabaseContext;
import homework6.database.NotesDatabase;
import homework6.domain.Note;
import homework6.infrastructure.persistance.Database;
import homework6.infrastructure.persistance.DatabaseContext;
import homework6.presentation.queries.controllers.NotesController;
import homework6.presentation.queries.views.NotesConsolePresenter;

public class Program {

    /**
     * CQRS
     * @param args
     */
    public static void main(String[] args) {
        Database database = new NotesDatabase();
        NotesDatabaseContext context = new DatabaseContext(database);
        NotesConsolePresenter notesConsolePresenter = new NotesConsolePresenter();
        NoteEditor noteEditor = new ConcreteNoteEditor(notesConsolePresenter, context);

        NotesController notesController = new NotesController(noteEditor);

        notesController.routeGetAll();

        Note note = new Note(21, "title21", "details21");

        notesController.addNote(note);

        notesController.routeGetAll();
    }

}
